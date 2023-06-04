package example03;


//인터페이스의 본질 = 추상메서드
public interface A {
	int MAX = 10; //static final 붙이지 않았음에도 MAX가 휜다. static final역시 컴파일시 컴파일러가 자동으로 붙여줌.
	void method();  //public abstract 생략 가능 , 컴파일시에 컴파일러가 자동으로 붙여준다.
	
	
}
