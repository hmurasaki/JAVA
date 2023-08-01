package example13;

public class ConsumerThread extends Thread {
	
	//공유객체선언
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsumerThrad");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			String data = this.dataBox.getData(); //데이터 소비
			//System.out.println("가져온 데이터 : " + data);
		}
	}

}
