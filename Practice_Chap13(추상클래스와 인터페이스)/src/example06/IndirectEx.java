package example06;

public class IndirectEx {

	public static void main(String[] args) {
		
//		A a = new A();
//		a.method(new B());
		
		I i = new B();
		i.method();
		
		
		i = new C();
		//a.method(new C());
		i.method();
	}

}
