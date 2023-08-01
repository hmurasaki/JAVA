package example07;

public class User2 extends Thread {

	//공유객체 선언
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-2");      //스레드 이름 지정
	}
	
	@Override
	public void run() {
		
		this.calculator.print();
		
		//공유객체의 필드인 memory값에 50을 변경시키고있다. (user2 Thread가)
		this.calculator.setMemory(50);
	}
	
	
}
