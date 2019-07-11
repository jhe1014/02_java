package array.basic;

/**
 * 
 * 1. ������ ���ҷ� ������ ũ�� 10�� �迭 numbers�� ������ ��
 * 
 * 2. for (index ����ϴ� �������� for) ������ ����Ͽ�
 * 	  1 ~ 10���� ������ �����Ѵ�.
 * 
 * 3. foreach ������ ����Ͽ� 1���� ����� ���� ����ǥ�� ����Ѵ�.
 * 
 * @author Administrator
 *
 */
public class SquareTable {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int count = 1;
		
		for(int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = idx + 1;
		}
		
		for(int num : numbers) {
			System.out.println(num + " x " + num + " = " + num * num);
			count++;
		}

	}

}
