package api.string.test;

/**
 * ������� �ʴ� ���ڿ��� �����ϴ� String Ŭ���� ��ü�� �׽�Ʈ�ϴ� Ŭ����
 * 
 * @author Administrator
 *
 */

/**
 * ������� �ʴ� ���ڿ��� �����ϴ� String Ŭ���� ��ü�� �׽�Ʈ�ϴ� Ŭ����
 * -------------------------------------------------------------------------
 * new String(...)���� �������� �ʰ� "...."�� ���� �Ҵ��ϴ� String �ν��Ͻ���
 * literal pool�̶�� �θ��� ������ ���� �����ȴ�.
 *
 * literal pool�� Ư¡�� ������ �����ʹ� �����Ѵٴ� ��.
 * 
 * @author Administrator
 *
 */

public class StringTest {

	public static void main(String[] args) {
		// String ���� ����
		String str1 = new String("�ȳ��ϼ���.");
		String str2 = new String("�ȳ��ϼ���.");
		String str3 = "�ȳ��ϼ���.";
		String str4  = "�ȳ��ϼ���.";
		
		System.out.println("=== ��ü �� : �������� ���� ȭ��ǥ�� �����ϴ� �� ===");
		System.out.printf("str1 == str2 ? %b%n", str1 == str2); 
		System.out.printf("str1 == str3 ? %b%n", str1 == str3);
		System.out.printf("str3 == str4 ? %b%n", str3 == str4);
		
		System.out.println("=== ��ü ���� �� ===");
		System.out.printf("str1.equals(str2) ? %b%n", str1.contentEquals(str2));
		System.out.printf("str1.equals(str3) ? %b%n", str1.contentEquals(str3));
		System.out.printf("str3.equals(str4) ? %b%n", str3.contentEquals(str4));
		
	}

}
