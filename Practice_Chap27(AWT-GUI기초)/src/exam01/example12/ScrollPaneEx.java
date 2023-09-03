package exam01.example12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPaneEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("ScrollPane");
		frame.setSize(300, 300);
		
		//ScrollPane은 종속적 컨테이너로 단, 하나의 컴포넌트만 포함시킬 수 있는 컨테이너이다.
		//크기를 줄였다 늘였다 하면 스크롤바가 자동으로 생성되는 것을 볼 수가 있다.
		ScrollPane sPane = new ScrollPane();
		Panel panel = new Panel();
		panel.setBackground(Color.magenta);
		panel.add(new Button("첫번째"));
		panel.add(new Button("두번째"));
		panel.add(new Button("세번째"));
		panel.add(new Button("네번째"));
		
		sPane.add(new Button());
		sPane.add(new Button());
		sPane.add(new Button());
		sPane.add(new Button());
		
		sPane.add(panel);
		frame.add(sPane);
		frame.setVisible(true);
	}

}
