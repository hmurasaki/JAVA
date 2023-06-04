package example05;

//독립클래스
public class Driver {
	
	//new Taxi()이거나 new Bus()만 들어올수있음.
	//위 2개의 클래스가 Vehiclable인터페이스를 구현했기 때문에 들어올수가 있음.
	//인터페이스 매개변수의 다형성
	public void drive(Vehiclable vehiclable) {
		vehiclable.run();
		//System.out.println(vehiclable);      //주소 출력
	}
	
	public void stop(Vehiclable vehiclable) {
		vehiclable.stop();
	}
	
	//매개변수로 인터페이스를 구현함.
	//리턴타입,매개변수타입이 전부 Vehiclable인터페이스 타입이다.
	//리턴타입,매개변수타입 모두 구현클래스가 와야한다.
	public Vehiclable newCarmethod(Vehiclable vehiclable) {
		if(vehiclable instanceof Taxi) {
			System.out.println("새 Taxi");
			Taxi taxi = (Taxi)vehiclable;
			return taxi;
		}
		else if(vehiclable instanceof Bus) {
			System.out.println("새 Bus");
			Bus bus = (Bus)vehiclable;
			return bus;
		}
		return null;
		
	}
	
}
