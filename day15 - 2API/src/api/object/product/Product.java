package api.object.product;

/**
 * ������ǰ�� �Ǹ��ϴ� ���忡�� �����ϴ� ����� "��ǰ"�� �����ϴ� Ŭ����
 * ----------------------------------------------------------------------
 * ������� (���������� ���� ����)
 * ��ǰ��ȣ : pcode    : String : <== "P001"
 * ��ǰ��   : pname    : String : <== "�Ｚ ���� ...."
 * ���� 	: price    : int    : ��¥ �� ��ǰ ���� �ֱ�
 * ������ : quantity : int
 * ----------------------------------------------------------------------
 * ������ (public���� ����)
 * �⺻������, �Ű����� �޴� ������ �ʵ� 1�� �÷����� this, this() ���
 * ----------------------------------------------------------------------
 * �޼ҵ� (public���� ����) 
 * print() : void ==> ��ǰ�� ���¸� ���
 * 
 * toString() : String ==> �� ��ǰ�� ��ǥ�ϴ� ���ڿ��� ����
 * 						   String.format()���� ���ڿ� ���� �� ����
 * 
 * discount(double percentage) : int ==> �Էµ� �ۼ�Ʈ��ŭ ���ε� ����
 * 
 * sell(int amount) : void ==> ���忡�� �Ǹ�(���)�Ǿ� �������� amount��ŭ �پ�鵵�� �ݿ�
 * 							   �������� 0���� �۾��� �� ������ ����
 * 
 * buy(int amount) : void ==> ���忡 �԰�Ǿ� ������(quantity)�� amount��ŭ �þ���� �ݿ�  
 * 
 * =======================================================================
 * �ۼ��� ���� �� ��
 * �� �ʵ带 ������ ��, �ʵ忡 ���� ������ ���� �ּ����� �� ��.
 * �� ������ ������ ��, ���� �ּ� �� ��.
 * �� �޼ҵ� ������ ��, �޼ҵ� ������ ���� �ּ����� �� ��.
 * 
 * @author Administrator
 *
 */

public class Product {
	/** >> Product Ŭ������ ���� �ʵ� ����	 */
	String pcode; /** pcode : ��ǰ��ȣ */
	String pname; /** pname : ��ǰ�� */
	int price; /** price : ���� */
	int quantity; /** quantity : ������ */
	
	/** 
	 * �⺻������ ����
	 */
	public Product() {
		
	}
	
	// ������ �ߺ�����
	/**
	 * pcode�� �ʱ�ȭ�ϴ� ������
	 * @param pcode
	 */
	public Product(String pcode) {
		this();
		this.pcode = pcode;
	}
	
	/**
	 * pcode�� pname�� �ʱ�ȭ�ϴ� ������
	 * @param pcode
	 * @param pname
	 */
	public Product(String pcode, String pname) {
		this(pcode);
		this.pname = pname;
	}
	
	/**
	 * pcode, pname,price�� �ʱ�ȭ�ϴ� ������
	 * @param pcode
	 * @param pname
	 * @param price
	 */
	public Product(String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;
	}
	
	/**
	 * ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	 * @param pcode
	 * @param pname
	 * @param price
	 * @param quantity
	 */
	public Product(String pcode, String pname, int price, int quantity) {
		this(pcode, pname, price);
		this.quantity = quantity;
	}
	
	/**
	 *  ��ǰ�� ���¸� ����ϴ� �޼ҵ�
	 */
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * �� ��ǰ�� ��ǥ�ϴ� ���ڿ��� �����ϴ� �޼ҵ�
	 * 
	 * @return String
	 */
	public String toString() {
		return String.format("��ǰ��ȣ : %s, ��ǰ�� : %s, ���� : %d, ������ : %d", pcode, pname, price, quantity);
	}
	
