package exam01.example10;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Canvas");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		//Canvas는 현재 시점에서는 많이 퇴색되어 사용되지 않는다.
		//대체로 나온 것이 ImageView, Label, MideaView로 대체 되어지고 있다.
		Canvas canvas = new Canvas();
		
		//캔버스의 배경 색 지정
		canvas.setBackground(Color.blue);
		
		canvas.setBounds(50, 50, 150, 100);
		frame.add(canvas);
		frame.setVisible(true);
		
		
		
		
		
	}

}
