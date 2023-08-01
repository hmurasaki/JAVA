package example07;

public class User1 extends Thread {

	//공유객체 선언
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-1");      //스레드 이름 지정
	}
	
	@Override
	public void run() {
		this.calculator.print();
		
		//공유객체의 필드인 memory값에 100을 변경시키고있다. (user1 Thread가)
		this.calculator.setMemory(100);
	}
	
	
}
