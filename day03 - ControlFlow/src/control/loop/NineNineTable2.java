package control.loop;

public class NineNineTable2 {

	public static void main(String[] args) {
		
		for(int i = 2; i < 9; i += 3) {
			System.out.printf("%d 단\t\t %d단", i, i + 1);
			if (i < 8) {
				System.out.printf("\t\t %d단", i + 2);
			}
			System.out.println();
			for (int j = 1; j <= 9; ++j) {			
				for (int k = i; k <= i + 2; k++) {
					System.out.printf("%d x %d = %d	 ", k, j, k * j);
				} 	
				
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
	
