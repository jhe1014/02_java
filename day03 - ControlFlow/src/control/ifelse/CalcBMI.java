package control.ifelse;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		double weight, height, bmi;
		String result;
		Scanner scan;
		
		System.out.println("몸무게와 키를 차례로 입력하세요.");
		scan = new Scanner(System.in);
		weight = scan.nextDouble();
		height  = scan.nextDouble();
		
		bmi = weight / ((height/100) * (height/100));
		
		if(bmi < 15.0) {
			result = "병적인 저체중";
		} else if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23.0) {
			result = "정상";
		} else if (bmi <= 27.5) {
			result = "과체중";
		} else if (bmi <= 40.0) {
			result  = "비만";
		} else {
			result = "병적인 비만";
		}
		
		System.out.printf("몸무게 : %f, 키 : %f%n", weight, height);
		System.out.printf("BMI 지수 : %f%n", bmi);
		System.out.printf("%s입니다.", result);
		
	}

}
