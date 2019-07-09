package control.ifelse;

import java.util.Scanner;

/**
 * 
 * 다중 선택 if 구문 사용하여 다음의 기준으로 학점을 계산하는 클래스
 * ---------------------------------------------------------------------
 * A : 90점 이상
 * B : 80 ~ 89점 사이
 * C : 60 ~ 79점 사이
 * D : 40 ~ 59점 사이
 * F : 이하 나머지
 * ---------------------------------------------------------------------
 * printf로 출력
 * 
 * @author Administrator
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		// 점수를 입력받을 변수 선언
		int score;
		// 입력을 위한 스캐너 선언
		Scanner scan;
		// 학점을 저장할 변수 선언
		char grade;
		
		// 2. 초기화
		scan  = new Scanner(System.in);
		System.out.println("점수를 입력하세요. (0 ~ 100 사이) : ");

		// 스캐너 사용하여 input에 정수 입력
		score = scan.nextInt();
		
		// 3. 사용 : if ~ else 로직으로 학점 판별
		if (score >= 90 && score <= 100) {
			grade = 'A'; 
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 60) {
			grade = 'C';
		} else if (score >= 40) {
			grade = 'D';
		} else if (score >= 0 && score <= 39) {
			grade = 'F';
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		//출력
		System.out.printf("%d점에 해당하는 학점은 %c입니다.", score, grade);

	}

}
