package school;

public abstract class Person {
	// 변수 선언
	private String id;
	private String name;
	private int age;
	
	// 생성자 선언
	Person(){
		
	}
	
	Person(String id) {
		this();
		this.setId(id);
	}
	
	Person(String id, String name) {
		this(id);
		this.setName(name);
	}
	
	Person(String id, String name, int age) {
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
	
	public int setAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 메소드 생성
	public void print() {
		System.out.println("[" + id + "]" + name + " : " + age);
	}
	
	public String toString() {
		return getId();
	}
}
