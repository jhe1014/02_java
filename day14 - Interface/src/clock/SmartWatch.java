package clock;

/**
 * Clock �������̽��� �����Ͽ� ����Ʈ��ġ�� �����ϴ� Ŭ����
 * SmartWatch�� �����ϴ� Ŭ����
 * -----------------------------------------------------------------------------------
 * �������̽��� �����ϸ� �����ϴ� �������̽� �ȿ� ����� �߻�޼ҵ带 �����ް� �ȴ�.
 * Ŭ������ �߻�޼ҵ带 ������ ������ �ݵ�� �߻�Ŭ������ ����Ǿ�� �Ѵ�.
 * 
 * @author Administrator
 *
 */

public abstract class SmartWatch implements Clock {
	/**
	 * ����Ʈ��ġ �̸��� �����ϴ� ����
	 */
	private String watchName;
	
	// ������/������
	public void setWatchName(String watchName) {
		this.watchName = watchName;
	}
	
	public String getWatchName() {
		return watchName;
	}
	
	// Clock �������̽����� ��ӹ��� displayTime() �޼ҵ尡 �������� �ʾ����Ƿ� �߻�Ŭ������ �ۼ�
	// ==> �ν��Ͻ�ȭ �Ұ����� �߻�Ŭ������ �Ǹ� �������� 
}
