package example03;

public class Person implements A {

	@Override
	public void method() {
		System.out.println("인터페이스 A를 구현한 Person클래스 입니다.");
	}
	
	void method1() {
		System.out.println("Person클래스의 멤버메서드 입니다.");
	}
	
	
}
