package shoe.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import shoe.Shoe;
import shoes.ShoeShowcase;
import shoes.list.ListShoeShowcase;
import shoes.map.MapShoeShowcase;
import shoes.set.SetShoeShowcase;

public class ShoeTest2 {

	public static void main(String[] args) {
		// 1. 객체 생성
		System.out.println("====== 1. 신발 정보 입력 ======");
		Shoe shine = new Shoe(1, "샤인", 225, 19000, "운동화", 5);
		Shoe annabelle = new Shoe(2, "애나벨 3.5", 240, 29000, "구두", 8);
		Shoe adilette = new Shoe(3, "아딜렛 샌들", 245, 15000, "샌들", 2);
		Shoe rainy = new Shoe(4, "레이니", 200, 19000, "부츠", 5);
		
		// 2. ShoeShowcase 인스턴스 생성
		System.out.println("====== 2. 쇼케이스 생성 ======");
		// (1) List로 생성
		List<Shoe> listShoes = new ArrayList<Shoe>();
		ShoeShowcase showcase = new ListShoeShowcase(listShoes);	
		
		// (2) Set으로 생성
		Set<Shoe> SetShoes = new HashSet<>();
//		ShoeShowcase showcase = new SetShoeShowcase(SetShoes);

		// (3) Map으로 생성
		Map<Integer, Shoe> MapShoes = new HashMap<>();
//		ShoeShowcase showcase = new MapShoeShowcase(MapShoes);
		
		// 3. getAllShoes() 호출
		System.out.println("====== 3. 전체 신발 출력 ======");
		showcase.add(shine);
		showcase.add(annabelle);
     	showcase.add(adilette);
		showcase.add(rainy);
		System.out.println(showcase.getAllShoes());
		
		// 4. 세 번째 신발 정보 조회
		System.out.println("====== 4. 세번째 신발 정보 조회 ======");
		System.out.println(showcase.get(new Shoe(3)));
		
		// 5. 세 번째 신발 재고 개수 수정
		System.out.println("====== 5. 세번째 신발 재고 개수 수정 ======");
		Shoe third = new Shoe(3, "아딜렛 샌들", 245, 15000, "샌들", 0);
		showcase.set(third);
		
		// 6. 수정 사항 확인
		System.out.println("====== 6. 세번째 신발 정보 수정 확인 ======");
		System.out.println(showcase.get(new Shoe(3)));
		
		// 7. 세 번째 신발 정보 삭제
		System.out.println("====== 7. 세번째 신발 정보 삭제 ======");
		showcase.remove(new Shoe(3));
		
		// 8. 전체 신발 정보 출력
		System.out.println("====== 8. 전체 신발 정보 출력 ======");
		System.out.println(showcase.getAllShoes());
	}

}
