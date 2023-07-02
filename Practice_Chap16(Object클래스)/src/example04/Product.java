package example04;

import java.util.Arrays;

//클래스의 복제가 가능하게 하려면, 인터페이스 java.lang.cloneable인터페이스를 구현해야한다.
public class Product implements Cloneable {
	
	//깊은복제
	private String id;
	private String name;
	private int price;
	private int[] arr;
	private Apple apple;
	
	
	//생성자
	public Product(String id, String name, int price, int[] arr, Apple apple) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
		this.apple = apple;
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
	
	public Apple getApple() {
		return this.apple;
	}
	
	@Override
	public String toString() {
		return "상품id : " + this.getId() + "\n"
				+ "상품이름 : " + this.getName() + "\n" 
				+ "상품가격 : " + this.getPrice() + "\n" 
				+ "배열값 : " + Arrays.toString(this.arr) + "\n"
				+ "애플값 : " + this.apple.price;
	}
	
	public Product getProduct() {
		
		Product cloned = null;
		
		try {
			
			cloned = (Product)this.clone();      //여기서의 clone() = Object클래스의것을 호출
		} catch (CloneNotSupportedException e) { e.printStackTrace(); }     
		
		return cloned;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은복제를 호출(기본형타입때문에)
		Product cloned = (Product)super.clone();     //Object클래스의 clone()호출
		//참조타입들을 복제하는 코드 (프로그래머 직접작성)
		cloned.arr = Arrays.copyOf(this.arr, this.arr.length); //배열복제
		cloned.apple = new Apple(this.apple.price);            //클래스복제
		
		return cloned;
		
	}
	
	
}
