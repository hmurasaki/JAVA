package example03;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		a.method1();
		A.method2(); //정적멤버클래스라 대문자A
		
	}

}
