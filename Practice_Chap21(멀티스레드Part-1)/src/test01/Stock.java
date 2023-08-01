package test01;

//공유 객체 개념
public class Stock {
	
	//플래그 변수
	//메서드 잠금이 일어난다.
//	private boolean seat;
	
	public  synchronized void buy() throws Exception {
		
		String name = Thread.currentThread().getName();
		
		//누군가가 주식을 샀을 때
//		if(this.seat == false) {
			System.out.println(name + "가(이) 국장에 입장하셨습니다.");
//			this.seat = true;
			
			Thread.sleep(1000);
			System.out.println(name + "가(이) [한미반도체]를 평단 50,000원에 100주 구매했습니다.");
			
			//this.seat = false;
			System.out.println(name + "가(이) [한미반도체]를 5,000원에 100주 판매했습니다.");
			System.out.println();
			
			
//		}
//		else {
			System.out.println(name + "가(이) 국장 이용중입니다 기다리세요!");
//		}
		
	}
	//비동기화 메서드
//	public void noke() {
//		System.out.println(Thread.currentThread().getName() + " 똑똑! ");
//	}
	
}
