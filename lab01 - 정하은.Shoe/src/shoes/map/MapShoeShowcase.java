package shoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import shoe.Shoe;
import shoes.ShoeShowcase;

public class MapShoeShowcase implements ShoeShowcase{
	// 1. 멤버변수 선언
	Map<Integer, Shoe> shoes;
	
	// 2. 생성자 선언
	public MapShoeShowcase() {
		shoes = new HashMap<>();
	}
	
	public MapShoeShowcase(Map<Integer, Shoe> shoes) {
		this.shoes = shoes;
	}
		
	// 3. 메소드 선언
	// 신발 정보 추가
	@Override
	public int add(Shoe shoe) {
		int addCnt = 0;
		
		// 같은 seq 값일 때, put 메소드로 book 추가
		if(!isExists(shoe)) {
			shoes.put(shoe.getCode(), shoe);
			addCnt++;
		}	
		return addCnt;
	}

	// 신발 정보 수정
	@Override
	public int set(Shoe shoe) {
		int setCnt = 0;
		
		// 기존 값 제거 후 수정할 값 추가
		if(shoes.remove(shoe.getCode(), shoe)) {
			shoes.put(shoe.getCode(), shoe);
			setCnt++;
		}
		return setCnt;
	}

	// 신발 정보 삭제
	@Override
	public int remove(Shoe shoe) {
		int rmCnt = 0;
		
		// seq값 찾은 후 삭제
		if(shoes.remove(shoe.getCode(), shoe)) {
			rmCnt++;
		}
		return rmCnt;
	}

	// 신발 정보 조회
	@Override
	public Shoe get(Shoe shoe) {
		Shoe findShoe = null;
		
		if(isExists(shoe)) {
			findShoe = shoes.get(shoe.getCode());
		}
		return findShoe;
	}

	// 모든 신발 정보 조회
	@Override
	public List<Shoe> getAllShoes() {
		List<Shoe> shoeList = new ArrayList<>(shoes.values());
		return shoeList;
	}
	
	// 신발 존재 유무 검사
	private boolean isExists(Shoe shoe) {
		boolean exists = false;
		return shoes.containsKey(shoe.getCode());
	}

}
