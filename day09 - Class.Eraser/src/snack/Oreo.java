package snack;

/**
 * Oreo 쿠키를 정의하는 클래스
 * -------------------------------
 * 속성 : 
 * cream : String : 바닐라, 초코, 딸기, 말차
 * radius : double : 오레오 쿠키 1개의 반지름 길이
 * thickness : double : 오레오 쿠키 1개의 두께
 * -------------------------------
 * 생성자 : 기본생성자, 중복된 this, this()로 정의하는 생성자
 * 총 4개의 생성자 중복정의
 * -------------------------------
 * 메소드 : 
 * print() : void : 오레오 쿠키의 상태 출력
 * changeCream(String cream) : void : 매개변수로 입력된 cream 값으로 오레오 쿠키의 크림을 변경함
 * 
 * @author Administrator
 *
 */

public class Oreo {
	// 변수 선언
	String cream;
	double radius;
	double thickness;
	
	// 생성자 선언
	Oreo() {
		
	}
	
	Oreo(String cream) {
		this();
		this.cream = cream;
	}
	
	Oreo(String cream, double radius) {
		this(cream);
		this.radius = radius;
	}
	
	Oreo(String cream, double radius, double thickness) {
		this(cream, radius);
		this.thickness = thickness;
	}
	
	// 메소드 선언
	public void print() {
		System.out.println("오레오 쿠키 상태 [" + cream + "맛 크림, 반지름 길이 : " + radius + ", 두께 : " + thickness + "]");
	}
	
	public void changeCream(String cream) {
		this.cream = cream;
	}
}
