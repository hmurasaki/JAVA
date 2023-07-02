package ArraysExample;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {10, 20, 30, 40};
		
		//첫번째 배열복사 방법 (copyOf)
		int[] cloned = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
		System.out.println("------------------------------------------");
		
		//두번째 배열복사 방법 (copyOfRange)
		cloned = Arrays.copyOfRange(arr1, 1, 3);     //두번쨰 세번쨰는 어디서부터 어디까지 복사할거냐
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
		System.out.println("------------------------------------------");
		
		//세번째 배열복사 방법 (System.arraycopy)
		System.arraycopy(arr1, 0, cloned, 0, 2);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
		
		
		
		
	}

}
