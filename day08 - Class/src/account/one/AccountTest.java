package account.one;

/**
 * ����(Account Ÿ��) Ŭ������ �ν��Ͻ�(��ü, ��ü)�� �����ϰ�
 * �Աݱ��, ���� ���� ���� ��� ��� ���� �׽�Ʈ�ϴ� Ŭ����
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. ����
		Account account;
		Account myAccount;
		
	    // 2. �ʱ�ȭ
		account = new Account();
		myAccount = new Account();
		
		// 3. ���
		// (1) ���� ���� ���� ���� ���
		System.out.println("account�� ����");
		account.print();
		
		System.out.println("MyAccount�� ����");
		myAccount.print();
		
		System.out.println("==========================================");
		
		// (2) ���¿� 10,000�� �Ա�
		System.out.println("account�� 10,000�� �Ա�");
		account.deposit(10000);
		
		System.out.println("MyAccount�� 10,000�� �Ա�");
		myAccount.deposit(10000);
		
		// (3) �Ա� �� ���� ���
		System.out.println("account�� ����");
		account.print();
		System.out.println("MyAccount�� ����");
		myAccount.print();
		
		System.out.println("==========================================");
		
		// (4) ���¿� 5,000�� �Ա�
		account.deposit(5000);
		myAccount.deposit(5000);
		
		// (5) �Ա� �� ���� ���
		account.print();
		myAccount.print();
		
	}

}
