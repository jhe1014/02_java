package account.two;

/**
 * ���� ���¸� �����ϴ� Ŭ����
 * -------------------------------
 * ������ �Ӽ��� ��Ÿ���� ���Ͽ� �� ���� ������� ����
 * ���¹�ȣ : accNumber;
 * �����ܾ� : balance;
 * -------------------------------
 * �⺻������ : �Ű������� ����ִ� ������
 * �Ű������� �ִ� ������ : �Ű����� ����� �ִ� ������
 * -------------------------------
 * ������ �ܾ��� ������Ű�� �Ա� �޼ҵ� : deposit(int amount)
 * ������ ���� ���� ����ϴ� �޼ҵ� : print()
 * 
 * @author Administrator
 *
 */

public class Account {
	// 1. �������(��ü����) �����
	/** ���¹�ȣ */
	int accNumber;
	
	/** ���� �ܾ� */
	int balance;
	
	// 2. ������ �����(����)
	/**
	 * �⺻ ������ : Ŭ���� �̸��� ��ҹ��ڱ��� ��� �����ϰ�
	 * 				 �Ű����� ����� ����ִ� ������
	 */
	Account() {
		//accNumber = 0;
		//balance = 0;
	}
	
	/**
	 * ���� ��ȣ, ���� �ܾ��� �Ű������� �޾Ƽ�
	 * �Էµ� ������ ���¸� ��üȭ(�ʱ�ȭ)�ϴ� ������
	 * 
	 * �ߺ����ǵ� ������
	 * 
	 * @param newAccNumber
	 * @param newBalance
	 */
	
	Account(int newAccNumber, int newBalance) {
		accNumber = newAccNumber;
		balance = newBalance;
	}
	
	/**
	 * 
	 * ���ڿ��� �� ���¹�ȣ�� �������� �ܾ��� �Է¹޾Ƽ�
	 * ���� ���¹�ȣ(accNumber)�� �ܾ�(balance) �ʵ带 �ʱ�ȭ�ϴ� �ߺ����� �� ������
	 * 
	 * �ߺ�����(Overloading)
	 * ---------------------------------------
	 * �޼ҵ��� �̸��� ����, �Ű����� ����� �ٸ� �޼ҵ带 �����ϴ� ���
	 * �ߺ����Ǵ� �����ڿ��� ����Ǵ� ���� ���
	 * 
	 * �Ű����� ����� �ٸ���
	 *  (1) ������ �ٸ���
	 *  (2) ������ ���� ���� �Ű������� Ÿ���� ������ �ٸ���
	 *  
	 * @param strAccNumber
	 * @param newBalance
	 * 
	 */
	
	Account(String strAccNumber, int newBalance) {
		accNumber = Integer.valueOf(strAccNumber);
		balance = newBalance;
	}
	
	// 3. �޼ҵ� �����
	/**
	 * �Էµ� amount��ŭ �� ������ �ܾ��� ������Ų��.
	 * 
	 * @param amount : int �Ա��� �ݾ�
	 */
	public void deposit(int amount) {
		int value = 0;
		value += amount;
		balance += amount;
	}
	
	public void print() {
		System.out.printf("���¹�ȣ : %d | \t�����ܾ� : %d%n", accNumber, balance);
	}
	
	/**
	 * ����ϴ� �޼ҵ� withdraw
	 * 
	 * ����Ϸ��� �ݾ�(amount) ��ŭ �ܾ׿��� �����ϴ� �޼ҵ�
	 * 
	 * ���� �ܾ��� amount���� ������ ����� �������� �ʴ´�.
	 * ����� �����ϸ� "�ܾ��� �����մϴ�."��� ���ڿ��� �����ϰ�
	 * ����� �����ϸ� "��...�� ��ݵǾ����ϴ�. �ܾ��� ���Դϴ�." 
	 * ��� ���ڿ��� �����Ѵ�.
	 *  
	 * @param amount : int ����Ϸ��� �ݾ�
	 */
	
	public String withdraw(int amount) {
		String result;
		
		if (balance < amount) {
			result = "�ܾ��� �����մϴ�.";
		} else {
			balance -= amount;
			result = amount + "�� ��ݵǾ����ϴ�. �ܾ��� " + balance + "�Դϴ�.";
		}
		
		return result;
	}
}
