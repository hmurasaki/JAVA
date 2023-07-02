package example01;

import java.util.Arrays;

public class Student {

	int age;
	String name;
	int[] subject;      //인티저배열타입
	
	public Student(int age, String name, int[] subject) {
		this.age = age;
		this.name = name;
		this.subject = subject; 
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//equals 비교 코드
		System.out.println("equals()");
		
		//타입변환이 가능한지 여부를 알아보기 위해서 instanceof 연산자 이용
		if(obj instanceof Student) {     //obj가 스튜던트클래스맞니?
			Student student = (Student)obj;  //(Student)타입캐스팅
			//논리적 동등을 위해서 조건문을 설정, 나이와 이름이 다 같다라는 의미
			boolean result = Arrays.equals(this.subject, student.subject);
			if( (this.age == student.age) && (this.name.equals(student.name)) && result) {
				
				return true;
			}
				
		}//만약 위 조건이 맞지않는다면
		return false;
	}
	
	
}
