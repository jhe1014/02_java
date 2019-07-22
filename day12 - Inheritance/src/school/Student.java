package school;

public class Student extends Person {
	// 변수 선언
	private String major;
	
	// 생성자 선언
	Student() {
		
	}
	
	Student(String major) {
		this();
		this.setMajor(major);
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 메소드 선언
	public String toString() {
		return getId();
	}
}
