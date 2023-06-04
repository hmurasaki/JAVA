package example02;

public class Student {
	
	//멤버변수(필드)
	String name;
	int age;
	
//	public static String getName() {
//		return this.name;         //this 오류가 뜬다 왜? static 클래스 안에 사용했기 때문에.
//	}
	
	
	//Object클래스의 toString()오버라이딩(재정의)
	@Override
	public String toString() {
		
		//String str = "이름: " + this.name + ", " + "나이 : " + this.age;
		//this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 비로소 활성화됨)
		//this는 static메서드나 클래스 안에 사용 할 수 없다.
		return "이름: " + this.name + ", " + "나이 : " + this.age;
		
		//return str;
	}
	
	
}
