package example02;

public class A {
	
//	C c = new C();
	B b1 = new B();
	A.C c = new A.C();

	public A() {
		System.out.println("-----------------------------------");
		System.out.println("외부클래스 A의 생성자 호출");
		B b = new B();  //인스턴스 멤버클래스는 외부클래스A의 멤버이다. 그래서 선언 가능함.
		System.out.println(b.a);
		b.method1();
		C c = new C();
		System.out.println(c.a);
		System.out.println(C.c);
		c.method1();
		C.method2();      //C클래스명으로 접근
		this.method();
//		D d = new D();    //메서드 내부에 선언했으나 선언불가 > 이유 : 로컬클래스의 내부가 아니라서 호출 불가능.
		System.out.println("-----------------------------------");
	}
	
	//인스턴스 멤버클래스 B
	class B{
		int a = 10;
		//static int cv = 20;
		public B() {
			System.out.println("중첩클래스 B의 생성자 호출");
		}
		public void method1() {
			System.out.println("B클래스의 멤버메서드 호출");
		}
//	 	static void method2() {
//			 
//		}
	 
	}
	
	//정적 멤버클래스 C
	static class C {
		int a = 10;
		static int c = 20;
		
		public C() {
			System.out.println("static정적멤버클래스 C의 생성자 호출");
		}
		
		public void method1() {
			System.out.println("static정적멤버클래스 C의 메서드1 호출");
		}
		public static void method2() {
			System.out.println("static정적멤버클래스 C의 메서드2 호출");
		}
		
	}
	
	public void method() {
		//로컬클래스 안에는 절대로 static멤버가 올 수 없음
		class D{
			int a = 1000;
			public D() {
				System.out.println("로컬클래스 D의 생성자 호출");
			}
			public void lmethod() {
				System.out.println(this.a);
				System.out.println("로컬클래스 D의 멤버 메서드 호출");
			}
		}
		
		//로컬클래스는 메서드 내부에서만 생성 및 사용이 가능하다.
		D d = new D();
		d.lmethod();
	}
	
}
