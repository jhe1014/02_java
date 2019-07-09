package control.switchcase;

import java.util.Scanner;

/**
 * 
 * switch 구문 사용하여 다음의 기준으로 학점을 계산하는 클래스
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
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		// 점수를 입력받을 변수 선언
		int score;
		// 입력을 위한 스캐너 선언
		Scanner scan;
		// 학점을 저장할 변수 선언
		char grade;
		// 점수 십의 자리를 저장할 변수
		int ten;
		
		// 2. 초기화
		scan  = new Scanner(System.in);
		System.out.println("점수를 입력하세요. (0 ~ 100 사이) : ");

		// 스캐너 사용하여 input에 정수 입력
		score = scan.nextInt();
		
		// 점수 앞자리로 범위 구하기
		ten = score / 10;
		
		// 3. 사용 : switch - case 로직으로 학점 판별
		switch(ten) {
		case 10 : case 9 :
			grade = 'A';
			break;
		case 8 : 
			grade = 'B';
			break;
		case 7 : case 6 :  
			grade = 'C';
			break;
		case 5 : case 4 :
			grade = 'D';
			break;
		case 3 : case 2 : case 1 : case 0 :
			grade = 'F';
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		//출력
		System.out.printf("%d점에 해당하는 학점은 %c입니다.", score, grade);

	}

}
