package _01_notOcp;

class SoundPlayer {
	void playWav() {
		System.out.println("play wav");
	}
	void playMp3() {
		System.out.println("play mp3");
	}
	void playFlac() {
		System.out.println("play flac");
	}
}

public class NotOcp {
	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		sp.playWav();
		sp.playMp3();
		sp.playFlac();
	}
}
