package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		
		//indexof 찾기 기능을 할 때 자주 쓰임. 찾는문자열이있으면 그 인덱스를 받아올수있다 , 찾는 문자열이없으면 -1을 리턴한다
		String str = "오늘은 자바 가 하기 싫네요.";
		int index = str.indexOf("공부");
		System.out.println("공부의 시작 방 번호 : " + index);
		
		//공부라는 문자열이 포함되어 있으면...
		if(str.indexOf("공부") != -1) {
			System.out.println("공부와 관련된 내용이군요.");
		}
		else {
			System.out.println("공부와 관련없는 내용이군요.");
		}
	}

}
