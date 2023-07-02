package example01;

public class StudentEx {

	public static void main(String[] args) {
		
		Student student1 = new Student(10, "홍길동", new int[] {100, 90});
		Student student2 = new Student(10, "홍길동", new int[] {100, 90});       //나이,이름 둘중 하나가 다를경우 false가 나옴
		
		System.out.println(student1.equals(student2));
		
	}

}
