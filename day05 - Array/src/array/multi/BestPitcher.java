package array.multi;

import java.util.Scanner;

public class BestPitcher {
	// ����� �������� ���� ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		int team = 0;
		int num = 0;
		
		// �� ������ �� ������ ����� �Է¹޾� �迭�� �����Ѵ�.
		System.out.println("1���� 2���� 3���� 4���� 5���� ����� �Է� ");
		for(int i = 0; i < ERA.length; i++) {
			System.out.print((i + 1) + "��° �� 1 ~ 5 ���� ���� ����� : ");
			for(int j = 0; j < ERA[i].length; j++) {
				ERA[i][j] = scan.nextDouble();
				
				if(ERA[i][j] < min) {
					min = ERA[i][j];
					team = i + 1;
					num = j + 1;
				}
			}
		}
		
		System.out.println("�ְ��� ������ ");
		System.out.print(team + "��° ���� " + num + "������ ����� " + min + " �� �����Դϴ�.");
		
	}

}
