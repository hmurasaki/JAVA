package example07_인터페이스;

public class Defailt_StaticEx {

	public static void main(String[] args) {
		
		MyInterface mInterface = new Person();
		mInterface.dmethod();
		mInterface.method();
		
		//인터페이스의 정적메서드도 호출하는 방법이 인터페이스명.정적메서드명 호출
		MyInterface.smethod();  //인터페이스명.정적메서드
		
	}

}
