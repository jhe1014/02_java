package lecture;

import lecture.Eraser;
import lecture.Marker;

public class LectureTest {

	public static void main(String[] args) {
		// 1. 선언 : 칠판 지우개 객체 참조 변수
				Eraser leftEraser;
				Eraser rightEraser;
				
				// 2. 초기화
				leftEraser = new Eraser(5.0, 11.5, 4.0, 5, "검정색", "왼쪽");
				rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
				
				Marker black;
				Marker red;
				Marker green;
				Marker blue;
				
				// 초기화
				black = new Marker(true, false, "검은색");
				red = new Marker(false, true, "빨간색");
				blue = new Marker(true, true, "파란색");
				green = new Marker(false, false, "초록색");
				
				// (1) 네 개의 마커를 한 번씩 사용
				black.use(black.color);
				red.use(red.color);
				blue.use(blue.color);
				green.use(green.color);
				
				// (2) 오른쪽, 왼쪽 지우개로 사용한 내용 지우기
				rightEraser.erase();
				leftEraser.erase();
				
				// (3) 오른쪽 지우개 한 겹 벗겨내기
				rightEraser.peel();
				
				// (4) 오른쪽, 왼쪽 지우개 상태 출력
				rightEraser.print();
				leftEraser.print();

	}

}
