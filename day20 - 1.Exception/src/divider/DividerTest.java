package divider;

import java.util.Scanner;

/**
 * 입력값에 따라서 0으로 나누는 상황이 발생할 가능성이 있는 클래스 Divider를 테스트한다.
 * @author Administrator
 *
 */
public class DividerTest {
	
	public static void main(String[] args) {
		// 1. 선언
		Scanner scan;
		int input;
		Divider div;
		
		// 2. 초기화
		div = new Divider();
		scan = new Scanner(System.in);
		
		// 입력 지시하는 출력
		System.out.println("정수를 입력하세요.");
		input = scan.nextInt();
		
		// 3. 사용
		int result;
		
		try {
			result = div.divide(input);
			System.out.printf("나눗셈 성공 : %d%n, result");
		} catch (DivideZeroException e) {
			System.err.printf("나눗셈 실패 : %s%n", e);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("== 프로그램 종료 ==");
		
		/*
		 * input : 0
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		   at divider.Divider.divide(Divider.java:24)
		   at divider.DividerTest.main(DividerTest.java:27)
		 */
	}
	
}
