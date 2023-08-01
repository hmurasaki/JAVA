package example02;

import java.util.Map;
import java.util.Set;

public class ThreadGroupEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		//map컬렉션은 <키, 값> 키로 값을 찾아오는 자료구조의 한 형태
		//map은 인터페이스이고 배열기반이아니다. 고로 순서를 유지하지 않음.
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();  //컨+쉬+o
		
		//Map의 키값을 Set컬렉션 형태로 가져온다.(Set은 인터페이스이며 구슬주머니와 같은 형태이다)
		Set<Thread> threads = map.keySet();       //컨+쉬+o
		
		for(Thread thread : threads) {
			System.out.println("스레드 이름 : " + thread.getName() + ((thread.isDaemon() ? "(데몬스레드)" : "(주스레드)")));
			
			//스레드 그룹 출력하기
			System.out.println("\t 소속 그룹 : " + thread.getThreadGroup().getName());
			System.out.println();
		}
		
	}

}
