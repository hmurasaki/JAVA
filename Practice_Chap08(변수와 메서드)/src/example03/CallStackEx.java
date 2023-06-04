package example03;

public class CallStackEx {

	public static void main(String[] args) {
		//콜스택은 후입선출이다. (콜스택은 LIFO 구조이다)
		//ex) 택시기사 아저씨의 동전통 <-> 큐(Queue, FIFO(FirstIn,FirstOut), 파이프, 수도호스)
		
		System.out.println("main()실행 됨");
		//static은 static만 호출할 수 있다.
		CallStackEx.first();
		System.out.println("main()종료 됨");
	}
	
	public static void first() {
		System.out.println("first()실행 됨");
		second();                           //같은 클래스내에 메서드라면 클래스명은 생략해도 무방하다.
		System.out.println("first()종료 됨");
	}
	
	public static void second() {
		System.out.println("second()실행 됨");
		CallStackEx.third();
		System.out.println("second()종료 됨");
	}

	public static void third() {
		System.out.println("third()실행 됨");
		System.out.println("third()종료 됨");
	}

}
