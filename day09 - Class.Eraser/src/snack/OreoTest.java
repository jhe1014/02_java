package snack;

/**
 * Oreo 쿠키가 10개 들어있는 oreoBox라는 변수를
 * Oreo 배열타입으로 선언하고
 * 
 * oreoBox[0] ~ [2] Oreo 쿠키를 입력
 * 크림의 종류는 바닐라, 초코, 딸기, 말차 중 하나로 입력할 것
 * 
 * foreach를 사용하여
 * oreoBox에서 쿠키의 상태를 출력
 * 
 * for를 사용하여 모든 쿠키의 크림을 바닐라로 변경
 * 
 * foreach 사용해서 모든 쿠키의 크림 변경 상태 확인을 위한 출력
 * 
 * @author Administrator
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		Oreo[] oreoBox = new Oreo[3];
		
		oreoBox[0] = new Oreo("초코", 3.5, 1.0);
		oreoBox[1] = new Oreo("딸기", 3.48, 1.09);
		oreoBox[2] = new Oreo("말차", 3.51, 1.0);
		
		for(Oreo oreo : oreoBox) {
			oreo.print();
		}
		
		System.out.println("====================================================================");
		
		for(int i = 0; i < oreoBox.length; i++) {
			oreoBox[i].cream = "바닐라";
		}
		
		for(Oreo oreo : oreoBox) {
			oreo.print();
		}
	}
}
