package book.dao;

import static book.dao.ConnectionInfo.DRIVER;
import static book.dao.ConnectionInfo.PASSWORD;
import static book.dao.ConnectionInfo.URL;
import static book.dao.ConnectionInfo.USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;


public class JdbcBookShelf implements BookShelf {
	// 커넥션 정보 : ConncectionInfo의 static 필드로 사용

	// 생성자
	public JdbcBookShelf() {
		// 1. 드라이버 로드
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 오류!" + e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public int add(Book book) throws DuplicateException {
		// 필요한 변수들 먼저 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Book> books = new ArrayList<>();
		int count = 0;

		if (!isExists(book)) {
			try {
				// 2. 커넥션 맺기
				conn = DriverManager.getConnection(URL, USER, PASSWORD);

				// 3. 쿼리 준비
				String sql = "INSERT INTO BOOK(SEQUENCE, ISBN, TITLE, AUTHOR, COMPANY, TOTAL_PAGE, PRICE, QUANTITY)" 
						+ "	  VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, book.getSequence());
				pstmt.setString(2, book.getIsbn());
				pstmt.setString(3, book.getTitle());
				pstmt.setString(4, book.getAuthor());
				pstmt.setString(5, book.getCompany());
				pstmt.setInt(6, book.getTotalPage());
				pstmt.setInt(7, book.getPrice());
				pstmt.setInt(8, book.getQuantity());
				
				books.add(book);

				// 4. 쿼리 실행 : ?가 사전에 모두 매핑된 pstmt 객체를 통해서 쿼리 실행
				int addCnt = pstmt.executeUpdate();

				// 5. DML 결과 처리 : executeUpdate()를 통해서 몇 건의 데이터가 처리되었는지를 나타내는 정수 리턴값으로 처리 가능
				if (addCnt > 0) {
					System.out.printf("%d 행이 입력되었습니다.%n", addCnt);
					count++;
				}
			} catch (SQLException e) {
				System.err.println("SQL 구문 오류!" + e.getMessage());
				e.printStackTrace();
			} finally {
				// 6. 자원 해제
				try {
					if (pstmt != null) {
						pstmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					System.err.println("자원해제 오류!" + e.getMessage());
					e.printStackTrace();
				}
			}
		} else {
			throw new DuplicateException("add", book);
		}
		return count;
	}

	@Override
	public int set(Book book) throws NotFoundException {
		// 필요한 변수들 먼저 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Book> books = new ArrayList<>();
		int count = 0;

		if (isExists(book)) {
			try {
				// 2. 커넥션 맺기
				conn = DriverManager.getConnection(URL, USER, PASSWORD);

				// 3. 쿼리 준비
				String sql = "UPDATE BOOK b"
						+ "		 SET b.price = ?"
						+ "    	   , b.quantity = ?"
						+ " WHERE b.sequence = ?";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, book.getPrice());
				pstmt.setInt(2, book.getQuantity());
				pstmt.setInt(3, book.getSequence());

				// 4. 쿼리 실행 : ?가 사전에 모두 매핑된 pstmt 객체를 통해서 쿼리 실행
				int UpdCnt = pstmt.executeUpdate();
				count++;

				// 5. DML 결과 처리 : executeUpdate()를 통해서 몇 건의 데이터가 처리되었는지를 나타내는 정수 리턴값으로 처리 가능
				if (UpdCnt > 0) {
					System.out.printf("%d 행이 수정되었습니다.%n", UpdCnt);
				}
			} catch (SQLException e) {
				System.err.println("SQL 구문 오류!" + e.getMessage());
				e.printStackTrace();
			} finally {
				// 6. 자원 해제
				try {
					if (pstmt != null) {
						pstmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					System.err.println("자원해제 오류!" + e.getMessage());
					e.printStackTrace();
				}
			}
		} else {
			throw new NotFoundException("set", book);
		}
		return count;
	}

	@Override
	public int remove(Book book) throws NotFoundException {
		// 필요한 변수들 먼저 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		List<Book> books = new ArrayList<>();
		int count = 0;
	
		try {
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
			// 3. 쿼리 준비
			String sql = "DELETE BOOK b"
					+   " WHERE b.sequence = ?";
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setInt(1, book.getSequence());
		
			// 4. 쿼리 실행 : ?가 사전에 모두 매핑된 pstmt 객체를 통해서 쿼리 실행
			int rmCnt = pstmt.executeUpdate();
			count++;
		
			// 5. DML 결과 처리 : executeUpdate()를 통해서 몇 건의 데이터가 처리되었는지를 나타내는 정수 리턴값으로 처리 가능
			if(rmCnt > 0) {
				System.out.printf("%d 행이 삭제되었습니다.%n", rmCnt);
			}
		} catch (SQLException e){
			System.err.println("SQL 구문 오류!" + e.getMessage());
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}
		return count;
}

	@Override
	public Book get(Book book) throws NotFoundException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		Book findBook = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "SELECT b.sequence" 
					+ "		   , b.isbn"
					+ "		   , b.title"
					+ "		   , b.author"
					+ "		   , b.company"
					+ "		   , b.total_page"
					+ "		   , b.price"
					+ "		   , b.quantity"
					+ "		FROM Book b"
					+ "    WHERE b.sequence = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, book.getSequence());
			
			result = pstmt.executeQuery();
			
			while(result.next()) {
				int sequence = result.getInt(1);
				String isbn = result.getString(2);
				String title = result.getString(3);
				String author = result.getString(4);
				String company = result.getString(5);
				int total_Page = result.getInt(6);
				int price = result.getInt(7);
				int quantity = result.getInt(8);
				
				if(sequence == book.getSequence()) {
					findBook = new Book(sequence, isbn, title, author, company, total_Page, price, quantity);
					break;
				} else {
					throw new NotFoundException("get", book);
				}
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}
		return findBook;
	}

