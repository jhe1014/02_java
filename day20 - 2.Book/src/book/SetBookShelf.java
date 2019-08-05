package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import book.exception.DuplicateException;
import book.exception.NotFoundException;

/**
 * Set으로 만들어진 BookShelf
 * 
 * @author Administrator
 *
 */

public class SetBookShelf implements BookShelf{
	
	// 1.  멤버변수
	Set<Book> books;
	
	// 2. 생성자
	// (1) 기본생성자
	public SetBookShelf() {
		// books를 HashSet으로 직접 초기화
		books = new HashSet<>();
	}
	
	// (2) 매개변수 생성자
	public SetBookShelf(Set<Book> books) {
		System.out.println("SetBookShelf");
		this.books = books;
	}
	
	@Override
	public int add(Book book) throws DuplicateException {
		int addCnt = 0;
		
		if(books.add(book)) {
			addCnt++;
		} else {
			throw new DuplicateException("add", book);
		}
		return addCnt;
	}

	@Override
	public int set(Book book) throws NotFoundException {
		/*
		 * Set 구조에서 set : 데이터 수정은 기존 값 제거 후 수정할 값 추가
		 */
		int setCnt = 0;
		
		if(books.remove(book)) {
			books.add(book);
			setCnt++;
		} else {
			throw new NotFoundException("set", book);
		}
		return setCnt;
	}

	@Override
	public int remove(Book book) throws NotFoundException {
		int rmCnt = 0;
		
		if(books.remove(book)) {
			rmCnt++;
		} else {
			throw new NotFoundException("remove", book);
		}
		return rmCnt;
	}

	@Override
	public Book get(Book book) throws NotFoundException {
		Book findBook = null;
		
		for(Book inBook : books) {
			if(inBook.equals(book)) {
				findBook = inBook;
			} else {
				throw new NotFoundException("get", book);
			}
		}
		return findBook;
	}

	@Override
	public List<Book> getAllBooks() {
		// (1) API 메소드 사용하여 변환 - 1
		// List<Object> bookList = Arrays.asList((Book[]) books.toArray());
		
		// - 2 (for 루프 한 줄만으로 몰아넣기 가능)
		// List<Book> bookList = new ArrayList<Book>();
		// bookList.addAll(books);
		
		// (2)
		List<Book> bookList = new ArrayList<Book>();
		for(Book book : books) {
			bookList.add(book);
		}
		return bookList;
	}
	
}
