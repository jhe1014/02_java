package api.string.test;

/**
 * ���� ���ڿ� API Ŭ������ StringBuffer Ŭ������ �׽�Ʈ
 * 
 * @author Administrator
 *
 */

public class StringBufferTest {

	public static void main(String[] args) {
		// 1. ����
		String str;
		StringBuffer buffer;
		
		// 2. �ʱ�ȭ
		str = "�ȳ��ϼ���.";
		//buffer = "�ȳ��ϼ���."; 
		// StringBuffer Ÿ���� Stringó�� ���ڿ��� �ٷ����� �⺻��ó�� �Ҵ��� �� ����.
		
		buffer = new StringBuffer(str);
		
		// 3. ��� : �޼ҵ� �׽�Ʈ
		System.out.println(buffer);
		// (1) append(String) ���ڿ��� �߰�
		//	   append(..) �޼ҵ�� �Ű������� Ÿ�Ժ��� �ߺ����� �Ǿ� �־ ���ϴ� Ÿ���� �����͸� �߰��ؼ�
		//	   ���ڿ��� ���� �� �ִ�.
		buffer.append(", �ڹ�");
		buffer.append(true);
		
		System.out.println(buffer);
		
		// (2) length() : ���ڿ��� ���̸� ������ ����
		System.out.println("buffer�� ���� : " + buffer.length());
		
		// (3) reverse() : ���ڿ��� ����� StringBuffer�� ����
		System.out.println(buffer.reverse());
		buffer.reverse();
		
		// (4) setLength() : ���� ���ڿ��̱⶧���� ���̸� ����
		buffer.setLength(5);
		System.out.println(buffer);
		
	}

}
