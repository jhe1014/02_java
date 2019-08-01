package api.math;

import static java.lang.Math.*;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(ceil(3.2)); // 올림
		System.out.println(floor(3.2)); // 내림
		System.out.println(round(3.2)); // 반올림
		System.out.println(max(2.3, 100.8)); // 둘 중 큰 값
		System.out.println(min(1, 20)); // 둘 중 작은 값
		System.out.println(sin(Math.PI / 2)); // 삼각함수 sin 값
		System.out.println(cos(Math.PI)); // 삼각함수 cos 값
		System.out.println(tan(0)); // 삼각함수 tan 값
		System.out.println(abs(-20)); // 절댓값
		System.out.println(sqrt(4)); // 제곱근
		System.out.println(random()); // 난수 발생
		System.out.println(random()); // 난수 발생
	}

}
