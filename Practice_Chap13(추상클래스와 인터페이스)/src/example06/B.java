package example06;

public class B implements I{
	
	//I인터페이스를 구현함으로써 A클래스와 간접적 관계가 되어버림.
	//엄밀히말하면 제공하는측(구현클래스)
	@Override
	public void method() {
		System.out.println("인터페이스 I를 구현한 클래스B의 메서드 호출");
	}
	
	

}
