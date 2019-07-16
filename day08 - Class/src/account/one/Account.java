package account.one;

/**
 * ���� ���¸� �����ϴ� Ŭ����
 * -------------------------------
 * ������ �Ӽ��� ��Ÿ���� ���Ͽ� �� ���� ������� ����
 * ���¹�ȣ : accNumber;
 * �����ܾ� : balance;
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
}
