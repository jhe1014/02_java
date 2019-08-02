package api.collection.generic;

import java.util.ArrayList;
import java.util.List;


/**
 * 컬렉션에 저장할 타입에 제한을 주는 Generic이 적용된 List를 테스트
 * 
 * @author Administrator
 *
 */

public class GenericListTest {

	public static void main(String[] args) {
		// 1. 선언 : Integer만 저장할 수 있는 List 선언
		List<Integer> numbers;
		// 			 Book만 저장할 수 있는 List 선언
		List<Book> books;
		
		// 2. 초기화 : Integer만 저장할 수 있는 ArrayList로 생성
		numbers = new ArrayList<>();
		books = new ArrayList<>();
		
		// 3. 사용
		// (1) Integer만 저장하는 리스트에 add(E)
		numbers.add(1); // index : 0, value : 1
		numbers.add(3); // index : 1, value : 3
		//numbers 리스트의 1번 인덱스에 2라는 값을 끼워넣는 add()
		numbers.add(1, 2); // index : 1, value : 2 / index : 2, value : 3
		
		// (2) Book만 저장하는 리스트에 add(E)
		books.add(new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10));
		books.add(new Book(2, "9791159039690", "어린왕자(초판본)", "생텍쥐페리", "더스토리", 150, 8820, 5));
		books.add(new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3));
		books.add(new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "흔", 208, 12420, 2));
		books.add(new Book(5, "9788956055466",  "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2));
		books.add(new Book());
		// 중복데이터 추가 시도 (Set과 다르게 중복 검사를 하지 않기 때문에 추가됨)
		books.add(new Book()); 
		// books 리스트는 Book 타입의 인스턴스만 저장 가능
		// books.add("Book");
		
		// 3. 사용
		// Integer Set에서 데이터 추출 : foreach
		for(Integer num : numbers) {
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
