package api.object.product.test;

import java.awt.Point;

import api.object.product.Product;

public class ProductTest {

	public static void main(String[] args) {
		// 1. ���� : ��ǰ�� ����ϱ� ���� ��ü ���� ����
				Product[] products = new Product[3];
				Product msMouse;
				Product ltMouse;
				Product airFrier;
				
				// 2. �ʱ�ȭ
				msMouse = new Product("P001", "MS-��ũ ��ġ ���콺", 51330, 36);
				ltMouse = new Product("P003", "�������ڸ��� G302 Daedalus Prime", 34900, 12);
				
				// ��ü ������ �⺻�����ڷ� ����
				airFrier = new Product();
				airFrier.setPcode("P002");
				airFrier.setPname("[�ʸ���] ���������̾� HD-9743");
				airFrier.setPrice(329000);
				airFrier.setQuantity(5);
				
				// products �迭�� ���� �Ҵ�
				products[0] = msMouse;
				products[1] = airFrier;
				products[2] = ltMouse;
				
				// 3. ���
				// �ʱ���� ���
				for(Product product : products) {
					product.print();
				}
				
				// (2) ms���콺�� ������ ����
				Product msMouse2 = new Product("P001", "MS-��ũ ��ġ ���콺", 40000, 36);
				// ��ǰ���� ����ִ� �迭 products���� msMouse2�� pcode�� ���� ��ǰ��ȣ�� ���� �ε����� ���Ҹ�
				// msMouse2�� ����
				for (int idx = 0; idx < products.length; idx++) {
					// ��ü�� ����񱳸� �Ϸ��� .equals()�� ����� ��
					if(products[idx].getPcode().equals(msMouse2)) {
						products[idx] = msMouse2;
					}
				}
			
				
	}

}
