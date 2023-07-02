package example02;

import java.util.HashSet;

public class PersonEx {

	public static void main(String[] args) {
		
		//hash시리즈 들은 반드시 중복저장이 안되기때문에 해쉬코드와 이퀄즈를 오버라이딩 해줘야한다.
		HashSet hashSet = new HashSet();       //컨트롤+쉬프트+o       
		
//		String str1 = new String("가");
//		String str2 = new String("가");
		Person person1 = new Person("홍길동", 50);
		Person person2 = new Person("홍길동", 50);
		
//		hashSet.add(str1);
//		hashSet.add(str2);
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		//자동적으로 toString()호출
		System.out.println(person1);
		System.out.println(person2);
	}

}
