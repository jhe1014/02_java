package array.basic;

/**
 * 
 * 10칸짜리 int배열 numbers를 선언, 생성(0 초기화)한 후 
 * 각 원소의 값을 0번 인덱스부터 9번 인덱스까지 10, 20, 30, 100으로 저장한다.
 * 배열에 저장된 원소의 합을 int summary; 변수에 누적하여 출력하시오.
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
			System.out.printf("%d번 값 : %d%n", idx, numbers[idx]);
			summary += numbers[idx];
		}
		
		System.out.printf("원소의 합 : %d", summary);
	}

}
