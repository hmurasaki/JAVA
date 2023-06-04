package example08_익명객체;

public class SoundEx {

	public static void main(String[] args) {
		//익명구현객체(이름 없음) -- UI이벤트 처리나 스레드 객체 간편생성 목적
		Soundable soundable = new Soundable() {
			
			//내부적으로 클래스니까 멤버들을 선언할 수 있다.
			//하지만 외부에서는 접근불가. 근본이 인터페이스기때문에.
			int a = 20;
			public void method() {      //호출불가
				System.out.println("익명구현객체 메서드");
			
			}
			
			@Override
			public void sound() {
				String str = "밥그릇";
				System.out.println("첫번째 익명구현객체 : " + str);
				System.out.println(str + " 에 물을 담습니다.");
				System.out.println(str + " 에 숟가락으로 탕탕 칩니다.");
				this.method();
				System.out.println(this.a);
				
			}
		};
		
		soundable.sound();
		
		System.out.println();
		
		Soundable soundable1 = new Soundable() {
			
			//내부적으로 클래스니까 멤버들을 선언할 수 있다.
			//하지만 외부에서는 접근불가. 근본이 인터페이스기때문에.
			int a = 10;
			public void method() {      //호출불가
				System.out.println("익명구현객체 메서드");
			
			}
			
			@Override
			public void sound() {
				String str = "냄비";
				System.out.println("첫번째 익명구현객체 : " + str);
				System.out.println(str + " 에 물을 담습니다.");
				System.out.println(str + " 에 숟가락으로 탕탕 칩니다.");
				this.method();
				System.out.println(this.a);
				
			}
		};
		
		soundable1.sound();
	}
	

}
