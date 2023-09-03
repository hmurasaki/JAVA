package exam01.example03;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Choice");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		//현재는 	choice라는 명칭은 거의 없다.
		//다만 리스트박스,콤보박스,드랍다운리스트 라고 불리어진다.
		Choice choice = new Choice();
		
		//choice에 리스트아이템을 추가
		choice.add("월요일");
		choice.add("화요일");
		choice.add("수요일");
		choice.add("목요일");
		choice.add("금요일");
		choice.add("토요일");
		choice.add("일요일");
		System.out.println(choice.getItem(5));
		
		choice.setBounds(100, 70, 100, 50);
		frame.add(choice);
		
		frame.setVisible(true);
		
		
		
	}

}
