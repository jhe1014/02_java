package statical.method;

/**
 * 산술 연산인 덧셈, 뺄셈, 곱셈, 나눗셈을 처리하는 각각의 메소드
 * add, subtract, multiply, divide를 정의한다.
 * 
 * 각 메소드마다 매개변수를 정수 2개, 실수 2개를 받도록 메소드 중복정의 기법을 사용하여 
 * 총 8개의 메소드를 정의하고 연산 결과를 리턴하도록 작성한다.
 * 
 * 이 때 각 메소드는 모두 static으로 작성
 * 
 * @author Administrator
 *
 */

public class Calculator {
	public static int add(int x, int y) {
		int plus = 0;
		plus = x + y;
		return plus;
	}
	
	public static double add(double x, double y) {
		double plus = 0;
		plus = x + y;
		return plus;
	}
	
	public static int subtract(int x, int y) {
		int minus = 0;
		minus = x - y;
		return minus;
	}
	
	public static double subtract(double x, double y) {
		double minus = 0;
		minus = x - y;
		return minus;
	}
	
	public static int multiply(int x, int y) {
		int dub = 0;
		dub = x * y;
		return dub;
	}
	
	public static double multiply(double x, double y) {
		double dub = 0;
		dub = x * y;
		return dub;
	}
	
	public static int divide(int x, int y) {
		int div = 0;
		div = x / y;
		return div;
	}
	
	public static double divide(double x, double y) {
		double div = 0;
		div = x / y;
		return div; 
	}
}
