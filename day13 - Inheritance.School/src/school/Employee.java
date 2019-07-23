package school;

/**
 * 학교 시스템에서 교직원의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * 
 * @author Administrator
 *
 */

public class Employee extends Person {
	// 변수 선언
	private String dept;
			
	// 생성자 선언
	public Employee() {
				
	}
			
	public Employee(String dept) {
		this();
		this.setDept(dept);
	}
	
	public Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.setDept(dept);
	}
			
	public String getDept() {
		return dept;
	}
			
	public void setDept(String dept) {
		this.dept = dept;
	}
			
	// 메소드 선언
	@Override
	public String toString() {
		String empStr = String.format("부서 : %s", dept);
		return String.format("교직원정보[%s, %s]", super.toString(), empStr);
	}
}
