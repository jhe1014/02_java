package product;

/**
 * 전자제품을 판매하는 매장에서 관리하는 대상인 "제품"을 정의하는 클래스
 * ----------------------------------------------------------------------
 * 멤버변수 (접근제한자 쓰지 말기)
 * 제품번호 : pcode    : String : <== "P001"
 * 제품명   : pname    : String : <== "삼성 지펠 ...."
 * 가격 	: price    : int    : 진짜 그 제품 가격 넣기
 * 재고수량 : quantity : int
 * ----------------------------------------------------------------------
 * 생성자 (public으로 선언)
 * 기본생성자, 매개변수 받는 생성자 필드 1씩 늘려가며 this, this() 사용
 * ----------------------------------------------------------------------
 * 메소드 (public으로 선언) 
 * print() : void ==> 제품의 상태를 출력
 * 
 * toString() : String ==> 이 제품을 대표하는 문자열을 리턴
 * 						   String.format()으로 문자열 생성 후 리턴
 * 
 * discount(double percentage) : int ==> 입력된 퍼센트만큼 할인된 가격
 * 
 * sell(int amount) : void ==> 매장에서 판매(출고)되어 재고수량이 amount만큼 줄어들도록 반영
 * 							   재고수량이 0보다 작아질 수 없도록 제한
 * 
 * buy(int amount) : void ==> 매장에 입고되어 재고수량(quantity)이 amount만큼 늘어나도록 반영  
 * 
 * =======================================================================
 * 작성시 주의 할 것
 * 각 필드를 선언할 때, 필드에 대한 설명을 문서 주석으로 달 것.
 * 각 생성자 선언할 때, 문서 주석 달 것.
 * 각 메소드 선언할 때, 메소드 설명을 문서 주석으로 달 것.
 * 
 * @author Administrator
 *
 */

public class Product {
	/** >> Product 클래스가 갖는 필드 선언	 */
	String pcode; /** pcode : 제품번호 */
	String pname; /** pname : 제품명 */
	int price; /** price : 가격 */
	int quantity; /** quantity : 재고수량 */
	
	/** 
	 * 기본생성자 선언
	 */
	public Product() {
		
	}
	
	// 생성자 중복정의
	/**
	 * pcode만 초기화하는 생성자
	 * @param pcode
	 */
	public Product(String pcode) {
		this();
		this.pcode = pcode;
	}
	
	/**
	 * pcode와 pname만 초기화하는 생성자
	 * @param pcode
	 * @param pname
	 */
	public Product(String pcode, String pname) {
		this(pcode);
		this.pname = pname;
	}
	
	/**
	 * pcode, pname,price만 초기화하는 생성자
	 * @param pcode
	 * @param pname
	 * @param price
	 */
	public Product(String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;
	}
	
	/**
	 * 모든 필드를 초기화하는 생성자
	 * @param pcode
	 * @param pname
	 * @param price
	 * @param quantity
	 */
	public Product(String pcode, String pname, int price, int quantity) {
		this(pcode, pname, price);
		this.quantity = quantity;
	}
	
	/**
	 *  제품의 상태를 출력하는 메소드
	 */
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * 이 제품을 대표하는 문자열을 리턴하는 메소드
	 * 
	 * @return String
	 */
	public String toString() {
		return String.format("제품번호 : %s, 제품명 : %s, 가격 : %d, 재고수량 : %d", pcode, pname, price, quantity);
	}
	
	/**
	 * 입력된 퍼센트만큼 할인된 가격을 리턴하는 메소드
	 * 
	 * @param percentage
	 * @return int
	 */
	public int discount(double percentage) {
		int disPrice;
		disPrice = (int) (price - (price * percentage));
		return disPrice;
	}
	
	/**
	 * 매장에서 판매(출고)되어 재고수량이 amount만큼 감소하는 메소드
	 * 
	 * @param amount
	 */
	public void sell(int amount) {
		if(quantity - amount > 0) {
			quantity -= amount;
		} else {
			System.out.println("재고수량이 " + -(quantity - amount) +"개 부족합니다.");
		}
	}
	
	/**
	 * 매장에 입고되어 재고수량(quantity)이 amount만큼 늘어나도록 반영
	 * 
	 * @param amount
	 */
	public void buy(int amount) {
		quantity += amount;
	}
}
