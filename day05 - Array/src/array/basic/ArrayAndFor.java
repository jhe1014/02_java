package array.basic;

/**
 * 
 * 10ĭ¥�� int�迭 numbers�� ����, ����(0 �ʱ�ȭ)�� �� 
 * �� ������ ���� 0�� �ε������� 9�� �ε������� 10, 20, 30, 100���� �����Ѵ�.
 * �迭�� ����� ������ ���� int summary; ������ �����Ͽ� ����Ͻÿ�.
 * 
 * 
 * @author Administrator
 *
 */

public class ArrayAndFor {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int summary = 0;
		
		for(int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 10;
			System.out.printf("%d�� �� : %d%n", idx, numbers[idx]);
			summary += numbers[idx];
		}
		
		System.out.printf("������ �� : %d", summary);
	}

}
