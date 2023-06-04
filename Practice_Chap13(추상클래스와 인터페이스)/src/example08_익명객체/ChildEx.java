package example08_익명객체;

public class ChildEx {

	public static void main(String[] args) {
		
		//익명 자손객체 -- UI이벤트 처리나 스레드 객체 간편생성 목적
		Parent parent = new Parent() {          //근본이 클래스
			
			int b = 10;
			public void method1() {
				System.out.println("익명자손객체 메서드");
			}
			
			@Override
			public void method() {
				int a = 10; //지역변수 선언
				System.out.println("a : " + a);
				System.out.println(this.b);
				this.method1();
			}
		};
		parent.method();
		
	}

}
