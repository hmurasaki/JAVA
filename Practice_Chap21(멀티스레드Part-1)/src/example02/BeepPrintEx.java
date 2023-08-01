package example02;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	//메인메서드는 JVM이 실행한다.
	public static void main(String[] args) {
		
		//직접 생성하는 방법.(멀티스레드)
		//방법 1
//		Runnable runnable = new Beep();    //구현객체 대입
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		
		//방법 2 ( 익명구현객체 만들어서 하는 방법 )
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++){
//					System.out.println("비프음 실행하는 스레드 명 : " + 
//										Thread.currentThread().getName());
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				}
//			}
//		});
//		thread.start();
		
		//방법 3 ( 람다식 > 함수적인터페이스에서만 적용됨 :인터페이스에서 추상메서드가 오직 한개인것을 의미 / 가독성이 좋다)
		Thread thread = new Thread( ()-> {
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++){
				System.out.println("비프음 실행하는 스레드 명 : " + 
									Thread.currentThread().getName());
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("for문을 실행하는 스레드명 : " + Thread.currentThread().getName());
			System.out.println("똑~");				
	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}			
			
	}

}
