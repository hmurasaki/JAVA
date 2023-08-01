package example12;

public class WaitNotifyEx {

	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();  //공유객체 생성
		
		//실행코드에 가서 notify()와 wait()를 호출하는데, 둘 다 동기화 메서드로 되어 있어서
		//메서드 잠금이 일어나면서 서로 번갈아가며 깨우고 자고하면서 실행이 되는 것을 알 수 있다.
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();

		//스레드간의 협업 Object클래스의 메서드인 notify(), wait()를 이용하면된다.
		//단, 동기화처리(싱크로나이즈드)가 된 곳에서 호출하는 것이 바람직하다.
		
	}

}
