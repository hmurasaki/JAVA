package example01;

public class VarEx01 {

	public static void main(String[] args) {
		
		char ch = 'A';
		int year = 0;
		int age = 42;
		//아래의 코드에서 L은 long을 지정하기 위해서 접미사 l,L을 붙였다.
		long result = 10;
		//아래의 코드에서 F는 float를 지정하기 위해서 접미사 f,F를 붙였다.
		float result2 = 10.1F;
		double d = 9.999;
		
		System.out.println("ch : " + ch);
		System.out.println("long타입 출력 : " + result);
		System.out.println(result2);
		System.out.println(d);
		System.out.println(age + year);
		
		String str = new String("자바");
		System.out.println(str.toString());
		
		//사용자 정의 클래스이거나, toString()재정의를 하지 않은
		//클래스의참조변수는 출력을 하게 되면, 클래스 타입@16진수(주소)
		//로 나온다.
		Object obj1 = new Object();
		System.out.println(obj1);
		
		
	}

}
