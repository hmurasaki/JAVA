package exercise;

public class Phone {
	
	private String name;   //이름
	private String addrress; //주소
	private String telNum;  //전화번호
	
	public Phone(String name, String addrress, String telNum) {
		this.name = name;
		this.addrress = addrress;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public String getAddrress() {
		return addrress;
	}

	public String getTelNum() {
		return telNum;
	}
	
	@Override
	public String toString() {
		
		return "이름 : " + this.name + "\n주소 : " + this.addrress + "\n전화번호 : " + this.telNum;
		
	}
	
	
}
