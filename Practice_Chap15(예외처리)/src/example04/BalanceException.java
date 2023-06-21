package example04;

//사용자 정의 예외 클래스
public class BalanceException extends Exception {  //익셉션 상속받기.
	
	public BalanceException() {  //기본생성자 하나 생성
	}
	
	public BalanceException(String message) {
		super(message);         //조상클래스의 생성자 호출
	}
	
}
