package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		double c = 0;
		
		for (double f = 0; f <= 100; f += 10) {
			// 섭씨온도로 변환
			c = (double) 5 / 9 * (f - (double) 32);
			
			System.out.printf("%.1f F = %.1f C%n", f, c);
		}

	}

}
