package marker;

public class Marker {
	// 1. 멤버변수 선언부
	boolean isOpened;
	boolean isNew;
	String color;
	 	
	// 2. 생성자 선언부
	Marker(){
		
	}
	
	Marker(boolean isOpened) {
		this();
		this.isOpened = isOpened;
	}
	
	Marker(boolean isOpened, boolean isNew) {
		this(isOpened);
		this.isNew = isNew;
	}
	
	Marker(boolean isOpened, boolean isNew, String color) {
		this(isOpened, isNew);
		this.color = color;
	}
	
	// 3. 메소드 선언부
	public void use(String color) {
		System.out.println(color + " 마커를 사용하고 있습니다.");	
	}

	public void print() {
		if (isOpened) {
			System.out.println("뚜껑이 열려있습니다.");
		} else {
			System.out.println("뚜껑이 닫혀있습니다.");
		}
		
		if(isNew) {
			System.out.println("새 마커입니다.");
		} else {
			System.out.println("다 쓴 마커입니다.");
		}
		
		System.out.println(color + " 마커입니다.");
	}
}
