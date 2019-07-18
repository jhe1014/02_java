package account;

/**
 * ����(Account Ÿ��) Ŭ������ �ν��Ͻ�(��ü, ��ü)�� �����ϰ�
 * �� ��, �ߺ����ǵ� �����ڸ� ����ؼ� ��üȭ�� �����ϰ� 
 * �׷��� ������ ��ü�� �׽�Ʈ�ϴ� Ŭ����
 * 
 * @author Administrator
 *
 */

public class AccountTest {

	public static void main(String[] args) {
		// 1. ����
		Account myAccount;
		Account yourAccount;
		Account hisAccount;
		String result;
		
		// 2. �ʱ�ȭ
		// (1) �⺻�����ڷ� �ʱ�ȭ
		myAccount = new Account();
		// (2) �Ű������� �޴� �ߺ����ǵ� �����ڷ� �ʱ�ȭ
		yourAccount = new Account(1, 10000);
		hisAccount = new Account("2", 30000);
		

		// 3. ���
		// (1) ���� �������ڸ��� �ʱ� ���� ���
		myAccount.print();
		yourAccount.print();
		
		System.out.println("=================================");
		
		// (2) �Ա� : 1000�� : �� ���¿� ���
		myAccount.deposit(1000);
		yourAccount.deposit(1000);
		
		// (3) ��� : �� ���� ��� ���
		System.out.println("MyAccount�� ����");
		myAccount.print();
		System.out.println("YourAccount�� ����");
		yourAccount.print();
		
		// (4) �Ա� : 5000��
		myAccount.deposit(5000);
		yourAccount.deposit(5000);
		
		// (5) ��� : �� ���� ���
		System.out.println("MyAccount�� ����");
		myAccount.print();
		System.out.println("YourAccount�� ����");
		yourAccount.print();
		
		// (6) ��� : 4000��
		//myAccount.deposit(-4000);
		result = myAccount.withdraw(7000);
		System.out.println("MyAccount : " + result);
		yourAccount.deposit(-4000);
		
		// (7) ���
		System.out.println("MyAccount�� ����");
		myAccount.print();
		System.out.println("YourAccount�� ����");
		yourAccount.print();
	}

}
