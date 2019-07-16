package account.one;

/**
 * 은행 계좌를 정의하는 클래스
 * -------------------------------
 * 계좌의 속성을 나타내기 위하여 두 개의 멤버변수 선언
 * 계좌번호 : accNumber;
 * 계좌잔액 : balance;
 * -------------------------------
 * 계좌의 잔액을 증가시키는 입금 메소드 : deposit(int amount)
 * 계좌의 현재 상태 출력하는 메소드 : print()
 * 
 * @author Administrator
 *
 */

public class Account {
	// 1. 멤버변수(실체변수) 선언부
	/** 계좌번호 */
	int accNumber;
	
	/** 계좌 잔액 */
	int balance;
	
	// 2. 생성자 선언부(생략)
	

	// 3. 메소드 선언부
	/**
	 * 입력된 amount만큼 이 계좌의 잔액을 증가시킨다.
	 * 
	 * @param amount : int 입금할 금액
	 */
	public void deposit(int amount) {
		int value = 0;
		value += amount;
		balance += amount;
	}
	
	public void print() {
		System.out.printf("계좌번호 : %d | \t계좌잔액 : %d%n", accNumber, balance);
	}
}
