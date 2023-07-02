package example04;

public class ClassEx {

	public static void main(String[] args) {
		
		//객체로부터 클래스 정보를 얻는 방법(getClass() - Object클래스에 있음)
		Person person = new Person();     //기본생성자호출
		Class class1 = person.getClass();
		//패키지명을 포함한 클래스명을 리턴을 함.
		System.out.println(class1.getName());
		//클래스명만 리턴하는 메서드
		System.out.println(class1.getSimpleName());
		
		System.out.println();
		//문자열로부터 객체의 정보를 얻는 방법(Class.forName())
		try {
			Class class2 = Class.forName("example04.Person");
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		
		
		
		
	}

}
