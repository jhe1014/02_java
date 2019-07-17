package lecture;

/**
 * 2개의 지우개와 4개의 마커를 배열을 사용하여 관리하는 테스트 클래스
 * ----------------------------------------------------------------------
 * 1. 마커(Marker) 배열 markers를 선언
 * 	  지우개(Eraser) 배열 erasers를 선언
 * 
 * 2. markers는 길이 4로 생성
 *    erasers는 길이 2로 생성
 *    
 *  markers[0]
 *  ~ 			<= 순서대로 red, green, blue, black 마커를 저장
 *  markers[3] 
 *
 *  erasers[0], [1] 에는 순서대로 leftEraser, rightEraser를 저장
 *  
 * 3. foreach를 사용하여
 * 	 (1) 모든 마커를 한 번씩 사용 (use())
 * 	 (2) 모든 지우개를 한 번씩 사용 (erase())
 * 	 (3) 모든 지우개를 한 번씩 한 겹 벗겨내기 (peel())
 * 	 (4) 모든 지우개의 상태 출력
 *   (5) 모든 마커의 상태 출력
 *   
 * @author Administrator
 *
 */

public class LectureTestByArray {

	public static void main(String[] args) {
		
		Marker[] markers = new Marker[4];
		Eraser[] erasers = new Eraser[2];
		
		markers[0] = new Marker(true, true, "빨간색");
		markers[1] = new Marker(false, false, "초록색");
		markers[2] = new Marker(true, false, "파란색");
		markers[3] = new Marker(true, false, "검정색");
				
	    erasers[0] = new Eraser(5.0, 11.5, 4.0, 5, "검정색", "왼쪽");
	    erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
	    
		for(Marker marker : markers) {
			marker.use(marker.color);
		}
		
		System.out.println("========================================");
		
		for(Eraser eraser : erasers) {
			eraser.erase();
		}
		
		System.out.println("========================================");
		
		for(Eraser eraser : erasers) {
			eraser.peel();
		}
		
		System.out.println("========================================");
		
		for(Eraser eraser : erasers) {
			eraser.print();
		}
		
		System.out.println("========================================");
		
		for(Marker marker : markers) {
			marker.print();
		}
		
	}

}
