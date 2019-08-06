package book.dao;

import java.util.Arrays;
import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

/**
 * Book 객체 여러 개를 한 번에 저장하고 관리할 수 있는 클래스
 * 
 * @author Administrator
 * 
 * 1. 캡슐화 적용 : 멤버변수는 private / 생성자, 메소드는 public
 * 2. 메소드 재정의 : toString(), equals & hashCode() 재정의 ==> sequence 필드 기준 재정의
 *
 */

public class ArrayBookShelf implements BookShelf {
	
	// 멤버변수
	private Book[] books;
	
	public ArrayBookShelf() {	
		books = new Book[0];
	}
	
	public ArrayBookShelf(Book[] books) {
		setBooks(books);
	}
	
	// 접근자
	public Book[] getBooks() {
		return books;
	}
	
	// 수정자
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	/**
	 * 1. 리턴을 int 타입으로 추가 - 성공한 건수를 리턴
	 * 
	 * 2. 매개변수로 입력된 book 객체가 이미 목록에 존재하는지 여부를 isExists(book)메소드를 사용하여 판단하고
	 * 	  isExists(book)의 결과가 false일 때만 현재의 추가로직이 작동하도록 변경
	 * 
	 * @param book
	 * @return 0 : 이미 같은 seq 번호의 책이 있어서 추가 실패
	 * 		   1 : 추가 성공
	 * @throws DuplicateException 
	 */
	// 책장에 책을 추가 : add : void : 매개변수로 Book 1개를 받는다.
	// seq = 1의 책이 있으면 0 리턴 없으면 추가하고 1리턴, 같은 책이 있으면 추가하지말고 놔두기
	public int add(Book book) throws DuplicateException {
		// 1. 리턴 값 저장변수 선언, 2. 초기화
		int success = 0;
		if(!isExists(book)) {
			// 3. 로직전개
			// 이미 존재하는 배열 + 1 크기로 복사
			this.books = Arrays.copyOf(books, books.length + 1);
			
			// 1 늘어난 배열 마지막 자리에 새 book(매개변수로 넘어온 것) 저장
			this.books[books.length - 1] = book;
			
//			// 현재 books보다 길이가 1 큰 배열을 새로 만든다.
//			// newBooks
//					
//			Book[] newBooks = new Book[books.length + 1];
//					
//			// books의 모든 책 내용을 새로 생성한 1칸 큰 배열의 앞쪽부터 복사
//			// 매개변수로 넘겨진 book은 마지막 새로 생긴 칸에 저장
//					
//			for(int idx = 0; idx < books.length; idx++) {
//				newBooks[idx] = books[idx];
//			}
//					
//			// 매개변수로 넘겨진 book은 마지막 새로 생긴 칸에 저장
//			newBooks[newBooks.length - 1] = book; 
//					
//			// 이 클래스의 books 멤버 변수에 새로만든 newBooks 저장
//			this.books = newBooks;
			
			success = 1;
		} else {
			throw new DuplicateException("add", book);
		}
		return success;
	}
	
