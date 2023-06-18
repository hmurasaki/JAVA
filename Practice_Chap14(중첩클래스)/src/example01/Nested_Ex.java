package example01;

public class Nested_Ex {

	//인스턴스 멤버 클래스
	class A {
		int iv = 100;
		//static int cv = 200;      //static 멤버변수는 사용 불가 (구버전은 사용 불가) // Nested_Ex.A.cv
		
		public A() {
			System.out.println("A생성자 호출");
		}
		public void method1 () {
			System.out.println("A클래스의 method1() 호출");
		}
		// Nested_Ex.A.method2(); 안되는게 정상인데 요즘버전은 되는듯함
//		public static void method2 () {
//			System.out.println("A클래스의 method1() 호출");
//		}
	}
	//정적 멤버 클래스
	static class B {
		int iv = 100;
		static int cv = 500;  //Nested_Ex.B.cv 접근 가능하기 때문에 선언 된다.
		
		public B() {
			System.out.println("B생성자 호출");
		}
		public void method1 () {
			System.out.println("B클래스의 method1() 호출");
		}
		public static void method2() {
			System.out.println("B클래스의 method2() 호출");
		}
	}
	
	public void method1() {
		//로컬 클래스 선언과 사용(메서드 내 선언하여, 잠깐 사용할 용도)
		class C {
			int iv = 200;
			//static cv = 700;        //static 멤버 선언 불가
			public C() {
				System.out.println("로컬클래스C 생성자 호출");
			}
			
			public void lmethod() {
				System.out.println("로컬클래스C 메서드 호출");
			}
		}
		//로컬클래스는 해당 메서드 내에서만 사용 가능하다
		C c = new C();
		System.out.println(c.iv);
		c.lmethod();
		
	}
	
	public void method2() {
		//로컬 클래스 선언과 사용(메서드 내 선언하여, 잠깐 사용할 용도)
		class D {
			int iv = 200;
			//static cv = 700;        //static 멤버 선언 불가
			public D() {
				System.out.println("로컬클래스D 생성자 호출");
			}
			
			public void lmethod() {
				System.out.println("로컬클래스D 메서드 호출");
			}
		}
		//로컬클래스는 해당 메서드 내에서만 사용 가능하다
		D d = new D();
		System.out.println(d.iv);
		d.lmethod();
		
		class E {
			int iv = 200;
			//static cv = 700;        //static 멤버 선언 불가
			public E() {
				System.out.println("로컬클래스E 생성자 호출");
			}
			
			public void lmethod() {
				System.out.println("로컬클래스E 메서드 호출");
			}
			//로컬클래스는 해당 메서드 내에서만 사용 가능하다
			
		}
		E e = new E();
		System.out.println(e.iv);
		e.lmethod();
	}
	
	
	public static void main(String[] args) {
		
		Nested_Ex ne = new Nested_Ex();
		//인스턴스 멤버 클래스는 외부클래스의 인스턴스가 반드시 있어야 생성 가능.
		Nested_Ex.A a = ne.new A();
		System.out.println(a.iv);
		a.method1();
		
		System.out.println("--------------------------------");
		
		//정적클래스 외부클래스의 인스턴스가 없어도 접근 가능
		System.out.println(Nested_Ex.B.cv);
		Nested_Ex.B.method2();
		Nested_Ex.B b = new B();
		System.out.println(b.iv);
		b.method1();
		
		System.out.println("--------------------------------");
		
		ne.method1();
		ne.method2();
	
		//멤버클래스와 로컬클래스를 구분짓는 잣대는 무엇인가?
		//순번.........로컬클래스는 순번이 붙는다.
	}

}
