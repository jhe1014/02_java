package io.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Book 객체를 생성하고, 객체 단위 출력하여 book.obj 파일을 생성
 * -----------------------------------------------------------------
 * -- 입력 --
 * 1. Book 객체 생성
 * 
 * -- 출력 --
 * 2. node stream (파일 : FileOutputStream)
 * 3. filter stream (객체 출력 : ObjectOutputStream)
 * 4. writer 작업 : filter stream의 메소드 사용
 * 
 * -- 정리 --
 * 5. 출력 filter stream 닫기
 * 
 * 
 *  @author Administrator
 *
 */
public class WriteBookObeject {

	public static void main(String[] args) throws IOException {
		//1. 입력용 Book 객체 선언, 초기화
		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10);
		//2. 출력 node stream
		FileOutputStream fos = new FileOutputStream("book.obj");
		
		// 3. 출력 filter stream
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		//4. write 작업 : write 작업
		out.writeObject(vegetarian);
		
		System.out.printf("== 책 정보 [%s] 객체 출력 완료", vegetarian.getTitle());
		
		// 5. 닫기
		out.close();
		
	}

}
