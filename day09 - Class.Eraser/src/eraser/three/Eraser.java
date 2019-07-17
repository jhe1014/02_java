package eraser.three;

/**
 * 칠판 지우개를 정의하는 클래스
 * ---------------------------------------
 * 칠판 지우개 속성 정의 => 멤버변수로 생성
 * 가로 : width : double
 * 세로 : height : double
 * 높이 : depth : double
 * 겹   : layer : int
 * 색상 : color : String
 * ---------------------------------------
 * 생성자 정의 : 중복정의
 * 기본생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * 
 * 생성자 리팩토링(1) : this 키워드를 사용하여 매개변수 생성자 정의
 * 생성자 리팩토링(2)
 * ---------------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판 지우기 : erase() : void : "칠판을 지웠습니다." 문자열 출력
 * 한 겹씩 제거 : peel() : void : 현재 layer 값에서 1 감소
 * 				  				 layer가 0이 될 때까지
 * 지우개 상태 출력 : print() : void
 * 							  : 현재 지우개의 가로, 세로, 높이, 겹, 색상 등의 상태를 출력 
 * 
 * @author Administrator
 *
 */
public class Eraser {
	
	// 1. 멤버변수 선언부
		double width;
		double height;
		double depth;
		int layer;
		String color;
		
	// 2. 생성자 선언부
		Eraser() {
		/*
		 * width = 0.0; height = 0.0; layer = 0; color = null;
		 */
		}
		
		// 매개변수가 있는 생성자 :
		Eraser(double width) {
			// 기본 생성자 호출 : 매개변수가 비어있는 this() 이므로
			this();
			// width 필드는 매개변수로 넘겨진 값으로 초기화
			this.width = width;
		}
		
		/**
		 * 지우개의 가로, 세로, 높이 필드를 초기화하는 생성자
		 * 
		 * @param width : 가로길이 => 매개변수 2개 받는 생성자로 초기화
		 * @param height : 세로길이 => 매개변수 2개 받는 생성자로 초기화
		 * @param depth : 높이 => 직접 초기화
		 */
		Eraser(double width, double height, double depth) {
			this(width, height);
			this.depth = depth;
		}
		
		/**
		 * 가로, 세로 높이, 겹을 초기화하는 생성자
		 * 
		 * @param width : 가로길이 => 매개변수 3개 받는 생성자로 초기화
		 * @param height : 세로길이 => 매개변수 3개 받는 생성자로 초기화
		 * @param depth : 매개변수 3개 받는 생성자로 초기화
		 * @param layer : 직접초기화
		 */
		Eraser(double width, double height, double depth, int layer) {
			this(width, height, depth);
			this.layer = layer;
		}
		
		/**
		 * 
		 * @param width
		 * @param height
		 * @param depth
		 * @param layer
		 * @param color
		 */
		Eraser(double width, double height, double depth, int layer, String color) {
			this(width, height, depth, layer);
			this.color = color;
		}
		
		/**
		 * 지우개의 가로, 세로 필드만 초기화하는 생성자
		 * 
		 * @param width : 가로길이 => width 필드를 초기화하는 생성자
		 * @param height : 세로길이 => height 필드를 초기화하는 생성자
		 */
		Eraser(double width, double height) {
			this(width);
			this.height = height;
		}
	// 3. 메소드 선언부
		public void erase() {
			System.out.println("칠판을 지웠습니다.");
		}
		
		/**
		 * 남아있는 지우개 겹을 벗겨내는 메소드
		 * layer 값이 0보다 작을 수는 없다.
		 */
		
		public void peel() {
			// if를 사용하여 layer 값이 0보다 작아질 수 없도록 값을 체크
			if(layer > 0) {
				layer--;
			} else {
				
			}
		}
		
		public void print() {
			System.out.println("현재 지우개의 가로는 " + width + ", 세로는 " + height + ", 높이는 " + depth 
								+ ", 겹은 " + layer + ", 색상은 " + color + "입니다.");
		}
}
