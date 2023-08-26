package example06;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
		
		//Properties객체는 키와 값을 String로 제한한 Map컬렉션
		Properties properties = new Properties();
		
		//PropertiesEx와 동일한 곳에 지금 프라퍼티파일이 존재하므로 아래와 같이 패스를 알아오는 것이다.
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		//파일경로 출력
		System.out.println(path);
		//한글로 파일경로 출력되도록 디코딩하기 (사람이보기 편하게)
		path = URLDecoder.decode(path, "UTF-8");     //UTF-8은 한글이 3바이트
//		path = URLDecoder.decode(path, "EUC-KR");      //한글은 유니코드로하려면 3바이트가되야하는데 EUC-KR은 한글을 2바이트로 인식함
		System.out.println(path);
		
		//database.properties 파일을 읽어들인다.
		properties.load(new FileReader(path));     //컨쉬오
		
		//키를 주고 값을 읽어옴
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
