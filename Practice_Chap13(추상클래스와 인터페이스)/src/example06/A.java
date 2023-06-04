package example06;

public class A {
	
	//B클래스가 만들어져야만 컴파일예외가 사라짐.
	//B클래스 A클래스에게 직접적 영향을 끼친다.
//	public void method(B b) {
//		b.method();
	
	//사용하는 측
	public void method(I i) {
		i.method();
	
	}
	
}
