package book.view;

import book.vo.Book;

public class SingleResp implements Response {
	/**
	 * 입력된 한 건의 데이터(object)가 Book 한 권의 정보일 때 그것을 출력
	 */
	@Override
	public void response(Object object) {
		Book book = (Book)object;
		System.out.println(book);
	}
}
