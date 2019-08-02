package api.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 객체를 요소(Element)로 저장하는 컬렉션(Collection) 중에서
 * 1. 중복 저장 허용
 * 2. 순서 상관 있음
 * 으로 데이터를 저장하는 List 타입을 테스트
 *  
 * @author Administrator
 *
 */
public class ListTest {

	public static void main(String[] args) {
	/* -------------------------------------
	 * ArrayList : List 인터페이스 구현 클래스
	 * -------------------------------------
	 * 1. 배열로 List 인터페이스 구현
	 * 
	 * 2. 배열의 단점을 개선한 구현 클래스
	 * (1) 처음 생성할 때 크기가 고정되는 것
	 * (2) 데이터 추가시 동적으로 크기 변경 불가능 한 것
	 * (3) 데이터 삭제 시 빈 인덱스 처리가 안되는 것
	 * 
	 * 3. 데이터 추가시 크기가 자동으로 증가
	 *   => 인데그삭 추가되는 엘리먼트 개수만큼 자동 증가
	 *   
	 * 4. 데이터 삭제 시 빈 인덱스 자동처리
	 *   => 삭제된 인덱스 뒷쪽의 엘리먼트의 인덱스가 자동으로 삭제된만큼 당겨서 처리 	
	 */

	 // 1. List 인터페이스 변수 선언
		List list;
		
 	 // 2. 초기화
	 // List는 인터페이스 타입의 변수이므로 new List()는 불가능
	 // 따라서 List 인터페이스 구현 클래스 중 하나의 인스턴스를 생성하여 연결
		list = new ArrayList();
	 
	 // 3. 사용
	 // (1) 리스트에 아이템 추가 : Collection의 add(Object) 메소드 사용
		System.out.println(list.add("첫번째 엘리먼트"));
	 // auto-boxing
		System.out.println(list.add(2));
	 // Double 타입의 데이터
		System.out.println(list.add(new Double(3.00)));
	 // Boolean 타입의 데이터
		System.out.println(list.add(new Boolean(true)));
	 // auto-boxing
		System.out.println(true);
	 // 사용자 정의 객체 타입
		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10);
		Book book = new Book(1);
		System.out.println(list.add(vegetarian));
		System.out.println("===== 중복 데이터 추가 시도 ======");
		System.out.println(list.add(book));
		// Set에는 들어가지 않던 동일 데이터 추가
		System.out.println(list.add("첫번째 엘리먼트"));
	
		// List 출력 : toString() ArrayList 클래스에서 재정의 된 것이 적용
		System.out.println("===== list 직접 출력 =====");
		System.out.println(list);
		
		System.out.println("===== foreach 출력 =====");
		for(Object object : list) {
			if (object instanceof Book) {
				((Book) object).setTitle("채식주의자");
			}
			System.out.println(object);
		}
		System.out.println("===== for 출력 =====");
		for(int idx = 0; idx < list.size(); idx++) {
			// list에서 idx번째 엘리먼트를 가져와서 출력
			list.get(idx);
		}
		
		/*Object[] objects = new Object[4];
		for(int idx = 0; idx < objects.length; idx++) {
			System.out.println(objects[idx]);
			
		}*/
		
		// 인덱스를 직접 지정해서 추출 가능
		// auto-unboxing
		int two = (Integer) list.get(1);
	
		System.out.println("list의 크기 : " + list.size());
		
		// 1번째 인덱스 엘리먼트를 삭제
		System.out.println(list.remove(1));
		System.out.println("삭제 후 list의 크기 : " + list.size());
		System.out.println("== 삭제 후 for 출력 ==");
		for (int idx = 0; idx < list.size(); idx++) {
			// list 에서 idx 번째 엘리먼트를 가져와서 출력
			System.out.println(idx + ":" + list.get(idx));
		}
	}
	

}
