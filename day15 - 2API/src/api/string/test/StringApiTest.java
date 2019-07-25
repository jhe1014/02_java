package api.string.test;

/**
 * String Ŭ������ �޼ҵ���� �׽�Ʈ�ϴ� Ŭ����
 * ------------------------------------------------
 * 
 * @author Administrator
 *
 */
public class StringApiTest {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		// (1) char[] ����
		char[] data = {'a', 'b', 'c'};
	
		// (2) String ���� ����
		String str1 = new String(data);
		String str2 = "def";
		String str3 = "XYZ";
	
		// 3. String Ŭ������ �޼ҵ�� ���
		// (1) charAt(int) : Ư�� �ε����� ���� 1���� ��
		System.out.println(str1.charAt(2)); // c
		
		// (2) concat(String) : ���ڿ��� ���� ��� ����
		System.out.println(str1.concat(str2)); // abcdef
		
		// (3) substring(int) : �Էµ� �ε������� ������ ���ڱ��� ����
		System.out.println(str3.substring(1)); // YZ
		
		// (4) substring(int, int)
		System.out.println(str1.concat(str2).concat(str3).substring(2, 5)); // cde
		
		// (5) replace(char, char) : ���� �Ű����� ���ڸ� ���� �Ű����� ���ڷ� ġȯ
		System.out.println(str1.replace('a', 'x')); // xbc
		
		// (6) toUpperCase() : �빮�ڷ� ����
		System.out.println(str1.toUpperCase()); // ABC
		
		// (7) toLowerCase() : �ҹ��ڷ� ����
		System.out.println(str3.toLowerCase()); // xyz
		
		// (8) length() : ���ڿ��� ���̸� ������ ����
		System.out.println(str2.length()); // 3
		System.out.println(str1.concat(str2).concat(str3).length()); // 9
	}

}
