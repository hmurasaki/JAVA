package example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {
		
		SamsungPhone sam = new SamsungPhone();
		sam.setCompany("삼성");
		sam.setModel("갤럭시8");
		sam.setRelease(2018);
		sam.setColor("검정");
		
		System.out.println(sam.toString());
		
		SamsungPhone sam1 = new SamsungPhone();

		sam1.setCompany("LG");
		sam1.setModel("G6");
		sam1.setRelease(2018);
		sam1.setColor("검정");
		
		System.out.println(sam1.toString());
		
		
		
	}

}
