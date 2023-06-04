package example01;


//추상클래스란? 1개이상의 추상메서드를 포함하는 클래스를 추상클래스라고함.
//추상클래스는 인스턴스를 절대로 생성할 수가 없다. (추상메서드가있기때문에)
//추상메서드란? 선언부만 존재하고, 구현부가 없는 것을 추상메서드라함.

public abstract class ContentSender {

	private String title;
	private String name;
	
	//생성자
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}
	
	//getter 제공
	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
	
	//추상메서드는 꼭 public으로
	//추상메서드 > 상속을 통해서 반드시 재정의가 되어야 비로소 인스턴스를 생성할 수 있다.
	public abstract void sendMessage(String content);
	
	
	
	
}
