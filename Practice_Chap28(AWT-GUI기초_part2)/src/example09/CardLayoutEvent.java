package example09;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class CardLayoutEvent extends Frame {

	Button first, prev, next, last;
	Panel buttons;     //종속적컨테이너 , 버튼의 배치를 위해서 패널을 선언
	Panel slide;
	Panel card1, card2, card3, card4, card5; //slide에 포함 될 패널들
	CardLayout card;
	
	public CardLayoutEvent(String title) {
		super(title);
	}
	
	public void CardShow() {
		//화면을 담을 Panel을 만든다.
		this.slide = new Panel();
		this.card = new CardLayout();
		this.slide.setLayout(card);
		
		//버튼을 담을 Panel을 만든다.
		this.buttons = new Panel();
		this.buttons.setLayout(new FlowLayout());
		
		this.first = new Button("<<");
		this.prev = new Button("<");
		this.next = new Button(">");
		this.last = new Button(">>");
		
		//패널에다가 버튼을 추가함
		this.buttons.add(first);
		this.buttons.add(prev);
		this.buttons.add(next);
		this.buttons.add(last);
		
		//각각의 패널을 5개 만들고 있다.
		this.card1 = new Panel();
		card1.setBackground(Color.gray);
		card1.add(new Label("첫 번째 페이지입니다."));
		
		this.card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("두 번째 페이지입니다."));
		
		this.card3 = new Panel();
		card3.setBackground(Color.blue);
		card3.add(new Label("세 번째 페이지입니다."));
		
		this.card4 = new Panel();
		card4.setBackground(Color.cyan);
		card4.add(new Label("네 번째 페이지입니다."));
		
		this.card5 = new Panel();
		card5.setBackground(Color.pink);
		card5.add(new Label("다섯 번째 페이지입니다."));
		
		//slide(Panel)에 card1(Panel)을 "1"이란 이름으로 추가를 했다.
		this.slide.add(card1, "1");
		this.slide.add(card2, "2");
		this.slide.add(card3, "3");
		this.slide.add(card4, "4");
		this.slide.add(card5, "5");
		
		//이벤트 처리 부분
		//버튼에 ActionEvent리스너를 추가한다
		this.first.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//CardLayout의 첫번째 slide(Panel)이 보이도록 한다.
				card.first(slide);
			}
		});
		
		this.prev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//현재 slide 시점에서 다음 slide를 보이도록한다.
				card.previous(slide);
			}
		});
		this.next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//현재 slide 시점에서 다음 slide를 보이도록한다.
				card.next(slide);
			}
		});
		this.last.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//맨 마지막 슬라이드로 이동하게함.
				card.last(slide);
			}
		});
		this.add("South", buttons);
		this.add("Center", slide);
		this.setSize(500, 500);
		this.setLocation(300, 100);
		this.setVisible(true);
		
		//제일먼저 실행되면 보여질것
		card.show(slide, "1");
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}
