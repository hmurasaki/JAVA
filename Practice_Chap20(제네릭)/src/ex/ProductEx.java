package ex;

public class ProductEx {

	public static void main(String[] args) {

		Product<Teacher> p1 = new Product<>();
		p1.setT(new Teacher(2023, 30));
		
		System.out.println("올 해는 " + p1.getT().getYear() + "년이고, 스승님의 나이는 " + p1.getT().getAge() + "살 입니다.");
		
		
		
	}

}
