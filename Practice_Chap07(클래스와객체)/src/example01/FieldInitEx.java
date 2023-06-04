package example01;

public class FieldInitEx {

	public static void main(String[] args) {
		
		//붕어빵을 찍고 있다.	
		//제품을 생산하고 있다.
		//new연산자가 클래스에 있는 멤버들의 바이트 크기만큼 힙에다가 메모리 할당을 함과 동시에 초기화를 시켜주는 역할을 함.
		FieldInit fi = new FieldInit(); //fi = 리모콘과 같은 기능.
		System.out.println(fi.byteField);
		System.out.println(fi.boolField);
		System.out.println(fi.floatField);
		System.out.println(fi.arrField);
		
		System.out.println(fi.toString());
		
		
	}

}
