package example01;

//상속을 하는 이유
//1. 공통된 코드는 조상에서 관리를 하고
//2. 개별적 부분은 자손에서 따로 관리를 하자.
//3. 코드의 재사용성

//상속은 직접적 관계이다
public class MoutainBicycle extends Bicycle {
	//멤버 개수 : 5개 (상속 2, 아래 3)
	String frame;
	int gear;
	int price;
	String sector;
	
	public void print() {
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("owner : " + this.owner);
		
	}
	
	public static void main(String[] args) {
		MoutainBicycle moutainBicycle = new MoutainBicycle();
		moutainBicycle.id = 1111;
		moutainBicycle.brand = "LESPO";
		moutainBicycle.frame = "알루미늄";
		moutainBicycle.gear = 33;
		moutainBicycle.price = 300000;
		moutainBicycle.owner = "홍길동";
		
		moutainBicycle.print();
	}
	
}
