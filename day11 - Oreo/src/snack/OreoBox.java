package snack;

/**
 * 오레오(Oreo) 쿠키가 여러 개 들어가있는 박스
 * 
 * @author Administrator
 *
 */

public class OreoBox {
	// Oreo를 여러개 저장할 수 있는 Oreo[] oreos를 멤버 변수로 갖도록 선언
	Oreo[] oreos;
	
	// 생성자 기본, 매개변수 중복 정의
	OreoBox() {
		oreos = new Oreo[0];
	}
	
	OreoBox(Oreo[] oreos) {
		setOreos(oreos);
	}
	
	// 접근자
	public Oreo[] getOreos() {
		return oreos;
	}
	
	// 수정자
	public void setOreos(Oreo[] oreos) {
		this.oreos = oreos;
	}
	
	//  오레오 박스에 오레오 쿠키를 1개씩 추가, 삭제, 수정, 꺼냄(get)
	public void add(Oreo oreo) {
		// 현재 oreoBox보다 1 더 큰 배열을 만든다.
		Oreo[] newOreos = new Oreo[oreos.length + 1];
		
		for(int idx = 0; idx < oreos.length; idx++) {
			newOreos[idx] = oreos[idx];
		}
		
		// 맨 뒤에 새로운 oreo 추가
		newOreos[newOreos.length - 1] = oreo;
		
		this.oreos = newOreos;
	}
	
	public void remove(Oreo oreo) {
		// 현재 oreoBox보다 1 더 작은 배열을 만든다.
		Oreo[] newOreos = new Oreo[oreos.length - 1];
		
		// 인덱스 값 받아오기
		int index = -1;
		for(int idx = 0; idx < oreos.length; idx++) {
			if(oreos[idx].getSeq() == oreo.getSeq()) {
				// 오레오 찾았다.
				index = idx;
				break;
			}
		}
		
		if(index > -1) {
			// 중간 oreo가 빠진 경우
			if(index < oreos.length - 1) {
				for(int idx = 0; idx < index; idx++) {
					newOreos[idx] = newOreos[idx];
				}
				
				for(int ind = index; ind < newOreos.length; ind++) {
					newOreos[ind] = oreos[ind + 1];
				}
			} else { // 맨끝 oreo가 빠진 경우
				for(int idx = 0; idx < index; idx++) {
					newOreos[idx] = oreos[idx];
				}
			}
			// 복사된 새 배열을 this oreos에 새로 저장
			this.oreos = newOreos;
		}
	}
	
	public void set(Oreo oreo) {
		int index = -1;
		for(int idx = 0; idx < oreos.length; idx++) {
			if(oreos[idx].getSeq() == oreo.getSeq()) {
				// 같은 오레오 찾았다.
				index = idx;
				break;
			}
		}
		
		if(index > -1) {
			oreos[index] = oreo;
		}
	}
	
	public Oreo get(Oreo oreo) {
		Oreo findOreo = null;
		for(int idx = 0; idx < oreos.length; idx++) {
			if(oreos[idx].getSeq() == oreo.getSeq()) {
				// 같은 오레오 찾았다.
				findOreo = oreos[idx];
				break;
			}
		}
		
		return findOreo;
	}
	
	public Oreo[] getAllOreos() {
		return this.oreos;
	}
}
