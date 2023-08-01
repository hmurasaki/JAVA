package example05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {

	public static void main(String[] args) {
		
		//HashMap : 신버전  /HashTable : 구버전 /기능은 같다.
		Map<String, String> map = new Hashtable<>();
		
		//객체추가
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12");
		System.out.println("총 Entry 수 : " + map.size());
		int count = 0;  //비밀번호의 틀린 횟수 측정
		
		//사용자로부터 받아서 객체검색하기
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			//저장되어있는 객체를 검색하여(일종의 DB) 아이디와 비밀번호가 일치하면 로그인.
			//일치하지 않으면 무한루프 빠져나오기.
			
			if(map.containsKey(id)) { //위의DB중에 해당 아이디가있다면
				//키를 주고 얻어오는 값은 password이니까 패스워드까지 같다면
				//로그인성공시켜주고,아니면 비밀번호가 불일치된다. 단, 틀린횟수 1증가됨(비번)
				if(map.get(id).equals(password)) { //이퀄즈로 패스워드비교
					System.out.println(id + "님이 로그인 되었습니다.");
					break;
				}
				else { //비번이틀리면
					count++;   //틀린횟수 증가
					System.out.println("비밀번호가" + count + "회 틀렸습니다.");
					if(count == 3) { //3번틀렸음
						System.out.println("비밀번호가" + count + "회 틀렸습니다. 지점 방문 부탁드립니다.");
						break;   //3회틀렸으니 더이상 로그인시도불가
					}
				}
			}
			else {  //해당 아이디가 없다면
				System.out.println("해당 아이디가 존재하지않습니다.");
			}
		}
		scanner.close();
	}

}
