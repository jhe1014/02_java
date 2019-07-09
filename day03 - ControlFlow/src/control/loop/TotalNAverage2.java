package control.loop;

import java.util.Scanner;

public class TotalNAverage2 {

	public static void main(String[] args) {
		int total = 0, score = 0, count = 0;
		double average;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("점수를 입력 (끝내려면 0 입력) : ");
			score = scan.nextInt();
			
			if (score != 0) {
				total += score;
				count++;
			}
			
		} while (score != 0);
		
		if (count == 0)
			System.out.println("입력된 값이 없습니다.");
		else {
			average = (double) total / count;
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f%n", average);
		}


	}

}
