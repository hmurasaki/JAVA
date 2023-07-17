package example02;

//Person이라는 클래스를 제네릭 타입으로 설계함 <T>	
public class Person<T> {
	
	//T라는 타입이 아직 정해지지 않은 단계.      > 개발코드에서 정해짐
	//Static 멤버는 올 수 없음
	private T t;
	
	public Person() {
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	
	
	
	
	
}
