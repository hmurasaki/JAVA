package example03;

public class HddEx {

	public static void main(String[] args) {
		
		HddDisk hddHisk = new HddDisk(500, 7200);
		UsbMemory usbMemory = new UsbMemory(32, 960);
		
		System.out.println("HDD상세");
		System.out.println(hddHisk.status());
		System.out.println();
		
		System.out.println("USB상세");
		System.out.println(usbMemory.status());
		System.out.println(usbMemory.status(9999));
	}

}
