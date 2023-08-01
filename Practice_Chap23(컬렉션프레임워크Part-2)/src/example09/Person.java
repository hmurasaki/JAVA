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

//	@Override
//	public int compareTo(Person o) {
		//오름차순 방법 1
//		if(this.age < o.age) //디스에이지가 오점에이지보다 작다면
//			return -1;
//		else if(this.age == o.age) //디스에이지와 오점에이지가 같다면
//			return 0;
//		else //그것도아니라면
//			return 1;

		//오름차순 방법 2
//		return this.age - o.age;
		
		//내림차순으로 하고싶다면..
//		return o.age - this.age;
//		
//	}
		
	//이름 오름차순
	@Override
	public int compareTo(Person o) {
		//오름차순 방법 1
//		if(this.name.compareTo(o.name) < 1) 
//			return -1;
//		else if(this.name.compareTo(o.name) == 0) 
//			return 0;	
//		else
//			return 1;
		
		//오름차순 방법 2
//		return this.name.compareTo(o.name) - o.name.compareTo(this.name);
		
		//내림차순
		return this.name.compareTo(this.name) - this.name.compareTo(o.name);
	}	
	
}
