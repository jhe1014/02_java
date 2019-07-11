package array.init;

public class MultiTypeArrayInit {

	public static void main(String[] args) {
		// 각 배열의 크기를 지정하는 상수
		final int SIZE = 5;
		
		// 1. 선언  2. new 연산자를 사용하여 기본 초기화
 		boolean[] flags = new boolean[SIZE];
		int[] ages = new int[SIZE];
		double[] heights = new double[SIZE];
		String[] names = new String[SIZE];
		
		// 3. 각 배열의 원소 값을 출력
		// foreach
		System.out.println("(1) boolean 배열 출력");
		for (boolean flag : flags) {
			System.out.printf("flag=%b%n", flag);
		}
		
		System.out.println("(2) int 배열 출력");
		for (int age:ages) {
			System.out.printf("age = %d%n", age);
		}
		
		System.out.println("(3) double 배열 출력");
		for(double height : heights) {
			System.out.printf("height = %f%n", height);
		}
		
		System.out.println("(4) String 배열 출력");
		for(String name : names) {
			System.out.printf("name = %s%n", name);
		}

	}

}
