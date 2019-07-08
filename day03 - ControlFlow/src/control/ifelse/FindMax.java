package control.ifelse;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// 1. 선언 : 입력받을 변수, 작은값을 저장할 변수
				int x;
				int y;
				int max = 0;
				Scanner scan;
	
				System.out.println("두 정수를 입력 : ");
				// 2. 초기화
				scan = new Scanner(System.in);
				x = scan.nextInt();
				y = scan.nextInt();
				
				// 3. 사용 : 입력된 두 값을 비교(if)
				if (x > y) {
					max = x;
					System.out.printf("입력된 두 값 x = %d, y = %d, 중 큰 값은 %d", x, y, max);
				}
				
				if (y > x) {
					max = y;
					System.out.printf("입력된 두 값 x = %d, y = %d, 중 큰 값은 %d", x, y, max);
				}
				
				if (x == y) {
					max = x;
					System.out.println("두 숫자가 동일합니다.");
				}
				
				

	}

}
