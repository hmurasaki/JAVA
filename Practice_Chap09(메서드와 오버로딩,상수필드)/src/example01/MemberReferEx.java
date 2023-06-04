package example01;

public class MemberReferEx {

	int iv;             //인스턴스 멤버변수
	static int cv;      //정적 멤버변수
	
	
	//인스턴스 메서드
	//이유 : 인스턴스 메서드가 호출될 때는 이미 인스턴스가 생성되어있을것임.
	public void instanceMethod() {
		System.out.println(this.iv); //인스턴스 변수 사용가능
//		System.out.println(this.cv); //주소를알기때문에 접근은 가능. 그러나 이렇게 접근하면안된다.
		System.out.println(cv);      //정적 멤버변수 사용가능 . 이렇게 접근해야함. this빼고
	}
	
	//인스턴스가 언제 생성될지 아무도 모르기 때문에 정적 메서드 내에서는 인스턴스 멤버변수들을 절대 사용할 수가 없다.
	public static void staticMethod() {
//		System.out.println(this.iv); //인스턴스 변수 사용 불가.
		System.out.println(cv);      //정적 멤버변수 사용 가능.
//		this.instanceMethod();       //인스턴스 멤버메서드 사용 불가.
	}

	
	
}
