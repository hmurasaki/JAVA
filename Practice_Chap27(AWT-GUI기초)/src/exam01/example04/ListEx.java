package exam01.example04;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class ListEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("List");
		
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();      //디멘전 구해서 스크린사이즈 구하려함
		Dimension screenSize = toolkit.getScreenSize();     //화면크기
		
		frame.setLocation((screenSize.width/2)-150, (screenSize.height/2)-100);
		frame.setVisible(true);
		
		List list1 = new List();
		list1.setBounds(20, 40, 100, 120);
		list1.add("선생님");
		list1.add("과학자");
		list1.add("대통령");
		list1.add("프로그래머");
		list1.add("국방부장관");
		
		//----------------------------------------
		
		List list2 = new List(100, true);      //생성자의 두번째 인자값을 true로 설정을 하여 리스트 목록에서 다중선택이 가능하도록 함 (알트+클릭)
		list2.setBounds(150, 40, 100, 120);
		list2.add("신은혁");
		list2.add("김연아");
		list2.add("이순신");
		list2.add("손연재");
		list2.add("홍길동");
		
		frame.add(list1);      //하나만 선택이된다
		frame.add(list2);      
		frame.setVisible(true);
		frame.setResizable(true);    
		
	}

}
