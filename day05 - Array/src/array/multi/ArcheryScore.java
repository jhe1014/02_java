package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		int num = 0;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번째 선수 점수 입력 : ");
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = scan.nextInt();
				sum[i] += score[i][j];
			}
			
			if (sum[i] > max) {
				max = sum[i];
				num = i + 1;
			}
		}
		
		System.out.println("우승 선수");
		System.out.println(num + "번째 선수 : " + max + "점");
	}

}
