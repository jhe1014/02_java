package io.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * book.bobj 파일을 읽어서 생성된 객체의 내용을 표준 출력으로 확인하는 클래스 
 * ------------------------------------------------------------------------------
 * -- 입력 --
 * 1. node stream (파일 : FileInputStream)
 * 2. filter stream (객체 입력 : ObjectInputStream)
 * 3. read 작업 : filter
 * 
 * -- 출력 --
 * 4. 표준 출력 (콘솔 : System.out)
 * 
 * -- 정리 --
 * 5. 입력 filter stream 닫기
 * 
 * @author Administrator
 *
 */
public class ReadBookObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 1. 입력 node stream : FileInputStream
		FileInputStream fis = new FileInputStream("book.obj");
		
		// 2. 입력 filter stream : ObjectInputStream
		ObjectInputStream in = new ObjectInputStream(fis);
		
		// 3. read 작업 : readObject()
		Book vegiterian = (Book) in.readObject();
		
		// 4. 읽은 값으로 생성한 Book 객체 표준 출력
		System.out.println(vegiterian);
		
		// 5. 입력 filter stream 닫기
		in.close();

	}

}
