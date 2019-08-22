import java.io.File;
import java.util.Scanner;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

public class Input {
	public void FTPRun() {
		FTPClient ftp = new FTPClient();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.println("=== FTP Client Program ===");
			System.out.println("1. Connect FTP Server");
			System.out.println("2. Exit Program");
			System.out.print(">>> ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				System.out.println("input url");
				System.out.print(">>> ");
				String url = sc.nextLine();
				System.out.println("input port");
				System.out.print(">>> ");
				int port = Integer.parseInt(sc1.nextLine());
				try {
					ftp.connect(url, port);
				}catch(Exception e) {
					System.out.println("���ӿ� �����߽��ϴ�");
					e.printStackTrace();
				}

				System.out.println("Try to connect : " + url + "(port : " + port + ")");
				System.out.println("FTP Server is connected");

				System.out.print("input id :");
				String id = sc.nextLine();
				System.out.print("input password :");
				String pw = sc1.nextLine();
				try {
					ftp.login(id, pw);
				}catch(Exception e) {
					System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ���ϼ���");
					e.printStackTrace();
					continue;
				}

				System.out.println("Login Success");
				System.out.println("Password : " + ftp.getPassword());

				loop : while(true) {
					System.out.println("1. Upload File \n2. Download File \n3. Disconnect FTP Server \n4. Delete File");
					System.out.print(">>> ");
					input = Integer.parseInt(sc.nextLine());
					switch (input) {
					case 1:
						try {
							System.out.print("���ε��� ������ ��ġ�� �̸��� �Է� >>> ");
							String upload = sc.nextLine();
							ftp.upload(new File(upload));
							ftp.upload(new File("D:\\������ �������� 8��\\workspace\\Day_10_FTPClient\\test.jpg"));
							ftp.upload(new File("D:\\������ �������� 8��\\workspace\\Day_10_FTPClient\\test.txt"));
						}catch(Exception e) {
							System.out.println("���ε� ���� �߻�");
							e.printStackTrace();
						}
						break;
					case 2:
						try {
							FTPFile[] list = ftp.list();
							for (int i = 0; i < list.length; i++) {
								System.out.println(list[i].getName() + " " + list[i].getSize() + "bytes");
								System.out.println(list[i]);
							}
						} catch(Exception e) {
							System.out.println("����Ʈ �鿩���� ����");
							e.printStackTrace();
						}
						System.out.print("�ٿ�ε� ���� �̸��� �Է� >>>");
						String download = sc.nextLine();
						System.out.print("�ٿ�ε� ���� ���� �̸��� �Է� >>>");
						String dName = sc1.nextLine();
						System.out.println("�ٿ�ε� �Ϸ�");
						try {
							ftp.download(download, new File(dName));
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					case 3:
						try {
							ftp.disconnect(true);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break loop;
					case 4:
						try {
							FTPFile[] list = ftp.list();
							for (int i = 0; i < list.length; i++)
								System.out.println(list[i].getName());
						}catch(Exception e) {
							e.printStackTrace();
						}
						try {
							String dFile = sc.nextLine();
							ftp.deleteFile(dFile);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					}
				}
			} else if(input == 2) {
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			} 
		}
	}
}
