package array.init;

/** ������ Ÿ���� String Ÿ���� �迭 emps�� �ʱ�ȭ ����� ����Ͽ� �ʱ�ȭ�ϰ�
 * ������ ����غ��� �׽�Ʈ Ŭ����
 * 
 * @author Administrator
 *
 */

public class StringArrayInitList {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		String[] students = {"������", "������", "������", "������"};
		
		// 3. ��� (foreach)
		for (String name : students) {
			System.out.println("�л��� �̸� = " + name);
		}
		
		System.out.println("");
		
		for (int idx = 0; idx < students.length; idx++) {
			System.out.println("�л��� �̸� = " + students[idx]);
		}
		  
		
	}

}
