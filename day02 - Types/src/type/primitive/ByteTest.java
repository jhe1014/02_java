package type.primitive;

/**
 * 
 * byte : 1byte(8bit에 해당하는 범위만큼 정수를 저장하는 타입
 * -------------------------------------------------------------
 * 8bit = 2의 8제곱
 *      = 256
 *      => 256개의 숫자 표현 가능
 *         -128 ~ 127까지 표현가능 
 *  
 * @author Administrator
 *
 */

public class ByteTest {

	public static void main(String[] args) {
		// 1. 선언
		byte buffer;
		
		// 2. 초기화
		buffer = 0;
		
		// 3. 사용
		System.out.println("buffer = " + buffer);
		
		// 4. 값을 변경
		buffer = 127;
		System.out.println("buffer = " + buffer);
		
		buffer = -128;
		System.out.println("buffer = " + buffer);
		
		// 5. 값의 범위를 벗어나는 값을 저장하려는 시도
		//buffer = 128; // Err : Type mismatch
		
	}

}
