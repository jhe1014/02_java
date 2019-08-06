package io.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����Ʈ ó���� �� �� �ִ� �̹��� ������ �Է¹޾Ƽ� �̹��� ���Ϸ� ����ϴ� (stream���θ� �۾��ϴ�) �̹��� ���� Ŭ����
 * -------------------------------------------------------------------------------------------------------------------------
 * -- �Է� --
 * 1. node stream (stream : FileInputStream)
 * 2. read �۾� : node stream �޼ҵ� read(byte[])
 * 
 * -- ��� --
 * 3. node stream (stream : FileOutputStream)
 * 4. write �۾� : node steam �޼ҵ� write(byte[])
 * 
 * -- ���� --
 * 5. �Է� node �ݱ�
 * 6. ��� node �ݱ�
 * 
 * @author Administrator
 *
 */
public class ImageCopy {

	public static void main(String[] args) throws IOException {
		// 1. �Է� node stream : FileInputSream
		FileInputStream in = new FileInputStream("Tulips.jpg");
		
		// ===== �Է� node stream ����, �ʱ�ȭ �Ϸ�
		
		// 3. ��� node stream : FileOutputStream
		FileOutputStream out = new FileOutputStream("Tulips-copied.jpg") ;
		
		// ===== ��� node stream����, �ʱ�ȭ �Ϸ�
		
		// 2. read �۾� : read(byte[]) �޼ҵ�
		//				  �б� �۾��� �Ű������� ���� byte[]�� ����
		
		// (1) ����Ʈ �迭 : buffer
		byte[] buffer = new byte[4096];
		
		// (2) read(byte[]) �޼ҵ�� �о���� ����Ʈ ���� ������ �����ϴ� �޼ҵ�
	    // 	   ���� �����Ͱ� ������ -1 ����
		int readSize = 0;
		int reapeat = 0;
		
		// (3) read()
		while((readSize = in.read(buffer)) != -1) {
			// 4. write(byte[]) �۾� : 
			//	  ��� node stream �޼ҵ�� �۾�
			out.write(buffer);
			
			// ȭ�鿡 �۾� ���� ���
			System.out.printf("���� ����Ʈ : %d\t, �ݺ� Ƚ�� : %d%n", readSize, ++reapeat);
		}
		
		System.out.println("�̹��� ���� ���簡 �Ϸ�Ǿ����ϴ�.");
		
		// 5, 6 ����� �ݱ�
		in.close();
		out.close();
		
	}

}
