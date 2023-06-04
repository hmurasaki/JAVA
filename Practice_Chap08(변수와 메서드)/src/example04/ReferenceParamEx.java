package example04;


public class ReferenceParamEx {

	public static void main(String[] args) {
		
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출 전 main()내의 값 : " + a.data);
		
		//동생한테 "시계가 어딨니?" 라고 물어보는 형태라서 값을 읽고, 수정도할 수가 있다.
		//Call by Reference(주소에 의한 호출)
		ReferenceParamEx.dataChange(a);
		System.out.println("dataChange()호출 후");
		System.out.println("메서드 호출 후 main()내의 값 : " + a.data);
		
	}
	//int[], int[], String --> 참조변수형태 호출해줘야함
	public static void dataChange(A a) {
		//주소 a라는 주소 값은 매개변수로 넘어왔기 때문에 주소를 공유한다. a라는 주소 공유를 하게되면 호출한 곳에서는 영향을 무조건 받는다.
		a.data = 44;
		System.out.println("dataChange()내의 값 : " + a.data);
		
		return;
	}
	
}
