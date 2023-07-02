package example04;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
	}
	
	//매개변수가있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
