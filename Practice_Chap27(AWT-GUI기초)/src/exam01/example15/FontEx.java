package exam01.example15;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Font");
		frame.setSize(500, 500);
		
		String str = "가나다라마바사아자차카타파하";
		
		Label str1 = new Label(str);
		Label str2 = new Label(str);
		Label str3 = new Label(str);
		Label str4 = new Label(str);
		Label str5 = new Label(str);
		
		Font font1 = new Font("Serif", Font.PLAIN, 20);     //기본체
		Font font2 = new Font("HY견고딕", Font.ITALIC, 20);    //ITALIC = 기울임
		Font font3 = new Font("Serif", Font.BOLD, 20);
		Font font4 = new Font("HY견고딕", Font.BOLD + Font.ITALIC, 20);
		Font font5 = new Font("YuppySC-Regular", Font.PLAIN, 20);
		
		//Label에 새로운 폰트를 적용한다
		str1.setFont(font1);
		str2.setFont(font2);
		str3.setFont(font3);
		str4.setFont(font4);
		str5.setFont(font5);
		
		frame.setLayout(new FlowLayout());
		frame.add(str1);
		frame.add(str2);
		frame.add(str3);
		frame.add(str4);
		frame.add(str5);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		frame.setVisible(true);
		
		
	}

}