	@Override
	public List<Book> getAllBooks() {
		// 필요한 변수들 먼저 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		List<Book> books = new ArrayList<>();
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT b.sequence\r\n" + 
					"     	   , b.isbn\r\n" + 
					"     	   , b.title\r\n" + 
					"     	   , b.author\r\n" + 
					"     	   , b.company\r\n" + 
					"     	   , b.total_page\r\n" + 
					"     	   , b.price\r\n" + 
					"     	   , b.quantity\r\n" + 
					"  		FROM book b" +
					"	   ORDER BY b.sequence";
			pstmt = conn.prepareStatement(sql);
			
			
			// 4. 쿼리 실행 : ?가 사전에 모두 매핑된 pstmt 객체를 통해서 쿼리 실행
			result = pstmt.executeQuery();
			
			// 5. DQL 결과 처리
			while (result.next()) {
				int sequence = result.getInt(1);
				String isbn = result.getString(2);
				String title = result.getString(3);
				String author = result.getString(4);
				String company = result.getString(5);
				int total_Page = result.getInt(6);
				int price = result.getInt(7);
				int quantity = result.getInt(8);
				
				// 각 변수의 값으로 Book 클래스 인스턴스 포장
				Book book = new Book();
				book.setSequence(sequence);
				book.setIsbn(isbn);
				book.setTitle(title);
				book.setAuthor(author);
				book.setCompany(company);
				book.setTotalPage(total_Page);
				book.setPrice(price);
				book.setQuantity(quantity);
				
				books.add(book);
					
			}
		} catch (SQLException e){
			System.err.println("SQL 구문 오류!" + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 오류!" + e.getMessage());
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}	
		
		return books;
	}

	private boolean isExists(Book book) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		boolean exists = false;
	
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "SELECT b.sequence"
					+ "		FROM BOOK b"
					+ "    WHERE b.sequence = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, book.getSequence());
				
			result = pstmt.executeQuery();
			
			while (result.next()) {
				int sequence = result.getInt(1);
				if(sequence == book.getSequence()) {
					exists = true;
					break;
				}	
			}
		} catch (SQLException e) {
			System.err.println("자원해제 오류!" + e.getMessage());
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}	
		return exists;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		List<Book> books = new ArrayList<>();
		 
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "SELECT b.sequence" 
					+ "		   , b.isbn"
					+ "		   , b.title"
					+ "		   , b.author"
					+ "		   , b.company"
					+ "		   , b.total_page"
					+ "		   , b.price"
					+ "		   , b.quantity"
					+ "		FROM Book b"
					+ "    WHERE b.title LIKE '%"+ title + "%'";
			
			pstmt = conn.prepareStatement(sql);
			
			result = pstmt.executeQuery();
			
			while(result.next()) {
				int sequence = result.getInt(1);
				String isbn = result.getString(2);
				String b_title = result.getString(3);
				String author = result.getString(4);
				String company = result.getString(5);
				int total_Page = result.getInt(6);
				int price = result.getInt(7);
				int quantity = result.getInt(8);
				
				// 각 변수의 값으로 Book 클래스 인스턴스 포장
				Book book = new Book();
				book.setSequence(sequence);
				book.setIsbn(isbn);
				book.setTitle(b_title);
				book.setAuthor(author);
				book.setCompany(company);
				book.setTotalPage(total_Page);
				book.setPrice(price);
				book.setQuantity(quantity);
				
				books.add(book);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}
		return books;
	}

	@Override
	public List<Book> getBooksByPrice(int min, int max) {
		// SEELCT price min ~ max 사이인 책 검색 = BETWEEN ~ AND
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		List<Book> books = new ArrayList<>();
		 
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "SELECT b.sequence" 
					+ "		   , b.isbn"
					+ "		   , b.title"
					+ "		   , b.author"
					+ "		   , b.company"
					+ "		   , b.total_page"
					+ "		   , b.price"
					+ "		   , b.quantity"
					+ "		FROM Book b"
					+ "    WHERE b.price between ? and ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, min);
			pstmt.setInt(2, max);
			
			result = pstmt.executeQuery();
			
			while(result.next()) {
				int sequence = result.getInt(1);
				String isbn = result.getString(2);
				String b_title = result.getString(3);
				String author = result.getString(4);
				String company = result.getString(5);
				int total_Page = result.getInt(6);
				int price = result.getInt(7);
				int quantity = result.getInt(8);
				
				// 각 변수의 값으로 Book 클래스 인스턴스 포장
				Book book = new Book();
				book.setSequence(sequence);
				book.setIsbn(isbn);
				book.setTitle(b_title);
				book.setAuthor(author);
				book.setCompany(company);
				book.setTotalPage(total_Page);
				book.setPrice(price);
				book.setQuantity(quantity);
				
				books.add(book);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}
		return books;
	}

}
