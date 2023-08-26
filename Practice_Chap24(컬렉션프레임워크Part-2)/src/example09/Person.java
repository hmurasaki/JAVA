package example09;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public int compareTo(Person o) {
		if(this.age < o.age)           //(this.name.compareTo(o.name) < 1)    /이름으로 정렬시
			return -1;
		else if(this.age == o.age)     //(this.name.compareTo(o.name) == 0)   /이름으로 정렬시
			return 0;
		else
			return 1;
//		return this.age - o.age;      //오름차순          //this.name.compareTo(o.name) - o.name.compareTo(this.name);
//		return o.age - this.age;      //내림차순
	}
	
	
	
	
	
	
	
	
}
