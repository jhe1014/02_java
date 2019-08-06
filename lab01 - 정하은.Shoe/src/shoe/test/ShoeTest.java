package shoe.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import shoe.Shoe;

public class ShoeTest {

	public static void main(String[] args) {
		// 1. 객체 생성
		System.out.println("====== 1. 신발 정보 입력 ======");
		Shoe shine = new Shoe(1, "샤인", 225, 19000, "운동화", 5);
		Shoe annabelle = new Shoe(2, "애나벨 3.5", 240, 29000, "구두", 8);
		Shoe adilette = new Shoe(3, "아딜렛 샌들", 245, 15000, "샌들", 2);
		Shoe rainy = new Shoe(4, "레이니", 200, 19000, "부츠", 5);
		
		// 2. 신발 저장할 Collection
		System.out.println("====== 2. 신상 입고 ======");
		// (1) List에 추가
		List<Shoe> shoesList = new ArrayList<>();
		shoesList.add(shine);
		shoesList.add(annabelle);
		shoesList.add(adilette);
		shoesList.add(rainy);
		
	    // (2) Set에 추가
		Set<Shoe> shoesSet = new HashSet<>();
		shoesSet.add(shine);
		shoesSet.add(annabelle);
		shoesSet.add(adilette);
		shoesSet.add(rainy);
		
		// (3) Map에 추가
		Map<Integer, Shoe> shoesMap = new HashMap<>();
		shoesMap.put(shine.getCode(), shine);
		shoesMap.put(annabelle.getCode(), annabelle);
		shoesMap.put(adilette.getCode(), adilette);
		shoesMap.put(rainy.getCode(), rainy);
		
		// 3. 신발 정보 출력
		System.out.println("====== 3. 신상 정보 확인 ======");
		System.out.println("====== (1) shoesList ======");
		for(Shoe shoe : shoesList) {
			System.out.println(shoe);
		}
		
		System.out.println("====== (2) shoesSet ======");
		for(Shoe shoe : shoesSet) {
			System.out.println(shoe);
		}
		
		System.out.println("====== (3) shoesMap ======");
		Set<Integer> allShoes = shoesMap.keySet();
		for(int key : allShoes) {
			System.out.println(shoesMap.get(key));
		}
		
		// 4. 세 번째 신발 정보 출력
		System.out.println("====== 4. 3번 신발 정보 확인 ======");
		System.out.println("====== (1) shoesList ======");
		System.out.println(shoesList.get(2));
		
		System.out.println("====== (2) shoesSet ======");
		Object[] shoeSetlist = shoesSet.toArray();
		System.out.println(shoeSetlist[2]);
		
		System.out.println("====== (3) shoesMap ======");
		System.out.println(shoesMap.get(3));
		
		// 5. 세 번째 신발 재고 0으로 수정
		System.out.println("====== 5. 3번 신발 재고 수정 ======");
		Shoe third = new Shoe(3, "아딜렛 샌들", 245, 15000, "샌들", 0);
		// List 재고 수정
		shoesList.set(2, third);
		
		// Set 재고 수정
		shoesSet.remove(adilette);
		shoesSet.add(third);
		
		// Map 재고 수정
		shoesMap.put(3, third);
		
		// 6. 수정된 내용 출력
		System.out.println("====== 6. 수정된 내용 출력 ======");
		System.out.println("====== (1) shoesList ======");
		// 배열값 기준으로 판단...
		System.out.println(shoesList.get(2));
		
		System.out.println("====== (2) shoesSet ======");
		Object[] shoeSetlist2 = shoesSet.toArray();
		System.out.println(shoeSetlist2[2]);
		
		System.out.println("====== (3) shoesMap ======");
		// code 값으로 판단..
		System.out.println(shoesMap.get(3));
		
		// 7. 세번째 신발 정보 삭제
		System.out.println("====== 7. 3번 신발 정보 삭제 ======");
		// List내 삭제
		shoesList.remove(2);
		
		// Set내 삭제
		shoesSet.remove(adilette);
		
		// Map내 삭제
		shoesMap.remove(3);
		
		// 8. 삭제 후 전체 신발 정보 출력
		System.out.println("====== 8. 삭제 후 신발 정보 ======");
		System.out.println("====== (1) shoesList ======");
		for(Shoe shoe : shoesList) {
			System.out.println(shoe);
		}
		
		System.out.println("====== (2) shoesSet ======");
		for(Shoe shoe : shoesSet) {
			System.out.println(shoe);
		}
		
		System.out.println("====== (3) shoesMap ======");
		Set<Integer> allShoes2 = shoesMap.keySet();
		for(int key : allShoes2) {
			System.out.println(shoesMap.get(key));
		}
	}

}
