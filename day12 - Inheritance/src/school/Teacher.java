package school;

public class Teacher extends Person {
	// 변수 선언
	private String subject;
		
	// 생성자 선언
	Teacher() {
			
	}
		
	Teacher(String subject) {
		this();
		this.setSubject(subject);
	}
		
	public String getSubject() {
		return subject;
	}
		
	public void setSubject(String subject) {
		this.subject = subject;
	}
		
	// 메소드 선언
	public String toString() {
		return getId();
	}
}
