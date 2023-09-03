package exam02.example01;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("메뉴");
		frame.setSize(300, 200);

		
		//메뉴바 만들기
		MenuBar menuBar = new MenuBar();
		
		//메뉴 생성
		Menu mFile = new Menu("파일");
		
		//메뉴 아이템 생성
		MenuItem mNew = new MenuItem("새파일");
		MenuItem mOpne = new MenuItem("열기");
		
		//메뉴 아이템이 아닌 서브메뉴를 가지는 것은 메뉴이기때문에 메뉴를 추가한다
		Menu mOthers = new Menu("기타");
		MenuItem mExit = new MenuItem("끝내기");
		
		//메뉴에다가 메뉴아이템을 추가하고 있다.
		mFile.add(mNew);
		mFile.add(mOpne);
		
		//계층형 메뉴를 생성을 하고 있다. (메뉴안에 메뉴)
		mFile.add(mOthers);
		
		//메뉴 분리선 추가
		mFile.addSeparator();   //분리선
		mFile.add(mExit);
		
		//기타메뉴에 들어갈 메뉴아이템을 만들기
		MenuItem mPrint = new MenuItem("출력하기");
		MenuItem mPriview = new MenuItem("미리보기");
		MenuItem mPsetup = new MenuItem("프린터설정");
		
		//기타메뉴에 메뉴아이템 추가하기.
		mOthers.add(mPrint);
		mOthers.add(mPriview);
		mOthers.add(mPsetup);
		
		Menu mEdit = new Menu("편집");
		Menu mView = new Menu("보기");
		Menu mHelp = new Menu("도움말");
		
		//체크박스 만들기
		CheckboxMenuItem mStatus = new CheckboxMenuItem("상태표시");
		mView.add(mStatus);
		
		
		//메뉴바에다가 메뉴들을 더 추가함.
		menuBar.add(mFile);
		menuBar.add(mEdit);
		menuBar.add(mView);
		menuBar.add(mHelp);
		
		//프레임에다가 추가하기
		frame.setMenuBar(menuBar);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
		
	}

}
