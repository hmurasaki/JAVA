package exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneManager {
	
	//메뉴 번호를 위한 상수 정의
	final int INSERT = 1;      //전화번호 저장
	final int DELETE = 2;      //전화번호 삭제
	final int SEARCH = 3;      //전화번호 검색
	final int SHOWALL = 4;      //전화번호 보기
	final int EXIT = 5;      //종료
	
	private Scanner scanner;
	private HashMap<String, Phone> map = new HashMap<>();
	
	public PhoneManager() {
		this.scanner = new Scanner(System.in);
	}
	
	
	//전화번호 관리 메서드
	public void run() {
		System.out.println("-----------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다.");
		System.out.println("-----------------------------------");
		
		//무한루프돌기
		while(true) {
			//분기치기
			System.out.print("1:저장, 2:삭제, 3:찾기, 4:전체보기, 5:종료 >>");
			//nextInt()는 사용자가 입력의 가장 마지막 개행문자(엔터키)를 제거하지않는다.
			//개행문자 전에 숫자만 입력받는다.
			//해결방법
			//1. 스캐너에 넥스트라인 한번 외치기 scanner.nextLine();  > 버퍼내용이 다 비워진다.
			
			
			int menu = scanner.nextInt();    //받아주기
			scanner.nextLine();        //버퍼비우기.
			switch(menu) {
				case INSERT : 
					insert();       //호출하고
					break;          
				case DELETE : 
					delete();       //호출하고
					break;  
				case SEARCH : 
					search();       //호출하고
					break;  
				case SHOWALL : 
					showAll();       //호출하고
					break;  
				case EXIT : 
					System.out.println("프로그램을 종료합니다.");
					return;
				default :
					System.out.println("입력이 잘못 되었습니다. 다시 입력하세요.");
					continue;
			}
		}
	}
	//전화번호 저장 메서드    INSERT
	public void insert() {
		System.out.print("이름 >>");
		String name = scanner.nextLine();
		//이름으로 기존등록여부 확인
		if(map.get(name) != null) {
			System.out.println(name + "님은 이미 저장되어있습니다.");
			return;
		}
		
		
		System.out.print("주소 >>");
		String address = scanner.nextLine();
		System.out.print("전화번호 >>");
		String telNum = scanner.nextLine();
		
		//해쉬맵에 저장
		map.put(name, new Phone(name, address, telNum));
		System.out.println(name + "님이 저장되었습니다.");
	}
	//전화번호 삭제 메서드 DELETE
	public void delete() {
		System.out.print("이름 >>");
		String name = scanner.nextLine();
		Phone phone = map.remove(name);
		//삭제 전 등록여부확인
		if(phone == null)
			System.out.println(name + "님은 등록되지 않은 사람입니다.");
		else
			System.out.println(name + "님의 정보가 삭제되었습니다.");
	}
	//전화번호 찾기 메서드 SEARCH
	public void search() {
		System.out.print("이름 >>");
		String name = scanner.nextLine();
		Phone phone = map.get(name);
		//삭제 전 등록여부확인
		if(phone == null)
			System.out.println(name + "님은 등록되지 않은 사람입니다.");
		else
			System.out.println(phone.toString());
	}
	//전체 전화번호 보기 SHOWALL
	public void showAll() {
		int count = 1;
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		
		System.out.println("현재 저장되어 있는 고객 정보 리스트입니다.");
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			Phone phone = map.get(name);
			System.out.println(count + ". " +phone.toString());
			count++;
			System.out.println("----------------------------------------");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
