package array.multi;

import java.util.Scanner;

public class BestPitcher {
	// 방어율 적을수록 순위 높음
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		int team = 0;
		int num = 0;
		
		// 각 팀별로 각 투수의 방어율 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력 ");
		for(int i = 0; i < ERA.length; i++) {
			System.out.print((i + 1) + "번째 팀 1 ~ 5 선발 투수 방어율 : ");
			for(int j = 0; j < ERA[i].length; j++) {
				ERA[i][j] = scan.nextDouble();
				
				if(ERA[i][j] < min) {
					min = ERA[i][j];
					team = i + 1;
					num = j + 1;
				}
			}
		}
		
		System.out.println("최고의 투수는 ");
		System.out.print(team + "번째 팀의 " + num + "선발인 방어율 " + min + " 인 선수입니다.");
		
	}

}
