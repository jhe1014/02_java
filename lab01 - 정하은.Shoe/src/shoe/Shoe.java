package shoe;

/**
 * 신발의 정보를 저장하는 클래스
 * ----------------------------------
 * code     : int 	 : 신발 제품코드
 * name 	: String : 신발 제품 명
 * size 	: int 	 : 신발의 사이즈
 * price 	: int 	 : 가격
 * type 	: String : 신발의 타입
 * quantity : int 	 : 재고수량
 * -----------------------------------
 * 생성자 중복정의
 * -----------------------------------
 * 접근자/수정자 메소드
 * equals(), hashCode() 재정의
 * toString() 재정의
 * 
 * @author Administrator
 *
 */

public class Shoe {
	
	 // 1. 변수 선언
	 private int code;
	 private String name;
	 private int size;
	 private int price;
	 private String type;
	 private int quantity;
	 
	 // 2. 생성자 선언
	 public Shoe() {
	 }
	 
	 public Shoe(int code) {
		 this();
		 this.code = code;
	 }
	 
	 public Shoe(int code, String name) {
		 this(code);
		 this.name = name;
	 }
	 
	 public Shoe(int code, String name, int size) {
		 this(code, name);
		 this.size = size;
	 }
	 
	 public Shoe(int code, String name, int size, int price) {
		 this(code, name, size);
		 this.price = price;
	 }
	 
	 public Shoe(int code, String name, int size, int price, String type) {
		 this(code, name, size, price);
		 this.type = type;
	 }
	 
	 public Shoe(int code, String name, int size, int price, String type, int quantity) {
		 this(code, name, size, price, type);
		 this.quantity = quantity;
	 }

	// 3. 메소드 선언
	// (1) 접근자 / 수정자
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	 
	// (2) equals(), hashCode() 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoe other = (Shoe) obj;
		if (code != other.code)
			return false;
		return true;
	}
	
	public String toString() {
		return String.format("[%d] 제품명 : %s, 사이즈 : %d, 가격 : %d, 분류 : %s, 재고수량 : %d%n",
				code, name, size, price, type, quantity);
	}
	
}
