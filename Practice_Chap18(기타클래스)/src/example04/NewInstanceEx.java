package example04;

interface I{
	public void method();
}

class A implements I{
	@Override
	public void method() {
		System.out.println("A메서드 호출");
	}
}
class B implements I{
	@Override
	public void method() {
		System.out.println("B메서드 호출");
	}
}

public class NewInstanceEx {

	public static void main(String[] args) throws Exception {
		
		//동적객체생성
		Class class1 = Class.forName("example04.A");     
		I i1 = (I)class1.newInstance();  //obj타입이기떄문에 I로 강제다운캐스팅      //동적객체생성
		i1.method();
		
		Class class2 = Class.forName("example04.B");
		I i2 = (I)class2.newInstance();                  //동적객체생성(실행을하면 생성이됨)
		i2.method();
	}

}
