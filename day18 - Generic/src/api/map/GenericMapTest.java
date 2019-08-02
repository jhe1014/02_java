package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 데이터를 Key, Value 쌍으로 저장하는 구조인 Map 인터페이스에서
 * Key, Value 양쪽 모두 Generic을 적용하는 테스트
 * 
 * @author Administrator
 *
 */

public class GenericMapTest {

	public static void main(String[] args) {
		// 1. 선언 : Key : Integer, Value : String
		Map<Integer, String> map;
		
		// 2. 초기화 : HashMap 중 Key : Integer, Value : String
		map = new HashMap<>();
		
		// 3. 사용
		// (1) 데이터 추가
		map.put(1, "안녕하세요.");
		// key : Integer, value, String
		map.put(new Integer(2), "반가워요~");
		// key : Character, value : String
		map.put(3, "아... 오늘 날씨가...");
		// key : Double, value : String
		map.put(4, "너무나 더워요..!");
		// key : Boolean, value : Book
		map.put(5, new Book().getTitle());
		map.put(6, new Book(5).getAuthor());
		
		// (3) Map의 전체 데이터 추출
		// 	   foreach로 key꾸러미를 먼저 얻어내야함
		Set<Integer> keys = map.keySet();
		
		// 얻어진 key 꾸러미가 Set이기 때문에 이 key에 foreach를 적용
		// 이 때 얻어진 key로 get(key)를 반복적용
		for(int key : keys) {
			System.out.printf("key = %d : value = %s%n", key, map.get(key));
		}
	}

}
