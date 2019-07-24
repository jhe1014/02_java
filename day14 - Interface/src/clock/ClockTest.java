package clock;

/**
 * Clock �������̽�, SmartWatch, GarminActive3, GalaxyGear4 Ŭ������ �׽�Ʈ
 * 
 * @author Administrator
 *
 */

public class ClockTest {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		// (1) SmartWatch �߻�Ŭ���� (����Ŭ����) Ÿ���� �迭 ����
		SmartWatch[] watches = new SmartWatch[2];
		
		// (2) �� �ε��� ��ġ�� GarminActive3, GalaxyGear4 �ν��Ͻ� ����
		watches[0] = new GarminActive3();
		watches[0].setWatchName("���� ��Ƽ��3");
		
		watches[1] = new GalaxyGear4();
		watches[1].setWatchName("������ ���4");
		
		// 3. ���
		for (SmartWatch watch : watches) {
			watch.displayTime();
		}
		
		//////////////////////////////////////////////////////////////
		// 4. �������̽� Ÿ���� ��������
		Clock myWatch;
		myWatch = new GarminActive3();
		
		Clock yourWatch;
		yourWatch = new GalaxyGear4();
		
		// �������̽�Ÿ�� �迭
		Clock[] clocks = new Clock[2];
		clocks[0] = new GarminActive3();
		clocks[1] = new GalaxyGear4();
		
		// clocks �迭�� �ִ� �ð��κ��� displayTime ȣ��
		for (Clock clock : clocks) {
			clock.displayTime(); 
		}

	}

}
