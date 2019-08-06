package shoes.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import shoe.Shoe;
import shoes.ShoeShowcase;

public class SetShoeShowcase implements ShoeShowcase{
	// 1. 멤버변수 선언
	Set<Shoe> shoes;
	
	// 2. 생성자 선언
	public SetShoeShowcase() {
		shoes = new HashSet<Shoe>();
	}
	
	public SetShoeShowcase(Set<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 3. 메소드 선언
	@Override
	public int add(Shoe shoe) {
		int addCnt = 0;
		
		if(shoes.add(shoe)) {
			addCnt++;
		}
		return addCnt;
	}

	@Override
	public int set(Shoe shoe) {
		/*
		 * Set 구조에서 set : 데이터 수정은 기존 값 제거 후 수정할 값 추가
		 */
		int setCnt = 0;
		
		if(shoes.remove(shoe)) {
			shoes.add(shoe);
			setCnt++;
		}
		return setCnt;
	}

	@Override
	public int remove(Shoe shoe) {
		int rmCnt = 0;
		
		if(shoes.remove(shoe)) {
			rmCnt++;
		}
		return rmCnt;
	}

	@Override
	public Shoe get(Shoe shoe) {
		Shoe findShoe = null;
		
		for(Shoe inShoe : shoes) {
			if(inShoe.equals(shoe)) {
				findShoe = inShoe;
			}
		}
		return findShoe;
	}

	@Override
	public List<Shoe> getAllShoes() {
		List<Shoe> shoeList = new ArrayList<Shoe>();
		shoeList.addAll(shoes);
		return shoeList;
	}

}
