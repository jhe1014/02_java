package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ǥ�� �Է��� Ű���� �Է��� �޾Ƽ� ǥ�� ����� �����(�ܼ�â) ����ϴ� Ŭ����
 * -------------------------------------------------------------------------------
 * 1. node stream (Ű���� = System.in : InputStream)
 * 2. filter stream (stream --> reader : InputStreamReader)
 * 	  1����Ʈ Ű���� ��ǲ��Ʈ���� 2����Ʈ ���ڷ� ����
 * 	  (Ű����� ���� �Է��̱� ������)
 * 3. filter stream (reader --> reader : BufferdReader)
 * 	  2����Ʈ ���ڸ� 1�� ������ �о String���� ���� �� �ִ� ���� �޼ҵ� ���
 * 4. 3���� ������� filter stream ��ü�� ����ؼ� read()�� �о���δ�.
 * 5.
 * 6. ������ ���� ��Ʈ������ �ݾƼ� �ڿ�����
 * 
 * @author Administrator
 *
 */

public class KeyboardInput {

	public static void main(String[] args) throws IOException {
		// 1. �Է� ��Ʈ��(ǥ�� �Է� : Ű����)
		InputStream in  = System.in;
		
		// 2. ��� ��Ʈ���� ������ ���� ��Ʈ��
		// 	  InputStream ==> Reader�� �ٲ��ִ� ���� ��Ʈ�� ����
		InputStreamReader ir = new InputStreamReader(in);
		
		System.out.println("���� �Է��ϼ���. (Crtl + Z �Է� �� �ߴܵ˴ϴ�.)");
		// 3. 2�� ���� ��Ʈ���� ���� ����� ���� �ٸ� ���� ��Ʈ������ ����
		BufferedReader br = new BufferedReader(ir);
		
		// 4. 3�� ���� ��Ʈ���� ���� �޼ҵ� ����ؼ� �б�
		String readData = null;
		
		try {
		while ((readData = br.readLine()) != null) {
			// 5. ���� �����Ͱ� null�� �ƴϸ� ǥ�� ��¿� ����ϱ�
			System.out.println("���� ������ : " + readData);
		}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 6. �ڿ� ����
			// 	  ���� �߻� ���ο� ���� ���� �ڿ������� �׻� ���������� �̷������ �ϹǷ� finally���� �����ϵ��� �ۼ�
			try {
				// br ��ü�� null�� �ƴ� ��츸 ������ �� �ֵ���
				if(br != null)
					br.close();
			} catch (IOException er) {
				System.out.println(er);
			}
		}
		
	}

}
