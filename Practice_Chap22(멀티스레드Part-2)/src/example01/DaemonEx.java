package example01;

public class DaemonEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		autoSaveThread.setDaemon(true);     //setDaemon설정 (필히, start()메서드 호출 전에 설정을 해야함.
		autoSaveThread.start();
		
		//메인스레드가 5초동안 정지하면, daemon스레드인 autoSaveThread가 실행되고
		//메인 스레드가 종료되면 더 이상 autoSaveThread가 실행이 안된다.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인스레드 종료됨");
	}

}
