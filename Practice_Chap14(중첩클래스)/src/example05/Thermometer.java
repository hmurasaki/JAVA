package example05;

public class Thermometer {

	//중첩인터페이스 선언
	interface TemperatureChangable {
		public void OnChange();
		
	}
	
	//중첩인터페이스 내부선언
	TemperatureChangable changable;

	
	
	//셋터 제공
	//매개변수 타입이 인터페이스 타입이 들어왔다 무엇을 의미?
	//즉 TemperatureChangabe인터페이스를 구현한클래스만 들어올수있다 인터페이스 매개변수의 다형성
	public void setChangabe(TemperatureChangable changable) {
		this.changable = changable;
	}
	
	public void viewTemperature() {
		this.changable.OnChange();
	}
}
