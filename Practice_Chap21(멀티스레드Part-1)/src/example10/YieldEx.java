package example10;

public class YieldEx {

	public static void main(String[] args) throws Exception {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		//2초동안은 ThreadA , B 가 번갈아가면서 작업을 한다.
		Thread.sleep(3000);
		
		threadA.work = false;
		
		Thread.sleep(3000);
		
		threadA.work = true;
		threadB.work = false;
		
		Thread.sleep(3000);
		
		threadA.stop = true;
		threadB.stop = true;
	}

}
