package array.multi;

/** ���� 2���� �迭�� �����ϰ� ����غ��� Ŭ����
 * 
 * 2���� �迭�� ũ��� ������� 3, 4, 1, 5�� �����Ѵ�.
 * 
 * ������ 2�� �迭 �ȿ� ���ڸ� 1 ~ 13���� �Ҵ��ϰ� ����غ���.
 * @author Administrator
 *
 */

public class Dynamic2D {

	public static void main(String[] args) {
		// 1. ����
		int[][] twoDArray;
		int count = 0;
		
		// 2. �ʱ�ȭ
		twoDArray = new int[4][];
		
		for(int[] array: twoDArray) {
			System.out.println("array = " + array);
		}
		
		twoDArray[0] = new int[3];
		twoDArray[1] = new int[4];
		twoDArray[2] = new int[1];
		twoDArray[3] = new int[5];
		
		for(int[] array: twoDArray) {
			System.out.println("array = " + array);
		}
		
		System.out.println();
		
		// 3. 1 ~ 13 ���� ������ ���� (for)
		for (int idx = 0; idx < twoDArray.length; idx++) {
			for (int ind = 0; ind < twoDArray[idx].length; ind++) {
				twoDArray[idx][ind] = ++count;
			}
		}
		
		// 4. ��� (foreach)
		for(int[] array : twoDArray) {
			for(int num : array) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
	}

}
