package example09;

//인터페이스도 일종의 조상이기 때문에 인터페이스가 제네릭타입이면 구현클래스도 제네릭이어야한다.
public class Storage<T> implements Storable<T> {

	private T[] arr;
	
	public Storage(int size) {
		//this.arr = new T[size];
		this.arr = (T[])(new Object[size]);
	}
	
	
	@Override
	public void add(T item, int index) {
		this.arr[index]	= item;
	}

	@Override
	public T get(int index) {
		return this.arr[index];
	}
	
	public T[] getT() {
		return this.arr;
	}

}
