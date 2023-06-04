package example04;

public class Time {

	//접근제어자(Access Modifier)의 종류
	//private : 같은 클래스내에서만 접근 가능함.
	//protected : 같은 패키지 내에서 접근이 가능하고, 같은 패키지내에서 자손클래스에서만 접근 가능함.
	//default : 같은 패키지 내에서만 접근할 수 있음. 적지않고 공란으로두면 자동적용됨.
	//public : 누구나 다 접근 가능함.
	
	//프로그래밍을 할 때, 멤버변수는 웬만하면 private 접근제어자로 감싸주고(캡슐화), 각 멤버변수에 해당하는
	//getter()를 제공해주는 방법으로 클래스를 작성하는 방법이 올바르다.
	private int hour;
	private int minute;
	private int second;
	
	//getter() : 멤버변수의 값을 읽어가는 메서드
	//setter() : 멤버변수의 값을 수정하는 메서드
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		//시에대한 예외처리 코드를 작성
		if(hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하였습니다.");
			return; //void이기떄문에 리턴에 아무값도 주지않는다.
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		//분에대한 예외처리 코드를 작성
		if(minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력하였습니다.");
			return; //void이기떄문에 리턴에 아무값도 주지않는다.	
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		//초에대한 예외처리 코드를 작성
		if(second < 0 || second > 59) {
			System.out.println("초를 잘못 입력하였습니다.");
			return; //void이기떄문에 리턴에 아무값도 주지않는다.	
		}		
		this.second = second;
	}
	
	
	@Override
	public String toString() {
		
		return this.getHour() + "시 " + this.getMinute() + "분 " + this.getSecond() + "초";
	}
	
	
	
}
