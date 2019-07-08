package control.ifelse;

import java.util.Scanner;

/**
 * 
 * 하나의 정수를 입력받아서 음수인지, 양수인지, 0인지 판단하는 클래스
 * 
 * 입력받을 변수 input을 선언하여 Scanner로 입력받고 if ~ else  구문으로 부호를 판별한 후
 * 판별 결과를 저장하는 변수 String result에 저장하여
 * 
 * "입력값 100은(는) 양수 입니다."
 * "입력값 -1은(는) 음수 입니다." 
 * "입력값 0은(는) 0 입니다. "
 * 라는 문장을 출력하시오.
 * 
 * @author Administrator
 *
 */

public class PositiveNegative {

	public static void main(String[] args) {
		// 1. 선언
				// 입력받을 변수 선언
				int input;
				// 판별 결과를 저장할 변수 선언
				String result = "";
				// 입력을 위한 스캐너 선언
				Scanner scan;
				
				// 2. 초기화
				scan  = new Scanner(System.in);
				System.out.println("정수를 입력하세요. : ");

				// 스캐너 사용하여 input에 정수 입력
				input = scan.nextInt();
				// 3. 사용 : if ~ else 로직으로 양수, 음수 판별
				if (input > 0) {
					result = "양수"; 
				} else if (input < 0) {
					result = "음수";
				} else {
					result = "0";
				}
				
				//출력
				System.out.printf("입력된 정수 : %d%n", input);
				System.out.printf("입력값 %d은(는) %s 입니다.", input, result);

	}

}
