package product;

import point.Point;

public class ProductTest {

	public static void main(String[] args) {
		// 1. ���� : ��ǰ�� ����ϱ� ���� ��ü ���� ����
				Product mouse;
				Product airFrier;
				
				// 2. �ʱ�ȭ
				mouse = new Product("P001", "MS-��ũ ��ġ ���콺", 51330, 36);
				
				// ��ü ������ �⺻�����ڷ� ����
				airFrier = new Product();
				// �� �ʵ�� .(��Ʈ������)�� ���� �����ؼ� ����
				// Product�� �� �ʵ忡 access modifier ���� �� ����
				/*
				 * airFrier.pcode = "P002"; airFrier.pname = "[�ʸ���] ���������̾� HD-9743";
				 * airFrier.price = 329000; airFrier.quantity = 5;
				 */
				
				// Product�� �� �ʵ忡 access modifier private�� ��� �ݵ�� �����ڿ� ���ؼ��� ���� ����
				airFrier.setPcode("P002");
				airFrier.setPname("[�ʸ���] ���������̾� HD-9743");
				airFrier.setPrice(329000);
				airFrier.setQuantity(5);
				
				// 3. ���
				// (1) ��ǰ ���� ���
				mouse.print();
				airFrier.print();
				System.out.println("==================================================");
				
				/*
				 * System.out.println(airFrier.pcode); System.out.println(airFrier.pname);
				 * System.out.println(airFrier.price); System.out.println(airFrier.quantity);
				 */
				
				System.out.println(airFrier.getPcode());
				System.out.println(airFrier.getPname());
				System.out.println(airFrier.getPrice());
				System.out.println(airFrier.getQuantity());
				
				// (2) 20% ���ΰ��� ��� �ǳ�?
				int dcPrice = mouse.discount(0.2);
				System.out.printf("��ǰ ���� : %d,  20%% ���ΰ� : %d" , 51330, dcPrice);
				
				// (3) 2�� �Ǹ�(sell)
				mouse.sell(2);
				
				// (4) ���� ���
				mouse.print();
				
				// (5) 10�� �԰�(buy)
				mouse.buy(10);
				
				// (6) ���� ���
				mouse.print();
				
				System.out.println("==============================");
				System.out.println(mouse);
				System.out.println("==============================");		

				// �ٸ� ��Ű��(point)�� �ִ� Point Ŭ������ ��� : import
				Point point = new Point();
				//point.x = 200;
				point.setX(200);
				//point.setY(200);
				point.setY(-11);
				
				System.out.println(point);
				
	}

}
