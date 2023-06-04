package example02;

public class Member {
	
	int iv = 100;        //인스턴스 멤버변수
	static int cv = 200; //static 멤버변수
	
	//인스턴스 메서드
	public void imethod() {
		System.out.println("iv : " + this.iv);
//		System.out.println("cv : " + cv);  //cv or Memver.cv = 클래스명.정적변수명
		
		
		
	}
	
	//정적 static 메서드
	public static void smethod() {
		//System.out.println("iv : " + this.iv); //안된다 = 인스턴스가 언제 만들어질지 모르기 때문에
		System.out.println("cv : " + cv);        //cv는 static변수이기 때문에 인스턴스 생성없이도 접근가능해야하는데, static메서드 내에서는 얼마든지 접근이 가능하다.
		
	}
	
}
