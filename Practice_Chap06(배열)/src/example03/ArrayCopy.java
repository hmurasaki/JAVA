package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] ori = new int[] { 10, 77, 33, 50 };
		int[] target = new int[10];
		int count = 0;

		System.out.println("복사하기 전");
		System.out.println("target길이 : " + target.length);
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		// for문을 이용해서 직접 복사하는 방법
//		for(int i=0; i<ori.length; i++) {
//			target[i] = ori[i];
//		}

//		for(int i : ori) {
//			target[count++] = i;
//		}
		// System.arraycopy(ori, 0, target, 0, ori.length); //방은 그대로 유지하되 배열복사를 할 경우.
		// 그리고 복사속도가 가장 빠름.

		System.out.println("복사한 후");
		// Arrays의 copyOf메서드는 완전히 복사될 배열과 동일하게 복사를 해버리는 배열복사 메서드이다.
		// target = Arrays.copyOf(ori, ori.length);
		System.out.println("target길이 : " + target.length);
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));

	}

}
