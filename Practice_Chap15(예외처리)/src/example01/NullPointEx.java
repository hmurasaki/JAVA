package example01;

public class NullPointEx {

	public static void main(String[] args) {
		
		String str = null;
		//이 예외는 객체(인스턴스)가 없는데 어떻게 인스턴스에있는 toString()를 호출하니?라는 뜻.
//		System.out.println(str.toString());
		
		try {
			System.out.println(str.toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
