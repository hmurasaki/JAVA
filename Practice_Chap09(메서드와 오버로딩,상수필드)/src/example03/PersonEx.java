package example03;

public class PersonEx {

	public static void main(String[] args) {
		
		
		Person p1 = new Person(50);
		Person p2 = new Person(150);
		Person p3 = new Person(250);
		//final 속성은 상수이므로 값을 변경 절대 못함.
//		p.nation = "USA";
//		p.age = 100;
	
		System.out.println(p1);           //p1.age = 50
		System.out.println(p2);			  //p2.age = 150
		System.out.println(p3);           //p3.age = 250
		
		
		System.out.println(Person.MAX_NUMBER);
		System.out.println(Person.MAX_NUMBER);
		System.out.println(Person.MAX_NUMBER);
	}

}
