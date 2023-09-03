package exam01.example09;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollBarEx {

	public static void main(String[] args) {
		
		//ScrollBar는 사용자가 정해진 범위 내에 있는 값을 쉽게 선택 할 수 있도록
		//해주는 컴포넌트이다. 주로 볼륨 설정 혹은 속도 조절, 색상 선택과 같은 곳에
		//자주 사용된다.
		Frame frame = new Frame("ScrollBar");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		//수평 스크롤바
		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 100);
		hor.setSize(100, 15);
		hor.setLocation(60, 100);
		
		frame.add(hor);
		
		//수직스크롤바
		Scrollbar var = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
		var.setSize(15, 100);
		var.setLocation(30, 30);
		
		frame.add(var);
		frame.setVisible(true);
		
		
		
	}

}
