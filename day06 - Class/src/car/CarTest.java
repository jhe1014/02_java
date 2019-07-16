package car;

/**
 * 
 * Car(자동차)라는 타입의 실제 객체를 생성하여 사용(테스트)하는 클래스
 * 
 * @author Administrator
 *
 */

public class CarTest {

	public static void main(String[] args) {
		// Car라는 타입의 객체를 사용하기 위한 참조 변수가 필요함.
		// 1. Car 타입의 변수 선언 
		Car myCar;
		
		// 2. 초기화
		myCar = new Car();
		
		// 3. 사용 : Car라는 타입(클래스)에 정의된 메소드 호출
		// (1) 별명 붙이기
		myCar.setNickname("세계최강 슈퍼카");
		
		System.out.println("1. myCar의 초기화 후 속도");
		myCar.print();
		
		System.out.println("2. 60만큼 가속 후 속도");
		myCar.accelerate(60);
		myCar.print();
		
		System.out.println("3. 20만큼 추가 가속 후 속도");
		myCar.accelerate(20);
		myCar.print();
		
		System.out.println("4. 정지 후 속도");
		myCar.stop();
		myCar.print();
		
	}

}
