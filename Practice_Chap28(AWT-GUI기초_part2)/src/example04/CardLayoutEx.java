package example04;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutEx {

	public static void main(String[] args) {

		Frame frame = new Frame("CardLayout");
		
		//레이아웃을 직접 생성해서 대입을 하고 있다
		CardLayout card = new CardLayout(10, 10);
		frame.setLayout(card);
		
		//Frame에 종속될 컨테이너인 패널을 3개를 생성
		Panel card1 = new Panel();
		card1.setBackground(Color.LIGHT_GRAY);
		card1.add(new Label("카드-1"));
		
		Panel card2 = new Panel();
		card2.setBackground(Color.ORANGE);
		card2.add(new Label("카드-2"));
		
		Panel card3 = new Panel();
		card3.setBackground(Color.CYAN);
		card3.add(new Label("카드-3"));
		
		//Frame에다가 패널 3개를 추가하기
		frame.add(card1);
		frame.add(card2);
		frame.add(card3);
		
		//(중첩클래스핸들러)핸들러생성 - 왼쪽,오른쪽클릭 어느게되었는지 확인하기 / 마우스어댑터를 상속받고있다. / 마우스 이벤트 처리 부분
		class Handler extends MouseAdapter{
			@Override
			public void mouseClicked(MouseEvent e) {
				//마우스 오른쪽 버튼을 눌렀을 때..	
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					System.out.println(e.getModifiers());
					//이전 패널을 보여줌
					card.previous(frame);
				}
				//그게아니라면
				else {
					System.out.println(e.getModifiers());
					//다음 패널을 보여줌
					card.next(frame);
				}
			}
		}
		//마우스어댑터 클래스는 마우스리스너인터페이스를 구현하고 있기 때문에 얼마든지 핸들러의 인스턴스가 매개변수로 들어갈 수 있다.(인터페이스의 다형성)
		card1.addMouseListener(new Handler());       
		card2.addMouseListener(new Handler());     
		card3.addMouseListener(new Handler());     
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setSize(300, 300);
		frame.setLocation(500, 300);
		
		//Frame에 추가된 Panel중에서 처음으로 추가된 것을 보여준다
		//마지막에 추가된 것을 보여주고자 한다면 last(frame)으로 설정하면 된다.
		card.first(frame);      //card1을 먼저보여준다
		
		
		frame.setVisible(true);
		
		
		
		
	}

}
