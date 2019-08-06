package io.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ���� ���Ͽ��� �Է¹޾Ƽ� (���� ������ �о) ���� ���Ϸ� ���(���� ���Ϸ� ����)�ϴ� Ŭ����
 * ---------------------------------------------------------------------------------------------
 * -- �Է� --
 * 1. node stream (����(reader) ���� : FileReader)
 * 2. filter stream (reader --> reader : BufferedReader)
 * 3. �Է� filter stream�� �ٴ��� �Է� �޼ҵ� ���
 * 	  readLine()
 * 
 * -- ��� --
 * 4. node stream (����(writer) ���� : FileWriter)
 * 5. filter stream (writer --> writer : PrintWriter)
 * 6. ��� filter stream�� �ٴ��� ��� �޼ҵ� ���
 * 
 * -- ���� --
 * 7. �Է� filter stream �ݱ�
 * 8. ��� filter stream �ݱ�
 * 
 * @author Administrator
 *
 */
public class TextFileCopy {

	public static void main(String[] args) throws IOException {
		// 1. �Է� node stream : FileReader
		FileReader fr = new FileReader("out.txt");
		
		// 2. �Է� filter stream : BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		// ===== �Է� ��Ʈ���� ����, �ʱ�ȭ
		// 4. ��� node stream : FileWriter
		FileWriter fw = new FileWriter("copied.txt");
		
		// 5. ��� filter stream : PrintWriter
		PrintWriter out = new PrintWriter(fw);
		
		// ===== ��� ��Ʈ���� ����, �ʱ�ȭ
		// 3. �б� �۾� : readLine()
		String input = null;
		
		while((input = br.readLine()) != null) {
			// 6. ���� �۾� : println()
			out.println("����� ���� : " + input);
			// ȭ�� ��� ����
			System.out.println("���Ͽ��� ���� ������ : " + input);
		}
		System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");
		
		// 7. �Է� filter stream �ݱ�
		br.close();
		
		// 8. ��� filter stream �ݱ�
		out.close();
	}

}
