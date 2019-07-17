package marker;

public class MarkerTest {

	public static void main(String[] args) {
				
		// 선언
		Marker blackmarker;
		Marker redmarker;
		
		// 초기화
		blackmarker = new Marker(true, false, "검은색");
		redmarker = new Marker(false, true, "빨간색");
		
		// 상태 출력
		blackmarker.print();
		redmarker.print();
		
		// 마커 사용
		blackmarker.use(blackmarker.color);
		redmarker.use(redmarker.color);
		
	}

}
