package exam01.example08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("TextArea");
		frame.setSize(400, 220);
		frame.setLayout(new FlowLayout());
		
		//text = TextArea에 보여질 text를 지정한다.
		//row = 줄(row)의 수를 지정한다
		//col = 열(column)의 수를 지정한다
		TextArea tArea = new TextArea("하고싶은 말을 적으세요", 10, 50, TextArea.SCROLLBARS_BOTH);
		
		frame.add(tArea);
		
		//TextArea의 text를 전체 선택되도록 한다
		tArea.selectAll();
		frame.setVisible(true);
	}

}
