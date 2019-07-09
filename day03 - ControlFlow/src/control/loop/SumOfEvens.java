package control.loop;

public class SumOfEvens {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		
		System.out.println("짝수 : ");
		
		while(num <= 100) {
			System.out.printf("%d%n", num);
			sum += num;
			num += 2;
		}
		
		System.out.printf("1부터 100 사이 홀수의 합은 %d입니다.%n", sum);
	}

}
