package api.string.test;

/**
 * String : ������� �ʴ� ���ڿ�
 * StringBuilder : ����Ǵ� ���ڿ�
 * 
 * �� Ŭ������ �ν��Ͻ��� ���ڿ� ���� �� �����Ǵ��� ���θ� Ȯ���ϴ� �׽�Ʈ Ŭ����
 * 
 * @author Administrator
 *
 */

public class StringClasses {

	public static void main(String[] args) {
		// 1. ���� 2. �ʱ�ȭ
		String str = new String("�ȳ��ϼ���.");
		StringBuilder builder = new StringBuilder("�ȳ��ϼ���.");
		
		// 3. ���
		System.out.println("===== ���� �� =====");
		// (1) �ʱ�ȭ ���� ���� ���
		System.out.println("str : " + str);
		System.out.println("builder : " + builder);
		// (2) �ʱ�ȭ ���� ��ü���������� �ؽð��� ���
		System.out.print("str�� hash : ");
		System.out.println(str.getClass().getName() + "@" + Integer.toHexString(str.hashCode()));
		System.out.print("builder�� hash : ");
		System.out.println(builder.getClass().getName() + " @" + Integer.toHexString(builder.hashCode()));
		
		System.out.println("===== ���� �� =====");
		// (3) �� ���� ��
		str = str + ", �ڹ�";
		builder.append(" �ڹ�");
		//(4)
		System.out.println("str : " + str);
		System.out.println("builder : " + builder);
		System.out.print("str�� hash : ");
		System.out.println(str.getClass().getName() + "@" + Integer.toHexString(str.hashCode()));
		System.out.print("builder�� hash : ");
		System.out.println(builder.getClass().getName() + " @" + Integer.toHexString(builder.hashCode()));
	}

}
