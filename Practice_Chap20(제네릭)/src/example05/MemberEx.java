package example05;

public class MemberEx {

	//제네릭 클래스인 Member를 리턴함.    MemberEx클래스의 인스턴스메서드
	public <T> Member<T> boxing(T t){         //인스턴스메서드
		Member<T> member = new Member<>();
		member.setT(t);
		return member;
	}
	
	//MemberEx클래스의 정적 메서드
	public static<T> Member<T> wrapping(T t){         //인스턴스메서드
		Member<T> member = new Member<>();
		member.setT(t);
		return member;
	}
	
	
	
	public static void main(String[] args) {
		
		MemberEx memberEx = new MemberEx();
		Member<Integer> member = memberEx.boxing(new Integer(100));
		System.out.println("Member클래스의 값 : " + member.getT());
		
		Member<String> member2 = MemberEx.wrapping("홍길동");
		System.out.println("Member클래스의 값 : " + member2.getT());
	}

}
