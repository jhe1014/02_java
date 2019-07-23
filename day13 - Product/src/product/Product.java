package product;

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
}
