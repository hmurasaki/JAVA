package example03;

public class MonitorEx {

	public static void main(String[] args) {
		
		//모니터의 참조변수는 리모컨과 같은 것이라고 생각하자.
		Monitor monitor = new Monitor();
		
		System.out.println(monitor.toString());
	
		monitor.channel = 5;
		monitor.power();
		monitor.chaanelUp();
		monitor.chaanelUp();
		monitor.channelDown();
		monitor.volume = 5;
		monitor.volumeUp();
		monitor.volumeUp();
		monitor.volumeUp();
		monitor.volumeDown();

		System.out.println(monitor);
		
		monitor.power();

	}

}
