package example03;

//제네릭 클래스, 타입파라메터가 멀티파라메터이다(2개) 설계클래스 생성
public class Product<T,M> {

	private T t;
	private M m;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	
	
	
	
	
	
}
