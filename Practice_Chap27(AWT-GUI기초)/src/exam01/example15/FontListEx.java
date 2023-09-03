package exam01.example15;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontListEx {

	public static void main(String[] args) {
		
		//GraphicsEnvironment클래스는 GraphicsDevice클래스 및 font클래스들을 포함하고 있는 클래스이다.
		GraphicsEnvironment gEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		//모든 폰트들을 가져와서 배열로 리턴함
		Font[] fonts = gEnvironment.getAllFonts();
		for(int i=0; i<fonts.length; i++)
			System.out.println(fonts[i].getFontName());
	}

}
