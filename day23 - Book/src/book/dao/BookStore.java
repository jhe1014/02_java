package book.dao;

import book.controller.BookManager;
import book.vo.Book;

/**
 * 책을 판매하는 서점을 정의하는 클래스
 * 
 * 서점에서 도서판매를 위해서 최소 1명의 매니저는 있어야한다.
 * 
 * @author Administrator
 *
 */

public class BookStore {
	// 1. 멤버 변수 : 북매니저
	private BookManager manager;
	
	// 2. 생성자
	// (1) 기본 생성자 명시
	public BookStore() {
		manager = new BookManager();
	}
	
	// (2) 매개변수 생성자 중복 정의
	public BookStore(BookManager manager) {
		this.manager = manager;
	}
	
	// 3. 메소드 선언 
	// 서점에 신간이 들어왔을 때, 매니저에게 신간 정리(책장에 꼽는 것 등을 부탁)
	public void add(Book book) {
		manager.add(book);
	}
	
	// (2) 서점에서 폐기할 도서가 생겼을 때
	// 매니저에게 폐기 부탁
	public void remove(Book book) {
		manager.remove(book);
	}
	
	// (3) 서점에서 판매 도서의 가격 등 변동이 있을 때 매니저에게 부탁해서 가격 태그 등 정보 수정을 함
	public void set(Book book) {
		manager.set(book);
	}
	
	// (4) 서점에 온 고객이 책을 찾을 때 매니저에게 찾아달라고 부탁함
	public void get(Book book) {
		manager.get(book);
	}
	
	// (5) 우리 서점에서 판매하는 모든 책의 목록을 매니저에게 출력해달라고 부탁함.
	public void getAllBooks() {
		manager.getAllBooks();
	} 
	
	public void getBooksByTitle(String title) {
		manager.getBooksByTitle(title);
	}
	
	public void getBooksByPrice(int min, int max) {
		manager.getBooksByPrice(min, max);
	}
	
}
