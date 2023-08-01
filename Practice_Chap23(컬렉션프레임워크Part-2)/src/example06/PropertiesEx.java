package example06;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
		
		//Properties객체는 키와 값을 String로 제한한 Map컬렉션
		Properties properties = new Properties();
		
		//PropertiesEx와 동일한 곳에 지금 프라퍼티파일이 존재하므로 아래와 같이 패스를 알아오는 것
		String path = PropertiesEx.class.getResource("database.properties").getPath();  //경로얻기
		
		//파일경로 출력
		System.out.println(path);
		//한글로 파일경로 출력되도록 디코딩
		path = URLDecoder.decode(path, "UTF-8");   //한글 3바이트 /예외발생하기때문에 throws Exception
//		path = URLDecoder.decode(path, "EUC-KR");  //한글 2바이트 /한글이 깨져서나온다.
		System.out.println(path);
		
		//database.properties	파일을 읽어들인다.
		properties.load(new FileReader(path));     //컨+쉬+o	
		
		
		System.out.println("===========================================");
		//키를 주고 값을 읽어옴.
		//아래방법으로 하면, 데이터베이스내부 내용이바뀌어도 코드를 변경 해 줄 필요가없음
		String driver = properties.getProperty("driver");
		System.out.println("driver : " + driver);
		String url = properties.getProperty("url");
		System.out.println("url : " + url);
		String username = properties.getProperty("username");
		System.out.println("username : " + username);
		String password = properties.getProperty("password");
		System.out.println("password : " + password);
		
		
	}

}
