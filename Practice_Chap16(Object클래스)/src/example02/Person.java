package example02;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	//hash시리즈들은 동등객체 판단하기 위해서 1차적으로 hashcode()호출
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
//		return this.name.hashCode() + this.age;       //값이같다면 해쉬코드를 리턴하도록 //하위호환개발할때 사용
		return Objects.hash(this.name, this.age);      //신규개발할때 사용
	}
	
	
	
	
	
	//2차적으로 값이 또 같은디 equals()호출
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Person) { //타입비교
			Person person = (Person)obj;
			if(this.name.equals(person.name) && (this.age == person.age)) {
				return true;   //같다면
			}
		}
		return false;         //같지않다면
	}
	
	//객체의 주소보다 좀 의미있는 데이터를 출력하게끔 toString()오버라이딩 
	@Override
	public String toString() {
		return "이름 : " + this.getName() + "\n" + 
				"나이 : " + this.getAge();
	}
	
}
