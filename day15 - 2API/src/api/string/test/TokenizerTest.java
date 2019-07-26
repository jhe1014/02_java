package api.string.test;

import java.util.StringTokenizer;

/**
 * StringTokenizer Ŭ������ �׽�Ʈ
 * 
 * StringTokenizer�� java.util ��Ű���� �����Ƿ� java.lang�� �ִ� Object, String, StringBuffer, StringBuilder�� ����
 * �⺻������ ����� �� ���� �ݵ�� ��������� import ������ ���� ��� ����
 * 
 * @author Administrator
 *
 */

public class TokenizerTest {

	public static void main(String[] args) {
		// 1. ����
		StringTokenizer token;
		
		// 2. �ʱ�ȭ
		token = new StringTokenizer("�ȳ��ϼ���, �ڹ�! ����ְ� ��������?");
		
		// 3. StringTokenizer �޼ҵ� �׽�Ʈ
		for(; token.hasMoreTokens();) {
			System.out.println(token.nextToken());
		}
		
		// ���� ���ǽĸ� ����� for �ݺ��� ���� ����
		/*while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}*/
		
		token = new StringTokenizer("�ȳ��ϼ���, �ڹ�! ����ְ� ��������?", "!");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		
	}

}
