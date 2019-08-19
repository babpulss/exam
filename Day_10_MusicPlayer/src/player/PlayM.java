package player;
import java.io.FileInputStream;
import javazoom.jl.player.*;
public class PlayM {

	public void playMusic() {
		System.out.println("playing");
		try{
			FileInputStream fis = new FileInputStream("sample.mp3");
			Player playMP3 = new Player(fis);
			playMP3.play();
		}
		catch(Exception exc){
			exc.printStackTrace();
			System.out.println("Failed to play the file.");
		}
	}

	public void jukeBox(String str) {
		System.out.println("playing");
		try{
			FileInputStream fis = new FileInputStream(str);
			Player playMP3 = new Player(fis);
			playMP3.play();
		}
		catch(Exception exc){
			exc.printStackTrace();
			System.out.println("Failed to play the file.");
		}
	}
}
