package example04;

public interface RemoteControl {
	
	//상수 선언(static final 속성을 지니고 있다)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메서드 3개 선언(abstract 속성을 지니고 있다)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