	/**
	 * 삭제하기 전에 목록에 book 객체가 존재하는지 먼저 isExists(book)으로 판단
	 * 결과가 true일 때만 삭제로직 진행 1리턴
	 * 결과가 false이면 삭제로직 진행없이 0리턴
	 * @param book
	 * @throws NotFoundException 
	 */
	// 존재유무 판단하고 없애기
	// 책장에서 책을 제거 : void : remove(Book book)
	public int remove(Book book) throws NotFoundException {
		int success = 0;
		if(isExists(book)) { 
			// book 객체의 sequence가 같으면 같은 책으로 판단해서 삭제
			// 폐기 안하고 남는 책을 유지할 새 배열
			Book[] newBooks;
		
			// 1. 폐기할 책이 위치하는 인덱스 찾기
			int index = findBookIndex(book);
		
			// 2. 폐기할 책의 인덱스가 -1보다 크면 폐기할 책이 있다는 의미로 판단하고 삭제로직 진입
			if(index > -1) {
				// 3. 폐기 안 할 책을 유지할 새 배열을 지금 배열 -1 크기로 생성
				newBooks = new Book[books.length - 1];
			
				// 4. 폐기할 인덱스가 배열 중간일 때
				// (1) 삭제할 책 앞쪽의 책 정보는 같은 인덱스로 복사
				// (2) 삭제할 책 뒤쪽의 남는 책정보는 현재 인덱스 -1 만큼 당겨오기
			
				// 5. 폐기할 인덱스가 매열 끝일 때 폐기할 책 인덱스 앞쪽까지만 새 배열에 복사
				if(index < books.length - 1) {
					for(int idx = 0; idx < index; idx++) {
						newBooks[idx] = books[idx];
					}
				
					for(int ind = index; ind < newBooks.length; ind++) {
						newBooks[ind] = books[ind + 1];
					}
				
				} else {
					for(int idx = 0; idx < index; idx++) {
						newBooks[idx] = books[idx];
				}	
			}
			// 6. 남는 책이 복사된 새 배열을 this book에 새로 저장
			this.books = newBooks;
			
			success = 1;
			}
		} else {
			throw new NotFoundException("set", book);
		}
		return success;
	}
	

	/**
	 * 매개변수 전달된 책 정보와 일치하는 일련번호를 가진 책(책 배열 : books에 있는)을
	 * 찾아서 배열 안에 들어있는 책을 리턴
	 * 
	 * @param book
	 * @return
	 */
	
	private Book findBook(Book book) { // .equals
		Book findBook = null;
		for(int idx = 0; idx < books.length; idx++) {
			if(books[idx].equals(book)) {
				// 같은 책 찾았다.
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}
	
	/**
	 * 같은 책을 찾는 로직을 book 객체 비교로 변경(.equals)
	 * @param book
	 * @return
	 */
	private int findBookIndex(Book book) {
		int index = -1;
		for(int idx = 0; idx < books.length; idx++) {
			if(books[idx].equals(book)) {
				// 같은 책 찾았다.
				index = idx;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 매개변수로 전달된 book(책)이 목록(배열)에 존재하는지 여부를 검색해서 
	 * 존재하면 true, 존재하지 않으면 false를 리턴하는 private 메소드
	 * 
	 * @param book
	 * @return true : 찾는 책이 목록에 존재,
	 * 		   false : 찾는 책이 목록에 없음
	 */
	private boolean isExists(Book book) {
		boolean exists = false;
		for(Book findbook : books) {
			if(findbook.equals(book)) {
				exists = true;
				break;
			}
		}
		return exists;
	}
	
	/**
	 * 수정하기 전에 수정할 book 객체가 목록에 이미 존재하는지 여부를 isExists(book) 수행 결과로 판단해서
	 * true이면 수정하고 1리턴, false이면 수정 진행하지 않고 0리턴
	 * 
	 * @param book
	 * @throws NotFoundException 
	 */
	// 수정 성공 시, 1을 리턴하고 실패 시, 0을 리턴
	// 책 정보 수정
	public int set(Book book) throws NotFoundException {
		// 수정할 book이 books 배열 몇번째 인덱스에 있는지 찾는 메소드
		int success = 0;
		if(isExists(book)) {
			int index = findBookIndex(book);
		
			if(index > -1) {
				books[index] = book;
			}
			
			success = 1;
		} else {
			throw new NotFoundException("set", book);
		}
		return success;
	}
	
	
	// 책 한 권 얻기 : Book : get(Book book)
	public Book get(Book book) throws NotFoundException {
		if(isExists(book)) {
			return findBook(book);
		} else {
			throw new NotFoundException("get", book);
		}
	}
	
	// 전체 책 목록을 얻기 : getAllBooks()
	public List<Book> getAllBooks() {
		// Arrays 클래스 안에 있는 static 메소드를 사용하여 Book[]을 List<Book>로 변경하여 리턴
		// BookShelf 인터페이스 구현으로 리턴타입을 맞추기 위함
		return Arrays.asList(this.books);
	}
}
