package example07;

import java.util.Vector;

public class BoardEx {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		System.out.println("용량 : " + vector.capacity());     //기본적으로 10개
		System.out.println("저장된 객체 수 : " + vector.size());    //size는 저장된 객체 수를 의미함. 기본적으로 0개
		
		vector.add(new Board("제목1", "내용1", "작성자1"));
		vector.add(new Board("제목2", "내용1", "작성자1"));
		vector.add(new Board("제목3", "내용1", "작성자1"));
		vector.add(new Board("제목4", "내용1", "작성자1"));
		vector.add(new Board("제목5", "내용1", "작성자1"));
		vector.add(new Board("제목6", "내용1", "작성자1"));
		vector.add(new Board("제목7", "내용1", "작성자1"));
		vector.add(new Board("제목8", "내용1", "작성자1"));
		vector.add(new Board("제목9", "내용1", "작성자1"));
		vector.add(new Board("제목10", "내용1", "작성자1"));
		vector.add(new Board("제목11", "내용1", "작성자1"));
		
		
		System.out.println("용량 : " + vector.capacity());     
		System.out.println("저장된 객체 수 : " + vector.size());    //저장된 객체수가 11이되었다.
		
		
		vector.remove(2);
		vector.remove(5);
		vector.remove(8);
		
		System.out.println("용량 : " + vector.capacity());     
		System.out.println("저장된 객체 수 : " + vector.size());    //저장된 객체수가 10이되었다.

		System.out.println("--------------------------------------------");
		
		for(int i=0; i<vector.size(); i++) {
			if(vector.get(i) instanceof Board) {
				Board board = (Board)vector.get(i);
				board.show();                //제목 내용 작성자로 나옴
				System.out.println();
			}
		
//			System.out.println(vector.get(i));    //주소나옴
		}
	}

}
