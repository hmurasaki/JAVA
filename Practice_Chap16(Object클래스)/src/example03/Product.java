package example03;

import java.util.Arrays;

//클래스의 복제가 가능하게 하려면, 인터페이스 java.lang.cloneable인터페이스를 구현해야한다.
public class Product implements Cloneable {
	
	//얕은복제
	private String id;
	private String name;
	private int price;
	private int[] arr;
	
	
	//생성자
	public Product(String id, String name, int price, int[] arr) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return this.arr;
	}
	
	@Override
	public String toString() {
		return "상품id : " + this.getId() + "\n"
				+ "상품이름 : " + this.getName() + "\n" 
				+ "상품가격 : " + this.getPrice() + "\n" 
				+ "배열값 : " + Arrays.toString(this.arr);
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		
//		return super.clone();
//	}
	
	public Product getProduct() {
		
		Product cloned = null;
		
		try {
			//얕은복제가 여기서 일어난다 (참조변수의 값들은 번지 공유가됨)
			cloned = (Product)this.clone();      //여기서의 clone() = Object클래스의것을 호출
		} catch (CloneNotSupportedException e) { e.printStackTrace(); }     
		
		return cloned;
	}
	
	
	
	
}
