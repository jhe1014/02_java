package control.loop;

public class SumOfOdds {

	public static void main(String[] args) {
		int num = 1, sum = 0;
		
		while(num <= 100) {
			if (num % 2 == 1) {
				sum += num;
				System.out.println(num);
			}
			num++;
		}
		
		System.out.printf("1부터 100 사이 홀수의 합은 %d입니다.%n", sum);

	}

}
