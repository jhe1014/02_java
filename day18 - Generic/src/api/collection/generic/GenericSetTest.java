package api.collection.generic;

import java.util.HashSet;
import java.util.Set;


/**
 * 컬렉션에 저장할 타입에 제한을 주는 Generic이 적용된 Set을 테스트
 * 
 * @author Administrator
 *
 */

public class GenericSetTest {

	public static void main(String[] args) {
		// 1. Integer만 저장하는 Set을 선언
		Set<Integer> set;
		// Book만 저장하는 set
		Set<Book> books;
		
		// 2. 초기화 : HashSet으로 초기화 : Integer만 저장하는 HashSet으로 초기화
		set = new HashSet<>();
		books = new HashSet<Book>();
		
		// 3. 엘리먼트 추가
		// auto-boxing
		set.add(1);
		set.add(20);
		set.add(new Integer(300));
		// set.add("사백"); // String을 추가시도 시, 오류 발생
		
		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10);
		Book littlePrince = new Book(2, "9791159039690", "어린왕자(초판본)", "생텍쥐페리", "더스토리", 150, 8820, 5);
		Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3);
		Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "흔", 208, 12420, 2);
		Book ax = new Book(5, "9788956055466",  "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		books.add(vegetarian);
		books.add(littlePrince);
		books.add(noDaap);
		books.add(dduk);
		books.add(ax);
		// books.add("책입니다.");
		
		// 3. 사용
		// Integer Set에서 데이터 추출 : foreach
		for(Integer num : set) {
			// 추출된 값에 100을 곱하여 출력
			System.out.println(num * 100); // 원래 Integer 타입은 연산자 사용 불가능 (auto-unboxing 해줘서 가능)
		}
		
		// Book Set에서 데이터 추출
		for (Book book : books) {
			// book의 가격을 10% 할인
			int price = book.getPrice();
			book.setPrice((int) (price * 0.9));
			System.out.println(book);
		}
		

	}

}
