package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		int num = 0;
		
		// �� �������� ���� ������ �Է¹޾� �迭�� ����
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "��° ���� ���� �Է� : ");
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = scan.nextInt();
				sum[i] += score[i][j];
			}
			
			if (sum[i] > max) {
				max = sum[i];
				num = i + 1;
			}
		}
		
		System.out.println("��� ����");
		System.out.println(num + "��° ���� : " + max + "��");
	}

}
