package example01;

public class ObjectEqualsEx {

	public static void main(String[] args) {
		
		//equals = 주소비교
		
		//Object클래스의 최고조상 equals()메서드를 보자
		//아래 코드는 서로 주소가 다 다르다. ( new연산자 때문 )	
		Object object1 = new Object();
		Object object2 = new Object();
		
		boolean result1 = object1.equals(object2);         //쉬프트 + f2
		boolean result2 = (object1 == object2);
		System.out.println("equals() : " + result1);
		System.out.println("==연산자 : " + result2);
		System.out.println(object1);
		System.out.println(object2);
		//false가 나오는 이유 : object클래스의 equals()는 원래 원론적으로 메모리번지 비교 , 주소가 다르기때문에 false가 나옴
		
		
	}

}
