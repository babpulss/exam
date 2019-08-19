import java.io.File;

import it.sauronsoftware.ftp4j.FTPClient;

public class Main {
	public static void main(String[] args) {
		FTPClient client = new FTPClient();
		try {
			client.connect("192.168.60.54");	
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("서버와의 연결에 실패");
			System.exit(0);
		}

		try {
			client.login("java", "1234");
		}catch(Exception e) {
			System.out.println("아이디나 비밀번호를 다시 확인");
			e.printStackTrace();
			System.exit(0);
		}
//		try{
//		client.download("집에가자.txt", new File("d:/다운성공1.txt"));
//		} catch(Exception e) {
//			System.out.println("파일을 찾을 수 없습니다");
//			e.printStackTrace();
//		}
		try {
			client.deleteDirectory("/welcome to dongmaggol");
		}catch(Exception e) {
			e.printStackTrace();
		}

		try {
			client.disconnect(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
