package example13;

public class ProducerThread extends Thread {
	
	//공유객체선언
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.setName("ProducerThrad");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			String data = "Data" + i;     //데이터를 생산
			this.dataBox.setData(data);   //데이터를 공유객체에 저장
		}
	}

}
