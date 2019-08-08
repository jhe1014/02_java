package book.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

/**
 * Map 구조로 구현된 책장 클래스
 * 
 * key : Book.sequence 필드로 사용
 * value : Book 인스턴스 자체
 * 
 * @author Administrator
 *
 */

public class MapBookShelf implements BookShelf {
	
	// 1. 멤버변수
	Map<Integer, Book> books;
	
	// 2. 생성자
	// (1) 기본생성자
	public MapBookShelf() {
		books = new HashMap<>();
	}
	
	// (2) 매개변수 생성자
	public MapBookShelf(Map<Integer, Book> books) {
		System.out.println("MapBookShelf");
		this.books = books;
	}
	
	// 3. 메소드
	@Override
	public int add(Book book) throws DuplicateException {
		int addCnt = 0;
		
		// 같은 seq 값일 때, put 메소드로 book 추가
		if(!isExists(book)) {
			books.put(book.getSequence(), book);
			addCnt++;
		} else {
			throw new DuplicateException("add", book);
		}
		return addCnt;
	}

	@Override
	public int set(Book book) throws NotFoundException {
		int setCnt = 0;
		
		// 기존 값 제거 후 수정할 값 추가
		if(books.remove(book.getSequence(), book)) {
			books.put(book.getSequence(), book);
			setCnt++;
		} else {
			throw new NotFoundException("set", book);
		}
		return setCnt;
	}

	@Override
	public int remove(Book book) throws NotFoundException {
		int rmCnt = 0;
		
		// seq값 찾은 후 삭제
		if(books.remove(book.getSequence(), book)) {
			rmCnt++;
		} else {
			throw new NotFoundException("remove", book);
		}
		return rmCnt;
	}

	@Override
	public Book get(Book book) throws NotFoundException {
		Book findBook = null;
		
		/*
		 * keySet으로 책들을 받아오고 
		 * 같은 seq 값을 찾으면 해당 key의 book을 findBook에 넣어 반환
		 */
		/*Set<Integer> findBooks = books.keySet();
		for(int key : findBooks) {
			if(key == (book.getSequence())) {
				findBook = books.get(key);
			}
		}*/
		
		if(isExists(book)) {
			findBook = books.get(book.getSequence());
			
		} else {
			throw new NotFoundException("get", book);
		}
		return findBook;
	}

	@Override
	public List<Book> getAllBooks() {
		// Map에는 값들만 취해서 Collection에 Generic이 적용된 형태로 만들어주는 values() 메소드로 변형 가능
		List<Book> bookList = new ArrayList<>(books.values());
		return bookList;
		
		/*
		   Map 에는 값들만 취해서 Collection에 Generic이 적용된 형태로 만들어주는 valuse() 메소드가 있으므로
		   그 메소드를 적용하여 Map의 값들만 추출
		   Collection<Book> collection = books.values();
		
		   Collection 인터페이스에는 컬렉션을 배열로 만들어주는 toArray() 메소드가 존재
		   이 때, 매개변수로 만들 배열의 타입을 지정해서 넣어주면 Object[] 이 아닌 특정 타입의 배열로 리턴받을 수 있음.
		   Book[] books = collection.toArray(new Book[] {});
		   
		   그렇게 만들어진 배열을 리스트로 변경
		   return Arrays.asList(books);
		 */
	}
	
	/**
	 * book이 Map에 이미 존재하는지 검사하는 메소드
	 *  
	 * @param book
	 * @return
	 */
	private boolean isExists(Book book) {
		boolean exists = false;
		
		/*Set<Integer> findBooks = books.keySet();
		for (int key : findBooks) {
			if(key == (book.getSequence())) {
				exists = true;
				break;
			}
		}
		
		return exists;*/
		
		return books.containsKey(book.getSequence());
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByPrice(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}
}
