package array.multi;

/** 
 * 
 * ������ ����� ��Ÿ�� �� �ִ� 2���� �迭�� �����ϰ� �ʱ�ȭ �� ����غ��� Ŭ����
 * 
 * @author Administrator
 *
 */

public class Matrix {

	public static void main(String[] args) {
		// 1. ����, 2. �迭 �ʱ�ȭ ������� �ʱ�ȭ
		int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};
		// int[] numbers = {10, 20, 30};
		// int[] matrix[0] = {0, 1, 0};
		
		// 3. ��� (for : index�� ���)
		for (int idx = 0; idx < matrix.length; idx++) {
			for (int ind = 0; ind < matrix[idx].length; ind++) {
				// maxtirx[0].length
				// maxtirx[1].length
				// maxtirx[2].length
				System.out.printf("%d\t", matrix[idx][ind]);
			}
			System.out.println("");
		}
		
		System.out.println();

		// 4. ��� (foreach)
		for(int[] numbers : matrix) {
			for (int num : numbers) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
	}

}
