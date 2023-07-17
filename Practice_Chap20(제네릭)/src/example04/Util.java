package example04;

public class Util {

	//<T>는 제네릭타입 메서드를 지칭한다. / 리턴타입과 매개변수 타입을 동일하게 <T>타입으로 가져가야하는 것을 의미.
	//외부로부터 T타입을 받아서 Person<T>라는 제네릭클래스의 인스턴스를 생성하여 리턴을 해주는 역할을 한다. (changing이라는 메서드가)
	public static<T> Person<T> changing(T t){
	
		Person<T> person = new Person<>();
		person.setT(t);
		
		
		return person;
		
	}
	
	
	
	
	
	
}
