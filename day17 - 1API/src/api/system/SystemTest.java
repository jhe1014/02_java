package api.system;

import static java.lang.System.currentTimeMillis;

public class SystemTest {

	public static void main(String[] args) {
		long start, end;
		start = currentTimeMillis();
		
		System.out.println("현재 시간 : " + start);
		System.out.println("10,000만번 반복문 시작");
		
		for(int i = 0; i < 10000; i++);
		System.out.println("10,000만번 반복문 종료");
		
		end = currentTimeMillis();
		
		System.out.println("반복 종료 시간 : " + end);
		System.out.println("반복 소요 시간 : " + (end - start));
		

	}

}
