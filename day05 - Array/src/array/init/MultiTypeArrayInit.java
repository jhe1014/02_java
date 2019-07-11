package array.init;

public class MultiTypeArrayInit {

	public static void main(String[] args) {
		// �� �迭�� ũ�⸦ �����ϴ� ���
		final int SIZE = 5;
		
		// 1. ����  2. new �����ڸ� ����Ͽ� �⺻ �ʱ�ȭ
 		boolean[] flags = new boolean[SIZE];
		int[] ages = new int[SIZE];
		double[] heights = new double[SIZE];
		String[] names = new String[SIZE];
		
		// 3. �� �迭�� ���� ���� ���
		// foreach
		System.out.println("(1) boolean �迭 ���");
		for (boolean flag : flags) {
			System.out.printf("flag=%b%n", flag);
		}
		
		System.out.println("(2) int �迭 ���");
		for (int age:ages) {
			System.out.printf("age = %d%n", age);
		}
		
		System.out.println("(3) double �迭 ���");
		for(double height : heights) {
			System.out.printf("height = %f%n", height);
		}
		
		System.out.println("(4) String �迭 ���");
		for(String name : names) {
			System.out.printf("name = %s%n", name);
		}

	}

}
