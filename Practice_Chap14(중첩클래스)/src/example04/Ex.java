package example04;

public class Ex {

	public static void main(String[] args) {
		
		//외부클래스 생성
		Outside outside = new Outside();
		Outside.Inner inner = outside.new Inner();

//		inner.method();
		inner.showInfo();
		outside.show();
	}

}
