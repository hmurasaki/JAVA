package example03;

public class ThrowAndThrowsEx {

	public static void main(String[] args) {
		
		boolean result = false;
		try {
			result = findClass();
			if(result) {
				System.out.println("클래스가 존재합니다.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();      //개발자용. 배포시에는 제거나 주석처리를 해줘야함. 이유 :
		} finally {
			System.out.println("정상 종료합니다.");
		}
		
		
		
	}
	
	public static boolean findClass() throws ClassNotFoundException {
		Class class1 = Class.forName("java.lang.String");
		
		//클래스가 있다면...
		if(class1 != null)
			return true;
		else       //클래스가 없다면...
			return false;
	
	}

}
