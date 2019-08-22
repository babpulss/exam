import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Files_copy {
	public static void main (String[] args) {
//		File f = new File("d://test//12.jpg");
//		File f1 = new File("d://test//");
//
//		System.out.println(f.exists());
//		System.out.println(f.getAbsoluteFile());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getParent() + f.renameTo(f1));
//		System.out.println(f1.isDirectory());
//		System.out.println(f.isFile());
//		System.out.println(f.length());
//		File[] f2 = f.listFiles();
//
//		File file = new File("D://test//1.jpg");
//		Path copied = Paths.get("D://test//test//1.jpg");
//		Path originalPath = file.toPath();
//		try {
//			Files.copy(originalPath, copied, StandardCopyOption.COPY_ATTRIBUTES);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		Path copy = Paths.get(new File("D://test//PathTest.jpg").getPath());
//		Path jpgObject = new File("D://test//1.jpg").toPath();
//		try {
//			Files.copy(jpgObject, copy);
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
//
//		File ApachCopy = new File("D://test//1.jpg");
//		try {
//			FileUtils.copyFile(ApachCopy, new File("D://test//test//testtt.jpg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
		InputStream is = new BufferedInputStream(new FileInputStream("D://test//1.jpg"));
		OutputStream os = new BufferedOutputStream(new FileOutputStream("D://test//test//test.jpg"));
		byte[] buf = new byte[1024];
		int length;
		while ((length = is.read(buf)) > 0)
			os.write(buf);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
