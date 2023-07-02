package example02;

public class TrimEx {

	public static void main(String[] args) {
		
		//공백없애서 붙여주는것 trim (좌우공백만 제거함)	중간에있는 공백은 프로그래머가 직접 제거하는 코드를 작성해야함
		String tel1 = "     02";
		String tel2 = "-772   ";
		String tel3 = "   -1037";
		
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		
		
		
	}

}
