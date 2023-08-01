package example09;

public class TargetThread extends Thread {
	
	@Override
	public void run() {
		//20억번 루핑하면서, 실행 > 실행대기(runnable) > 실행
		for(long i=0; i<2000000000; i++){
		}
		
		//일시정지(TIMED_WAITING)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//20억번 루핑하면서, 실행 > 실행대기(runnable) > 실행
		for(long i=0; i<2000000000; i++){
		}
		
	}  //종료(TERMINATED)

}
