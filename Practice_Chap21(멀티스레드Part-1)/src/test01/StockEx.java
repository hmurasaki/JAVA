package test01;

public class StockEx {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		Thread thread1 = new UsingThread(stock, "스승님");
		Thread thread2 = new UsingThread(stock, "혜지");
		
		thread1.start(); thread2.start();
	}

}
