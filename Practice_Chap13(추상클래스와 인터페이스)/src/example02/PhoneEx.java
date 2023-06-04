package example02;

public class PhoneEx {

	public static void main(String[] args) {
		
		//추상클래스는 인스턴스를 생성할 수가 없다.
		//Phone phone = new Pone();
		Phone[] p = new Phone[10];
		p[0] = new SmartPhone(20230528, "홍길동", "LG-V50");
		p[1] = new FolderblePhone(20230120, "티아라", "SAMSUNG-FOLDERBLE-20");
		
		//근본이 Phone이라 SmartPhone,FolderblePhone에 선언되어있는 메서드는 사용할 수 없다.
		p[0].turnOff();
		p[0].showInfo();
		
		System.out.println("------------------------------");

		p[1].turnOff();
		p[1].showInfo();
		
		SmartPhone smartPhone = new SmartPhone(20230528, "홍길동", "LG-V50");
		smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		System.out.println("------------------------------");
		
		FolderblePhone fPhone = new FolderblePhone(20230120, "티아라", "SAMSUNG-FOLDERBLE-20");
		fPhone.showInfo();
		fPhone.turnOn();
		fPhone.turnOff();
		fPhone.foldOn();
		fPhone.foldOff();
	}

}
