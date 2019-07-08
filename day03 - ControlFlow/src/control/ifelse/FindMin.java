package control.ifelse;

import java.util.Scanner;

public class FindMin {

	public static void main(String[] args) {
		// 1. 선언 : 입력받을 변수, 작은값을 저장할 변수
		int x;
		int y;
		int min = 0;
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3. 사용 : 입력된 두 값을 비교(if)
		if (x < y) {
			min = x;
		}
		
		if (y < x)
			min = y;
		
		System.out.printf("입력된 두 값 x = %d, y = %d, 중 작은 값은 %d", x, y, min);

	}

}
