package product;

public class ProductTest {

	public static void main(String[] args) {
		// 1. ���� : ��ǰ�� ����ϱ� ���� ��ü ���� ����
				Product product;
				
				// 2. �ʱ�ȭ
				product = new Product("P001", "MS-��ũ ��ġ ���콺", 51330, 36);
				
				// 3. ���
				// (1) ��ǰ ���� ���
				product.print();
				
				// (2) 20% ���ΰ��� ��� �ǳ�?
				int dcPrice = product.discount(0.2);
				System.out.printf("��ǰ ���� : %d,  20%% ���ΰ� : %d%n"
						         , 51330, dcPrice);
				
				// (3) 2�� �Ǹ�(sell)
				product.sell(2);
				
				// (4) ���� ���
				product.print();
				
				// (5) 10�� �԰�(buy)
				product.buy(10);
				
				// (6) ���� ���
				product.print();
				
				System.out.println("==============================");
				System.out.println(product);
				System.out.println("==============================");		

	}

}
