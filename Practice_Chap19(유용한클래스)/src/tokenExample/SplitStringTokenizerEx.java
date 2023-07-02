package tokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {

	public static void main(String[] args) {
		
		String data = "baby     cat dog a b c d e f s a e d g";    //공백으로 데이타를 줬음
		
		long start = System.nanoTime();
		
		//split()은 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면
		//공백도 하나의 토큰(단어)로 인식을 한다.
		String[] result = data.split(" ");
		for(String str : result) {
//			System.out.println(str);
		}
		long end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end-start) + "ns");
		
//		System.out.println("--------------------------------------");
//		System.out.println("토큰 개수 : " + result.length);
//		System.out.println("--------------------------------------");
		
		//StringTokenizer는 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고있다면,
		//공백은 토큰으로 인정하지 않는다.
		StringTokenizer sTokenizer = new StringTokenizer(data, " ");
		start = System.nanoTime();
		while(sTokenizer.hasMoreElements()) {
//			System.out.println("남은 토큰수: " + sTokenizer.countTokens());
			String str = sTokenizer.nextToken();
//			System.out.println(str);
		}
		end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end-start) + "ns");
	}

}
