import java.io.File;

import it.sauronsoftware.ftp4j.FTPClient;

public class Main {
	public static void main(String[] args) {
		FTPClient client = new FTPClient();
		try {
			client.connect("192.168.60.54");	
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("�������� ���ῡ ����");
			System.exit(0);
		}

		try {
			client.login("java", "1234");
		}catch(Exception e) {
			System.out.println("���̵� ��й�ȣ�� �ٽ� Ȯ��");
			e.printStackTrace();
			System.exit(0);
		}
//		try{
//		client.download("��������.txt", new File("d:/�ٿ��1.txt"));
//		} catch(Exception e) {
//			System.out.println("������ ã�� �� �����ϴ�");
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
