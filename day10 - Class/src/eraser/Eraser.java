package eraser;

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
 * 기본생성자 명시 : 기본 생성자에서 serial 변수에 증가된 count 변수의 값을 저장
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
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

	// TODO 스태틱 변수 int 타입의 count를 선언하고 0으로 초기화
		static int count = 0;
	
	// 1. 멤버변수 선언부
		// TODO int 타입의 일련번호 저장할 멤버변수 serial 선언
		int serial;
		double width;
		double height;
		double depth;
		int layer;
		String color;
		
	// 2. 생성자 선언부
		Eraser() {
			// TODO 멤버변수인 serial을 count 클래스 변수를 증가시킨 값으로 저장
			this.serial = ++count;
			
		/*
		 * width = 0.0; height = 0.0; layer = 0; color = null;
		 */
		}
		
		// (2) 매개변수가 있는 생성자 : 
		/**
		 * 지우개의 가로 필드만 초기화 생성자
		 * @param width : 가로 길이 => 직접초기화
		 */
		Eraser(double width) {
			// 57 줄의 기본 생성자 호출 
			//    : 매개변수가 비어있는 this() 이므로
			this();
			// width 필드는 매개변수로 넘겨진 값으로 초기화
			this.width = width;
		}
		
		/**
		 * 지우개의 가로, 세로 필드만 초기화하는 생성자	 
		 * @param width : 가로길이 
		 *       => width 필드를 초기화하는 생성자의 기능을 사용
		 * @param height: 세로길이 => 직접초기화
		 */
		Eraser(double width, double height) {
			this(width);
			this.height = height;
		}

		/**
		 * 지우개의 가로, 세로, 높이 필드를 초기화하는 생성자
		 * @param width  : 가로길이 ==> 매개변수 2개 받는 생성자로 초기화
		 * @param height : 세로길이 ==> 매개변수 2개 받는 생성자로 초기화
		 * @param depth  : 높이 ==> 직접 초기화
		 */
		Eraser(double width, double height, double depth) {
			this(width, height);
			this.depth = depth;
		}
		
		/**
		 * 가로, 세로, 높이, 겹을 초기화하는 생성자
		 * @param width : 가로길이==> 매개변수 3개받는 생성자로 초기화
		 * @param height: 세로길이==> 매개변수 3개받는 생성자로 초기화
		 * @param depth : 높이 ==> 매개변수 3개받는 생성자로 초기화
		 * @param layer : 직접초기화
		 */
		Eraser(double width, double height, double depth, int layer) {
			this(width, height, depth);
			this.layer = layer;
		}
		
		/**
		 * 모든 필드를 초기화하는 생성자
		 * @param width : 매개변수 4개 받는 생성자로 초기화
		 * @param height: 매개변수 4개 받는 생성자로 초기화
		 * @param depth : 매개변수 4개 받는 생성자로 초기화
		 * @param layer : 매개변수 4개 받는 생성자로 초기화
		 * @param color : 직접초기화
		 */
		Eraser(double width, double height, double depth
			  , int layer, String color) {
			// alt + shift + a : 세로 편집 모드 토글
			this(width, height, depth, layer);
			this.color = color;
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
			System.out.println(serial + " : 현재 지우개의 가로는 " + width + ", 세로는 " + height + ", 높이는 " + depth 
								+ ", 겹은 " + layer + ", 색상은 " + color + "입니다.");
		}
}
