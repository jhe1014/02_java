package api.map;

import static java.lang.Integer.valueOf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * key : Integer
 * value : Book
 * ---------------------------------
 * 데이터 입력
 * key : Book 객체의 seq를 입력
 * value : Book 객체 자체
 * ---------------------------------
 * 데이터 출력
 * foreach
 *  (1) key set 얻기
 *  (2) get(key)로 추출 => 출력
 *  
 * foreach
 *  (1) key set 얻기
 *  (2) 각 Book 객체의 가격 10% 할인가로 출력
 * 
 * @author Administrator
 *
 */

public class BookMapTest {

	public static void main(String[] args) {
		// 1. 선언 : Key : Integer, Value : Book
		Map<Integer, Book> books;
		
		// 2. 초기화 
		books = new HashMap<>();
		
		// 3. 데이터 입력
		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10);
		Book littlePrince = new Book(2, "9791159039690", "어린왕자(초판본)", "생텍쥐페리", "더스토리", 150, 8820, 5);
		Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3);
		Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "흔", 208, 12420, 2);
		Book ax = new Book(5, "9788956055466",  "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		books.put(vegetarian.getSequence(), vegetarian);
		books.put(littlePrince.getSequence(), littlePrince);
		books.put(noDaap.getSequence(), noDaap);
		books.put(dduk.getSequence(), dduk);
		books.put(ax.getSequence(), ax);
		
		// 직접 포장하는 방식도 가능
		// books.put(new Integer(noDaap.getSequence()), noDaap);
		
		// Integer 객체로 포장하는 또 다른 방법
		// static 메소드인 valueOf(int) 를 사용함, import static 사용
		// books.put(valueOf(dduk.getSequence()), dduk);
	
		// 4. 데이터 출력
		// (1) foreach 전체 데이터 출력
		System.out.println("===== 전체 책 목록 출력 =====");
		Set<Integer> keys = books.keySet();
		
		for(int key : keys) {
			System.out.printf("%s%n", books.get(key));
		}
		
		// (2) foreach로 가격 10% 다운시켜서 출력
		System.out.println("===== 10% 가격 할인 된 전체 책 목록 출력 =====");
		Set<Integer> discountbooks = books.keySet();
		
		for(int key : discountbooks) {
			int price = books.get(key).getPrice();
			books.get(key).setPrice((int) (price * 0.9));
			System.out.printf("%s%n", books.get(key));
		}
	}

}
