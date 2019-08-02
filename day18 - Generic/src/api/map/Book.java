package api.map;

/**
 * 책 한 권의 정보를 담는 클래스
 * ------------------------------
 * 일련번호  : sequence  : int
 * ISBN 	 : isbn 	 : String
 * 제목 	 : title 	 : String
 * 저자 	 : author 	 : String
 * 출판사 	 : company 	 : String
 * 페이지 수 : totalPage : int
 * 가격 	 : price 	 : int
 * 재고수량  : quantitiy : int
 * ------------------------------
 * 생성자 중복정의(기본생성자 명시, 매개변수 생성자 중복정의)
 * ------------------------------
 * 메소드 : 책의 정보를 출력하는 메소드
 * void print() : 책의 정보를 출력하는 메소드
 * void buy(int amount) : amount만큼 책의 재고를 늘리는 메소드
 * void sell(int amount) : amount만큼 책의 재고를 줄이는 메소드
 * 
 * -- 각 필드를 설정하는 메소드
 * -- 자바 빈즈(Java Beans) 규격에 의한 접근자 / 수정자 메소드
 * -- getter/setter 
 * 
 * getter 작성시 메소드 이름 규격
 *  ==> get으로 시작하고 멤버변수필드의 첫글자를 대문자로 조합
 *  	매개변수는 없음
 *  	리턴타입이 해당 멤버변수 필드의 타입과 맞춤
 *  
 * 예 ) sequence 필드의 getter는 다음의 규격을 갖는다.
 * int getSequence() {
 * 		return this.sequence;
 * }
 * 
 * setter 작성시 메소드 이름 규격
 *  ==> set으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 *  	매개변수는 해당 멤버변수 필드와 같은 타입과 변수로 받음
 *  	리턴값 없이 작성
 * 예 ) 
 * void setSequence(int sequence) {
 * 		this.sequence = sequence;
 * }
 * 
 * 만약 멤버변수 필드가 boolean 타입이라면 getter의 이름은 get으로 시작하지 않고 is로 시작
 * =============================================================================================
 * 1. 캡슐화 적용 : 멤버변수는 private / 생성자, 메소드는 public
 * 2. 메소드 재정의 : toString(), equals & hashCode() 재정의 ==> sequence 필드 기준 재정의
 * 3. 메소드 수정 : print() 메소드는 this 객체 출력 코드로 변경
 * =============================================================================================
 * 
 * @author Administrator
 *
 */

public class Book {
	 private int sequence;
	 private String isbn;
	 private String title;
	 private String author;
	 private String company;
	 private int totalPage;
	 private int price;
	 private int quantity;
	 
	 public Book() {
	 }
	 
	 public Book(int sequence) {
		 this();
		 setSequence(sequence);
	 }
	 
	 public Book(String isbn) {
		 this();
		 setIsbn(isbn);
	 }
	 
	 public Book(int sequence, String isbn) {
		 this(sequence);
		 setIsbn(isbn);
	 }
	 
	 public Book(int sequence, String isbn, String title) {
		 this(sequence, isbn);
		 setTitle(title);
	 }
	 
	 public Book(int sequence, String isbn, String title, String author) {
		 this(sequence, isbn, title);
		 setAuthor(author);
	 }
	 
	 public Book(int sequence, String isbn, String title, String author, String company) {
		 this(sequence, isbn, title, author);
		 setCompany(company);
	 }
	 
	 public Book(int sequence, String isbn, String title, String author, String company, int totalPage) {
		 this(sequence, isbn, title, author, company);
		 setTotalPage(totalPage);
	 }
	 
	 public Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price) {
		 this(sequence, isbn, title, author, company, totalPage);
		 setPrice(price);
	 }
	 
	 public Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price, int quantity) {
		 this(sequence, isbn, title, author, company, totalPage, price);
		 setQuantity(quantity);
	 }
	 
	 // 메소드 정의
	 public void print() {
		System.out.println(this);
	 }
	 
	 public String toString() {
		 return String.format("순번 : %d [isbn : %s] 제목 : %s, 저자 : %s, 출판사 : %s, 페이지 수 : %d, 가격 : %d, 재고수량 : %d | ", 
				 				sequence, isbn, title, author, company, totalPage, price, quantity);
	 }

		@Override
	 public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sequence;
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
		Book other = (Book) obj;
		if (sequence != other.sequence)
			return false;
		return true;
	}
	 
	 public void buy(int amount) {
		 
	 }
	 
	 public void sell(int amount) {
		 
	 }
	 
	 // sequence 멤버 변수의 getter
	 public int getSequence() {
		 return sequence;
	 }
	 
	 // sequence의 setter
	 public void setSequence(int sequence) {
		 this.sequence = sequence;
	 }
	 
	 // isbn멤버변수 필드에 대한 getter
	 public String getIsbn() {
		 return isbn;
	 }
	 
	 // isbn의 setter
	 public void setIsbn(String isbn) {
		 this.isbn = isbn;
	 }
	 
	 public String getTitle() {
		 return title;
	 }
	 
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 
	 public String getAuthor() {
		 return author;
	 }
	 
	 public void setAuthor(String author) {
		 this.author = author;
	 }
	 
	 public String getCompany() {
		 return company;
	 }
	 
	 public void setCompany(String company) {
		 this.company = company;
	 }
	 
	 public int getTotalPage() {
		 return totalPage;
	 }
	 
	 public void setTotalPage(int totalPage) {
		 this.totalPage = totalPage;
	 }
	 
	 public int getPrice() {
		 return price;
	 }
	 
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 
	 public int getQuantity() {
		 return quantity;
	 }
	 
	 public void setQuantity(int quantity) {
		 this.quantity = quantity;
	 }
}
