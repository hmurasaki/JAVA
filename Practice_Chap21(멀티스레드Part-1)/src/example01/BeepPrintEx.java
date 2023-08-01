package example01;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	//메인메서드는 JVM이 실행한다.
	public static void main(String[] args) {
		//현재 실행 중인 스레드명을 출력함.
		//System.out.println(Thread.currentThread().getName());
		
		//Toolkit은 추상클래스인데, 그중에 GUI관련된 메서드들로 구성되어진 인스턴스를
		//getDefaultToolkit()를 통해서 Toolkit클래스의 참조를 얻어낸다.
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("for문을 실행하는 스레드명 : " + Thread.currentThread().getName());
			toolkit.beep();     //비프음 출력
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}    //0.5초동안 스레드를 루프돌면서 멈춰줌
			}
		
			for(int i=0; i<5; i++) {
				System.out.println("for문을 실행하는 스레드명 : " + Thread.currentThread().getName());
				System.out.println("똑~");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			//위는 싱글스레드 똑~ + 출력음 같이 안나옴.
			//싱글스레드를 멀티스레드로 바꿔서 프로그램을 만드는 것이 우리의 할 일이다.
			
			
		}

}
