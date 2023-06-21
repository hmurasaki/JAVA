package example03;

public class ThrowsEx {
	
	//JVM 에게 예외를 던진다.
	public static void main(String[] args) {
		
//		method1();        //JVM에게 예외를 던진경우 > 메인메서드에 throws exception 붙이기.
//		method1();        //해당메서드에 throwsException을 넣으면 에러뜨면서 호출이안된다. 원래는 호출되었음. 아래처럼 트라이캐치해줘야함

		
		//main()에서 method1()호출하고있으니 여기서 예외처리를 해야한다.
		try {
			method1();
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
	}
	//Throws는 메서드 선언부 끝에 작성을하고, 호출한 곳으로 예외를 되던지며, 호출한 곳에서 예외를 반드시 처리해야한다.
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		System.out.println(10/0);            //산술예외발생(실행예외)	
	}
	

}
