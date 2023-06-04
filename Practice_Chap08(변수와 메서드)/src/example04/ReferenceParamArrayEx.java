package example04;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 50};
		System.out.println("change메서드 호출 전의 값 : " + arr[0]);
		System.out.println("main() arr의 주소 값 : " + arr);
		
		change(arr);  
		//배열명은 곧 주소다.       
		//또는 위의 int[] ~ sys.out전부 죽이고 change(new int[] {10.20.30}); 으로해도 나옴. 좌측과 같이 주소값을 넘겨도 된다.
		
		System.out.println("change메서드 호출 후의 값 : " + arr[0]);
	}
	
	public static void change(int[] arr) {
		System.out.println("main() arr의 주소 값 : " + arr);
		arr[0] = 999;
		System.out.println("change()메서드 내의 값 : " + arr[0]);
		return;
	}

}
