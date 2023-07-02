package example02;

public class EqualsEx {

	public static void main(String[] args) {
		
		String str1 = new String("홍길동");
		String str2 = "홍길동";       //리터럴타입으로 String생성(대입)
		String str3 = "홍길동";
		
		// == 연산자가 주소비교하는 연산자
		if(str1 == str2) {
			System.out.println("같은 번지의 인스턴스입니다.");
		}
		else {
			System.out.println("다른 번지의 인스턴스입니다.");
		}
		
		//같은 리터럴의 경우 같은 번지를 참조
		if(str2 == str3) {
			System.out.println("같은 번지의 인스턴스입니다.");
		}
		else {
			System.out.println("다른 번지의 인스턴스입니다.");
		}
		
		//값 비교    String의 equals()는 값 비교(Object클래스의 equals()를 오버라이딩)
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다.");
		}
		else {
			System.out.println("다른 문자열입니다.");
		}
		if(str2.equals(str3)) {
			System.out.println("같은 문자열입니다.");
		}
		else {
			System.out.println("다른 문자열입니다.");
		}
			
		
		
		
		
		
		
	}

}
