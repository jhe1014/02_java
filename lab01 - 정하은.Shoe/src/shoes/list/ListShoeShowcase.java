package shoes.list;

import java.util.ArrayList;
import java.util.List;

import shoe.Shoe;
import shoes.ShoeShowcase;

public class ListShoeShowcase implements ShoeShowcase{
	// 1. 멤버변수 선언
	private List<Shoe> shoes;
	
	// 2. 생성자 선언
	public ListShoeShowcase() {
		shoes = new ArrayList<Shoe>();
	}
	
	public ListShoeShowcase(List<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 3. 메소드 선언
	// 신발 정보 추가
	@Override
	public int add(Shoe shoe) {
		int addCnt = 0;
		
		if(!isExists(shoe)) {
			shoes.add(shoe);
			addCnt++;
		}
		return addCnt;
	}

	// 신발 정보 수정
	@Override
	public int set(Shoe shoe) {
		int setCnt = 0;
		
		if(isExists(shoe)) {
			int index = -1;
			
			for (int idx = 0; idx < shoes.size(); idx++) {
				if(shoes.get(idx).equals(shoe)) {
					index = idx;
					break;
				}
			}
			
			if(index > -1) {
				shoes.set(index, shoe);
				setCnt++;
			}
		}
		return setCnt;
	}

	// 신발 정보 삭제
	@Override
	public int remove(Shoe shoe) {
		int rmCnt = 0;
		
		if(isExists(shoe)) {
			if (shoes.remove(shoe)) {
				rmCnt++;
			}
		}
		return rmCnt;
	}

	// 신발 정보 조회
	@Override
	public Shoe get(Shoe shoe) {
		Shoe findShoe = null;
		int index = -1;
		
		for (int idx = 0; idx < shoes.size(); idx++) {
			if(shoes.get(idx).equals(shoe)) {
				index = idx;
				break;
			}
		}
		
		if(index > -1) {
			findShoe = shoes.get(index);
		}
		return findShoe;
	}

	// 신발 정보 전체 조회
	@Override
	public List<Shoe> getAllShoes() {
		return shoes;
	}
	
	// 리스트에 존재하는지 검사
	private boolean isExists(Shoe shoe) {
		boolean exists = false;
		
		for (Shoe findShoe : shoes) {
			if(findShoe.equals(shoe)) {
				exists = true;
				break;
			}
		}
		return exists;
	}
	
}
