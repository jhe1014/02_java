package control.ifelse;

import java.util.Scanner;

/**
 * 
 * 입력된 정수에 대해서 2의 배수인지 판별하는 클래스
 * 
 * Scanner를 사용하여 입력된 정수를 input 변수에 저장하고
 * 입력된 값이 2의 배수인지 판단하는 조건을 작성하시오.
 * 2의 배수 판별 결과는 String result에 저장하시오.
 * 
 * (1) --------------------------------------------------------------
 * 2의 배수일 때 : "입력값 4은(는) 2의 배수입니다."
 * 2의 배수가 아닐 때 : "입력값 5은(는) 2의 배수가 아닙니다. "
 * ------------------------------------------------------------------
 * 
 * (2) --------------------------------------------------------------
 * 나머지는 int mod;에 저장하여 사용하시오.
 * 
 * 2의 배수일 때 : "입력값 4은(는) 2의 배수입니다."
 * 2의 배수가 아닐 때 : "입력값 5은(는) 2의 배수가 아닙니다."
 * 						" 나머지가 1입니다."
 * 
 * @author Administrator
 *
 */

public class MultipleOfTwo {

	public static void main(String[] args) {
		// 1. 선언
		// 입력받을 변수 선언
		int input;
		// 판별 결과를 저장할 변수 선언
		String result = "";
		// 입력을 위한 스캐너 선언
		Scanner scan;
		// 나머지를 저장할 변수 선언
		int mod;
		
		// 2. 초기화
		scan  = new Scanner(System.in);
		System.out.println("정수를 입력하세요. : ");

		// 스캐너 사용하여 input에 정수 입력
		input = scan.nextInt();
		// 나머지 계산
		mod = input % 2;
		
		// 3. 사용 : if ~ else 로직으로 2의 배수인지 판별
		if (mod == 0) {
			result = "2의 배수입니다."; 
		} else {
			result = "2의 배수가 아닙니다. 나머지가 " + mod + "입니다.";
		}
		
		//출력
		System.out.printf("입력된 정수 : %d%n", input);
		System.out.printf("입력값 %d은(는) %s", input, result);

	}

}
