package practice.methods;

import java.util.Scanner;

public class MethodsTest {

	public static void main(String[] args) {
	
		// 1. 메소드 정의 클래스 VarietyMethods의 변수 선언
		VarietyMethods methods;
		
		// 2. 초기화
		methods = new VarietyMethods();
		
		// 3. 사용.
		methods.sayhello();
		methods.maxims("홍길동", "호부호형을 못하니...");
		methods.maxims("소크라테스", "Know Yourself");
		methods.maxims("피터사간", "모든 사람은 두 종류의 고통 중에서 선택해야한다...");
		System.out.println("============================================");
				
				
		double cel = methods.fahToCel(100.0);
		System.out.println("cel = " + cel);
		System.out.println("============================================");
				
		methods.birthYearMonth("정하은", 1997, 10);
		System.out.println("============================================");
				
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 단 입력 : ");
		int stage = scan.nextInt();
		methods.printNineNineTable(stage);
		System.out.println("============================================");
				
		int [] stages = {3, 4, 8};
	            methods.printNineNineTableFromArray(stages);
		System.out.println("============================================");
				
		String result = methods.calcBmi(158.2, 44.1);
		System.out.println(result);
		System.out.println("============================================");
				
		System.out.println("두 정수를 입력하세요. : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int min = methods.min(num1, num2);
		System.out.println(min + "가 더 작습니다.");
		System.out.println("============================================");
				
		System.out.println("두 정수를 입력하세요. : ");
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int max = methods.max(num3, num4);
		System.out.println(max + "가 더 큽니다.");
		System.out.println("============================================");
				
		int sum = methods.sumOfArray(stages);
		System.out.println("배열 원소의 합 : " + sum);
		System.out.println("============================================");
				
		double avg = methods.avgOfArray(stages);
		System.out.println("배열 원소의 평균 : " + avg);
		System.out.println("============================================");
				
		methods.adder('+', 80, 20);
	}

}
