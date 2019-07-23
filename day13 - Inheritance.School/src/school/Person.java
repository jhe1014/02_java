package school;

/**
 * 시스템에 저장될 학생, 선생, 직원의 정보 중 공통적인 내용을 추출한 상위클래스
 * 일반적인 사람의 정보를 저장한다.
 * 
 * @author Administrator
 *
 */

public abstract class Person {
	// 변수 선언
	private String id;
	private String name;
	private int age;

	
	// 생성자 선언
	public Person(){
		
	}
	
	public Person(String id) {
		this();
		this.setId(id);
	}
	
	public Person(String id, String name) {
		this(id);
		this.setName(name);
	}
	
	public Person(String id, String name, int age) {
		this(id, name);
		this.setAge(age);
	}
	
	// 접근자, 수정자 생성
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 메소드 생성
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * toString() 메소드의 특별함
	 * -----------------------------------------------------------------------------
	 * 1. print 계열의 메소드에서 객체참조변수를 출력할 때 자동으로 작동하는 메소드
	 * 2. Object 클래스에서 상속받은 메소드
	 * 3. 객체를 대표하는 문자열을 만들어서 리턴 => 각 필드를 모두 출력하는 문자열
	 * 
	 */
	
	public String toString() {
		return String.format("아이디 : %s, 이름 : %s, 나이 : %d", id, name, age);
	}
}
