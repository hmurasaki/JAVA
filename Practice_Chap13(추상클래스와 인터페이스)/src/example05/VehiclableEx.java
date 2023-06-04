package example05;

public class VehiclableEx {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.setSpeed(-50);
		bus.setSpeed(80);
		//직접 만들어서 참조변수(주소)를 넘기는 방법
		driver.drive(bus);
		driver.stop(bus);
		
		System.out.println();
		
		taxi.setSpeed(-70);
		taxi.setSpeed(120);
		//직접 만들어서 참조변수(주소)를 넘기는 방법
		driver.drive(taxi);
		driver.stop(taxi);
		
		System.out.println();
		
		//아래처럼 직접 매개변수를 생성하여 넘기는 방법도 있다.
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		//아래 컴파일 예외가 발생하는 이유는 무엇인가?
		//driver.drive(new AICar());
		System.out.println();
		
		Vehiclable vehiclable = driver.newCarmethod(new Taxi());
		vehiclable.run();
		vehiclable.stop();
		
		System.out.println();
		
		vehiclable = driver.newCarmethod(new Bus());
		vehiclable.run();
		vehiclable.stop();
	}

}
