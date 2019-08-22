package player;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;
public class PlayM {

	Player player;
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

	public void jukeBox(int input) {
		System.out.println("playing");
		try{
			if (input == 1) {
				FileInputStream fis = new FileInputStream("oasis-live-forever.mp3");
				BufferedInputStream bis = new BufferedInputStream(fis);
				Player play = new Player(bis);
				play.play();
			} else if (input == 2) {
				FileInputStream fis = new FileInputStream("sample2.mp3");
				BufferedInputStream bis = new BufferedInputStream(fis);
				Player play = new Player(bis);
				play.play();
			} else if (input == 3) {
				FileInputStream fis = new FileInputStream("sample3.mp3");
				BufferedInputStream bis = new BufferedInputStream(fis);
				Player play = new Player(bis);
				play.play();
			}
		}
		catch(Exception exc){
			exc.printStackTrace();
			System.out.println("Failed to play the file.");
		}
	}
}
