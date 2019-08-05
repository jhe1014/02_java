package book.exception;

import book.Book;

/**
 * 도서에 대하여 수정, 삭제, 한 건 조회하는 경우
 * 대상 도서가 존재하지 않을 때 발생시킬 예외를 정의한 클래스
 * 
 * @author Administrator
 *
 */

public class NotFoundException extends Exception {
	
	// 생성자
	public NotFoundException() {
		super("도서정보가 존재하지 않습니다.");
	}
	
	public NotFoundException(String type, Book book) {
		super(String.format("%s : [%d]번 도서 정보가 존재하지 않습니다.", type, book.getSequence()));
	}
}
