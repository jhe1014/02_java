package generic.definition;

/**
 * Generic 사용시점 : <> 안에 모든 참조형 타입명
 * Generic 정의시점 : 
 * <E> : Element : 컬렉션에 저장된 엘리먼트의 타입
 * <K> : Key : K로 지정된 것이 Key의 역할을 할 때 지정하는 타입
 * <V> : Value : V로 지정된 것이 value의 역할을 할 때
 * <S> : 
 * <T> : Type : 전체적으로 리턴될 타입을 지정할 때 사용
 * <N> : Number : 저장될 타입이 숫자형일 때 자세한 지정을 위해 사용
 * 
 * --------------------------------------------------------------------
 * 데이터를 저장할 때, key, value를 쌍으로 저장하는 클래스
 * 
 * @author Administrator
 *
 */

public class DataPair<K, V> {
	
	// 1. 변수 선언부
	/** 데이터 저장시 키의 역할 을 하는 멤버변수 선언
	 *  이 때, 변수의 타입이 무엇이든지 될 수 있도록 하려면 Generic을 주어야한다. **/
	private K key;
	
	/** 데이터 저장 시 값의 역할을 하는 멤버변수 선언
	 *  값으로 사용한다는 의미로 타입을 V로 지정 */
	private V value;
	
	// 2. 생성자 선언부
	// (1) 기본생성자
	public DataPair() {
		
	}
	
	// (2) K, V를 쌍으로 받는 생성자
	public DataPair(K key, V value) {
		this();
		this.key = key;
		this.value = value;
	}
	
	// 3. 메소드 선언부
	// (1) 접근자, 수정자
	public K getKey() {
		return this.key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	// (2) 이 클래스 타입의 인스턴스를 리턴하는 static 메소드를 작성
	
	
}
