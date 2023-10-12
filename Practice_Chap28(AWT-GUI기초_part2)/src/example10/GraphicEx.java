package example10;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame {
	
	public GraphicEx(String title) {
		super(title);
		this.setBounds(100, 100, 400, 300);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	//paint메서드를 호출하는 곳이 어디에도 없다.
	@Override
	public void paint(Graphics g) {
		//AWT 스레드가 paint()호출하고 그림까지 그려주는 역할을 한다.
		Thread thread = Thread.currentThread();
		System.out.println("paint()움직이는 스레드" + thread.getName());
		
		g.setFont(new Font("Serif", Font.PLAIN, 15));    //폰트설정
		g.drawString("Graphics를 이용해서 그림을 그립니다.", 10, 50);    //문자열출력
	
		//타원을 그리는 부분
		g.drawOval(50, 100, 100, 50);
		//파란색으로 색만 지정(적용x)
		g.setColor(Color.blue);
		//적용
		g.fillOval(50, 100, 100, 50);
		
		
		//선을 그린다.
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
		
		//둥근 사각형 그리기
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
		
		//호 그리기
		g.setColor(Color.ORANGE);
		g.fillArc(250, 200, 100, 100, 0, 120);
		
	
	
	}
	
	
	

}
