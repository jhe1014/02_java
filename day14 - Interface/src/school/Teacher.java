package school;

/**
 * 학교 시스템에서 과목을 가르치는 선생의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * 
 * @author Administrator
 *
 */

public class Teacher extends Person implements Attendance, Lesson{
	// 변수 선언
	private String subject;
		
	// 생성자 선언
	public Teacher() {
			
	}
		
	public Teacher(String subject) {
		this();
		this.setSubject(subject);
	}
	
	public Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.setSubject(subject);
	}
		
	public String getSubject() {
		return subject;
	}
		
	public void setSubject(String subject) {
		this.subject = subject;
	}
		
	// 메소드 선언
	@Override
	public String toString() {
		String tcStr = String.format("과목 : %s", subject);
		return String.format("교사정보[%s, %s]", super.toString(), tcStr);
	}

	@Override
	public String lesson() {
		// "교사[아이디]이(가) 과목[과목명] 수업을 하고 있습니다."
		// 라는 문자열을 리턴
		return String.format("교사[%s]이(가) 과목[%s] 수업을 하고 있습니다.", this.getId(), subject);
	}

	@Override
	public String attend() {
		
		// "교사[아이디]이(가) 출근하였습니다."
		// 라는 문자열을 리턴
		return String.format("교사[%s]이(가) 출석하였습니다.", this.getId());
	}
}
