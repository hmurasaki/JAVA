package example07_인터페이스;

public class Person implements MyInterface {

	@Override
	public void method() {
		System.out.println(MyInterface.MAX_NUM);
		System.out.println("MyInterface를 구현한 Person클래스의 메서드 호출");
	}
	
	@Override
	public void dmethod() {
		System.out.println("MyInterface의 디폴트 메서드 오버라이딩 한 메서드 호출");
	}
	

}
