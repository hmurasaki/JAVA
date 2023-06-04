package example04;

class Data{
	
	int data;
}


public class ReferenceRetrunClass {

	public static void main(String[] args) {
		
		Data ori = new Data();
		ori.data = 100;
		System.out.println(ori);
		Data cloned = copy(ori);
		System.out.println(cloned);
		System.out.println(cloned.data);
	}
	
	
	public static Data copy(Data d) {
		System.out.println(d);
		Data cloned = new Data();
		cloned.data = d.data;
		System.out.println(cloned);
		
		return cloned;       //Data 클래스의 주소를 넘기고 있다.
	}

}
