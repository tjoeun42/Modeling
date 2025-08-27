package _02_ocp;

public class SoundPlayer {
	private PlayInterface playIner;
	
	public void setPlayInter(PlayInterface playInter) {
		this.playIner = playInter;
	}
	
	public void play() {
		playIner.play();
	}
}
