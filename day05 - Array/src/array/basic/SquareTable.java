package array.basic;

/**
 * 
 * 1. 정수를 원소로 가지는 크기 10의 배열 numbers를 선언한 후
 * 
 * 2. for (index 사용하는 전통적인 for) 구문을 사용하여
 * 	  1 ~ 10까지 정수를 저장한다.
 * 
 * 3. foreach 구문을 사용하여 1에서 저장된 값의 제곱표를 출력한다.
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
