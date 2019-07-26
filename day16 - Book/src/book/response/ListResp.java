package book.response;

import book.Book;

public class ListResp implements Response {

	/**
	 * 입력된 데이터가 전체 책 목록(배열)일 때 전체 목록을 출력
	 */
	@Override
	public void response(Object object) {
		Book[] books = (Book[])object;
		for (Book book : books) {
			System.out.println(book);
		}

	}

}
