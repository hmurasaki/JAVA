package example05;

public class ThreadNameEx {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println("[프로그램 시작 스레드 명] : " + thread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("[ThreadA를 생성한 스레드 명] : " + Thread.currentThread().getName());
		System.out.println("[main스레드가 threadA의 이름을 가져온 것] : " + threadA.getName());
		threadA.start();
		
		System.out.println();

		Thread threadB = new ThreadB();
		System.out.println("[ThreadB를 생성한 스레드 명] : " + Thread.currentThread().getName());
		System.out.println("[main스레드가 threadB의 이름을 가져온 것] : " + threadB.getName());
		threadB.start();
		//위의 코드들은 메인스레드 2개의 스레드를 생성해서 start()시켜주는 것 (파생)
		//비로스 threadA와 threadB가 독립적으로 실행이 되는 것.
	}

}
