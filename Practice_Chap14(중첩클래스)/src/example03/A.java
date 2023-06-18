package example03;

public class A {

	//인스턴스 멤버클래스 선언
	class B{
		public B() {
			System.out.println("인스턴스멤버클래스 B생성자");
		}
	}
	
	//정적 static 멤버클래스 선언
	static class C{
		public C() {
			System.out.println("인스턴스멤버클래스 C생성자");
		}
	}
		
	//A의필드로선언     인스턴스멤버(필드)
	B b = new B();
	C c = new C();
	
	//인스턴스 멤버메서드
	//method1()을 사용할 때 쯤, 이미 외부클래스 A의 인스턴스가 만들어진상태
	public void method1() {
		System.out.println("method1()내");
		B b = new B();
		C c = new C();
	}
	
	//정적멤버 선언
//	static B b1 = new B();        //얘만 문제되는 이유는 인스턴스멤버클래스이기 때문에 static을 붙이면 문법에러
	static C c1 = new C();
	
//	A.B c2 = new B(); //얘는 문제가안된다
//	static A.B c2 = new B();   //얘는 문제가 됨 
	
	
	//static은 static만 접근 가능
	public static void method2() {
		System.out.println("method2()내");
//		B b = new B();         //인스턴스멤버클래스이므로 안됨
		C c = new C();         //얘는 메서드가 정적(static) 메서드이므로 정적 로컬변수로 선언해도 	가능
	}
	
	
	
	//결론 : 중첩클래스에서의 인스턴스 필드나 메서드는 언제든지 생성 가능 , 정적(static)필드&정적메서드는 정적클래스에서만 중첩생성가능
}
