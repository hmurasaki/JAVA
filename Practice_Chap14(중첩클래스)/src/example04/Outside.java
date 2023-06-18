package example04;

public class Outside {

	//외부클래스의 필드 선언
	String str = "Outside-field";
	
	//멤버메서드 선언
	public void method() {
		System.out.println("Outside-method()호출");
	}
	
	//내부클래스 선언
	class Inner {
		//필드 가질수 있음 필드 선언
		String str = "Inner-field";
		
		//내부멤버메서드 선언
		public void method() {
			System.out.println("Inner-method()호출");
		}
		
		//내부멤버메서드 선언
		public void showInfo() {
			//내부클래스에 접근하는 방법 = this
			System.out.println(this.str);        //현재 this는 Inner의 this를 가르킨다.
			this.method();
			
			//외부클래스에 접근하는 방법
			//외부클래스명.this.외부클래스멤버이름
			System.out.println(Outside.this.str);     //여기의 this는 Outside의 this를가르킴
			Outside.this.method();
		}
		
	}
	
	//Inner class의 외부
	public void show() {
		System.out.println("------------------------------");
		
		//외부클래스 영역에서의 this는 당연히 Outside다.
		System.out.println(this.str);    //여기의 this는 Outside의 this  
		this.method();
		
		//외부클래스에서 내부클래스로 접근을 하려면 보이지 않기때문에 
		//아래와같이 인스턴스를 하나 생성해서 중첩클래스의 멤버들에게 접근을 하면 된다.
		Inner in = new Inner();     //내부로 인스턴트하나만들고
//		System.out.println(in.str);
		in.showInfo();
	}
}
