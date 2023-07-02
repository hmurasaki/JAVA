package ArraysExample;

import java.util.Arrays;

//사용자정의 클래스는 반드시 정렬하기위해서는 컴페어러블인터페이스를 구현해야한다. 구현하지않으면 예외가발생
class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);    //자동오름차순정렬 사전순 오름차순
		return this.age - o.age;       //내림차순으로하고싶다면 반대로 o.age - this.age;
		
	}
	
}


public class ArraySortEx {

	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 29);
		Person person2 = new Person("이길동", 40);
		Person person3 = new Person("고길동", 35);
		Person person4 = new Person("손길동", 19);
		Person person5 = new Person("차길동", 30);
		
		Person[] persons = { person1, person2, person3, person4, person5 };
		Arrays.sort(persons);
		//배열검색 (binartSearch 는 반드시 sort후에 해야함)
		int index = Arrays.binarySearch(persons, person2);
		System.out.println("person2인스턴스가 있는 인덱스 : " + index + ", 이름 : " + person2.name);
		System.out.println();
		
		
//		System.out.println("사용자정의배열 소팅 후 : " + Arrays.toString(persons));    //주소값출력
		for(Person person : persons)
			System.out.println("이름 : " + person.name + ", 나이 : " + person.age);
		
		
		
		
		
		
		
		
		
		
		
		//기본형타입과 String클래스는 sort를하게되면 기본적으로 오름차순으로 정렬이 이루어짐.
		int[] arr = { 55, -10, -9, 0, 100 };
		Arrays.sort(arr);
		System.out.println("기본형 타입 소팅 후 : " + Arrays.toString(arr));   //오름차순 자동 정렬
		
		String[] names = new String[] { "홍길동", "김개똥", "배유라", "신은혁" };
		Arrays.sort(names);
		System.out.println("String 타입 소팅 후 : " + Arrays.toString(names));   //오름차순 자동 정렬
		
		
		
	}

}
