package school;

/**
 * 학교 시스템에서 학생의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * 
 * @author Administrator
 *
 */

public class Student extends Person {
	// 변수 선언
	private String major;
	
	// 생성자 선언
	public Student() {
		
	}
	
	public Student(String major) {
		this();
		this.setMajor(major);
	}
	
	/**
	 * Person 클래스에서 물려받은 필드(id, name, age)와 Student만의 필드인 major를 모두 초기화하는 생성자
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param major
	 */
	public Student(String id, String name, int age, String major) {
		super(id, name, age);
		// this(major);
		// super(), this()는 생성자 선언 첫줄에 한 번만 등장 가능
		// super()와 this()는 함께 사용할 수 없음
		this.setMajor(major);
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 메소드 선언
	@Override
	public String toString() {
		String stdStr = String.format("전공 : %s", major);
		return String.format("학생정보[%s, %s]", super.toString(), stdStr);
	}
}
