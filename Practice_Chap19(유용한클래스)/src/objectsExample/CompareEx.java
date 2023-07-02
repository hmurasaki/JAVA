package objectsExample;

import java.util.Comparator;
import java.util.Objects;

public class CompareEx {

	//중첩클래스(정적멤버클래스)
	static class Student {
		int sno; //학번
		String name; //학생이름
		
		public Student(int sno, String name) {
			this.sno = sno;     //매개변수가있는 생성자
			this.name = name;
		}
	}
	static class StudentComparator implements Comparator<Student>{
		//이름name를 가지고 비교
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.name.compareTo(o2.name) < 0)
				return -1;
			else if(o1.name.compareTo(o2.name) == 0)
				return 0;
			else
				return 1;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(1, "홍길동");
		Student student3 = new Student(3, "김연아");
		
		//비교자(comparator<T> 인터페이스를 익명구현 객체로 대입을 한 것
//		int result = Objects.compare(student1, student3, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.sno < o2.sno)
//					return -1;
//				else if(o1.sno == o2.sno)
//					return 0;
//				else
//					return 1;
//				
//				return o1.sno - o2.sno;
//			}
//			
//		
//		});
		
		int result = Objects.compare(student1, student3, new StudentComparator());
		
		
		
		if(result > 0) {
			System.out.println("o1.sno가 큽니다.");
		}
		else if(result == 0) {
			System.out.println("o1.sno과 o2.sno가 같습니다.");
		}
		else {
			System.out.println("o2.sno가 큽니다.");
		}
			
		
		
		
		
	}

}
