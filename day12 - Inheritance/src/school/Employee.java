package school;

public class Employee extends Person {
	// 변수 선언
	private String dept;
			
	// 생성자 선언
	Employee() {
				
	}
			
	Employee(String dept) {
		this();
		this.setDept(dept);
	}
			
	public String getDept() {
		return dept;
	}
			
	public void setDept(String dept) {
		this.dept = dept;
	}
			
	// 메소드 선언
	public String toString() {
		return getId();
	}
}
