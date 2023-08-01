package example07;

//공유객체
public class Calculator {

	private int memory;	
	int value = 100;
	
	
	public int getMemory() {
		return this.memory;
	}
	
	//비동기화 메서드     > 데이터 신뢰성을 봅장하기 위해서는 반드시 동기화처리가 필수다.	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		//2초간 일시정지
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.getMemory());
		
	}
	
	//비동기화메서드이므로 어떤 스레드라도 얼마든지 접근이 가능하다.
	public void print() {
		System.out.println(Thread.currentThread().getName() + " " + "value값 : " + this.value);
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	
}
