package exam01.example06;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxEx {

	public static void main(String[] args) {

		Frame frame = new Frame("CheckBox");
		frame.setSize(305, 250);
		
		//프레임의 레이아웃매니저는 BorderLayout인데 여기서는 FlowLayout을 설정을 함
		//FlowLayout방식은 배치의 한 방식으로 좌측에서 우측으로 컴포넌트를 정렬시킨다.
		//지금은 왼쪽정렬을 선택했다.
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//Checkbox는 개별적으로 생성을 하게되면 다중선택이 되어진다.(중요)
		Label q1 = new Label("1. 애용이의 매력 부위는?(다중 선택 가능)");
		
		//true을 매개값으로 주면 선택된 상태로 나타난다.
		Checkbox pet1 = new Checkbox("뱃살", true);
		Checkbox pet2 = new Checkbox("허벅지살", true);
		Checkbox pet3 = new Checkbox("발바닥젤리", true);
		Checkbox pet4 = new Checkbox("촉촉한 이슬을 머금은 코", true);
		
		frame.add(q1);
		frame.add(pet1);
		frame.add(pet2);
		frame.add(pet3);
		frame.add(pet4);
		
		//----------------------------------------------
		
		//다중선택 불가능 = CheckboxGroup()
		Label q2 = new Label("2. 애용이 뱃살 만족도는?");
		CheckboxGroup group1 = new CheckboxGroup();   //그룹생성
		
		//그룹을 매개값으로 주면 1개만 선택이된다 (라디오버튼)
		Checkbox pet5 = new Checkbox("만족", group1, false);
		Checkbox pet6 = new Checkbox("매우만족", group1, true);
		Checkbox pet7 = new Checkbox("불만족", group1, false);
		Checkbox pet8 = new Checkbox("매우불만족", group1, false);
		
		frame.add(q2);
		frame.add(pet5);
		frame.add(pet6);
		frame.add(pet7);
		frame.add(pet8);
		
		frame.setVisible(true);

		
		
		
		
		
		
	}

}
