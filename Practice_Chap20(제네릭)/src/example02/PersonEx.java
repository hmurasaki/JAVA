package example02;

public class PersonEx {

	public static void main(String[] args) {
		
		//Person 제네릭 클래스에 T를 String만 들어오게끔 타입고정
		Person<String> person1 = new Person<>();
		person1.setT("홍길동");         
		String str = person1.getT();      
		System.out.println(str);
		
		//현업에서 데이터의 통일화를 가져오고, 타입 변환 제거도 되고, 컴파일시 예외 발생시켜줌
		Person<Integer> person2 = new Person<>();
		//person2.setT(new Integer(100));
		person2.setT(100);              //자동박싱코드 생김
		int value = person2.getT();     //자동 언박싱코드
		System.out.println(value);
		
		Person<Apple> person3 = new Person<>();
		//person2.setT(new Integer(100));
		person3.setT(new Apple());              //자동박싱코드 생김
		Apple apple = person3.getT();     //자동 언박싱코드
		System.out.println(apple);
		
		
		
		
	}

}
