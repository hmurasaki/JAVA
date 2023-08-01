package test01;

public class UsingThread extends Thread {
	
	private Stock stock;
	
	public UsingThread(Stock stock, String name) {
		this.stock = stock;
		this.setName(name);
		
	}
	@Override
	public void run() {
		try {
//			this.toilet.noke();
			this.stock.buy();
		} catch (Exception e) {}
	}
	

}