	// equals() : ��ü ����� �޼ҵ� �ۼ�
	// ==> pcode�� ������ ���� ��ü�� �Ǵ�
//	@Override
//	public boolean equals(Object object) {
//		// 1. ���Ϻ� ���� ��� ������ ���� ����
//		// 2. �⺻ false�� �ʱ�ȭ
//		boolean isEqual = false;
//		
//		// 3. ��� : ������ ��ü���� �Ǵ�
//		// (1) �Ű������� �Ѱ��� object�� Product
//		if(object instanceof Product) {
//			// (2) �񱳴���� this ��ü�� �Ű����� object�� pcode �ʵ� ���� ��
//			Product product = (Product)object;
//			
//			if(this.pcode.equals(product.pcode)) {
//				isEqual = true;
//			}
//		}
//		
//		return isEqual;
//	}
//	
//	public int hashCode() {
//		/* --------------------------------------------------------------------------------
//		 * hash �˰��� : �Է��� �����ϸ� ��µ� �������� �����ϴ� ���� �˰���
//		 * ==> ����� �ٸ��� �Է��� �ٸ��ٴ� ����� �����Ѵ�.
//		 * --------------------------------------------------------------------------------
//		 * 1. ���Ϸ��� �ʵ尡 �������̸� �� Ŭ������ �������ص� hashCode()�� ȣ���ؼ� ��
//		 * 2. ���Ϸ��� �ʵ尡 �⺻���̸� �⺻�������͸� ���������� �����ϴ� ����Ŭ���� ��ü��
//		 * 	  ��ȯ �Ŀ� hashCode()�� ����
//		 * 3. ���Ϸ��� �ʵ尡 1�� �̻��̸� 1, 2�� �� �ʵ��� Ÿ�Կ� ���߾� �����ϰ�
//		 *    ��� �ʵ��� ����� XOR(^) ������ ������� �� ����� �����Ѵ�.
//		 */
//		
//		// pcode�� ��
//		//return this.pcode.hashCode();
//		// ��� �ʵ� ��
//		//return pcode.hashCode()^pname.hashCode()^new Integer(price).hashCode()^new Integer(quantity).hashCode();
//	}
	 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcode == null) ? 0 : pcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pcode == null) {
			if (other.pcode != null)
				return false;
		} else if (!pcode.equals(other.pcode))
			return false;
		return true;
	}

	/**
	 * �Էµ� �ۼ�Ʈ��ŭ ���ε� ������ �����ϴ� �޼ҵ�
	 * 
	 * @param percentage
	 * @return int
	 */
	public int discount(double percentage) {
		int disPrice;
		disPrice = (int) (price - (price * percentage));
		return disPrice;
	}
	
	/**
	 * ���忡�� �Ǹ�(���)�Ǿ� �������� amount��ŭ �����ϴ� �޼ҵ�
	 * 
	 * @param amount
	 */
	public void sell(int amount) {
		if(quantity - amount > 0) {
			quantity -= amount;
		} else {
			System.out.println("�������� " + -(quantity - amount) +"�� �����մϴ�.");
		}
	}
	
	/**
	 * ���忡 �԰�Ǿ� ������(quantity)�� amount��ŭ �þ���� �ݿ�
	 * 
	 * @param amount
	 */
	public void buy(int amount) {
		quantity += amount;
	}
	
	/* -----------------------------------------------------------------------------------------------------------
	 * ĸ��ȭ�� �����Ͽ� ������� �ʵ��� ���ü��� private�� �����Ǹ� �ٸ� ��� Ŭ�������� ������ �Ұ���������.
	 * ���� ������ �ʵ忡 ������ �� �ִ� ���� �޼ҵ� ���� �����ؾ� �Ѵ�. ==> ������/������ �޼ҵ�
	 * ==========================================================================================================
	 * ������ �޼ҵ� : getter
	 * ----------------------------------------------------------------------------------------------------------
	 * 1. get���� ����
	 * 2. get �ڿ� ���� �̸��� �����Ϸ��� ������� �̸��� ù ���ڸ� �빮�ڷ� �ϴ� ��Ÿǥ���(camel_notation) ����
	 * 3. �޼ҵ� �Ű������� ������Ѵ�.
	 * 4. �޼ҵ� ����Ÿ���� �����Ϸ��� ��������� Ÿ�԰� �����.
	 * 5. ������� Ÿ���� boolean�� ���, get�� �ƴ϶� is�� �����ϵ��� �ۼ�
	 * 6. getXxx(), isXxx() ���·� ����
	 * =========================================================================================================
	 * ������ �޼ҵ� : setter
	 * ---------------------------------------------------------------------------------------------------------
	 * 1. set���� ����
	 * 2. set �ڿ� ���� �̸��� �����Ϸ��� ������� �̸��� ù ���ڸ� �빮�ڷ� �ϴ� ��Ÿǥ��� ����
	 * 3. �޼ҵ� �Ű������� �����Ϸ��� ������� Ÿ�԰� ���߰� ���� �����Ϸ��� ������� �̸��� ���� ����
	 * 4. ����Ÿ���� void�� �Ѵ�.
	 * 5. ���� ������ ������ this.������� = �Ű�����; �� �ۼ�
	 * ----------------------------------------------------------------------------------------------------------
	 * 
	 */
	
	// ������ �޼ҵ� ����
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// ������ �޼ҵ�
	public String getPcode() {
		return pcode;
	}
	
	public String getPname() {
		return pname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public static void main(String[] args) {
		System.out.println("print1 ====================================");
	}
}
