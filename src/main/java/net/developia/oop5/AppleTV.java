package net.developia.oop5;

public class AppleTV implements TV{



	private Speaker speaker = new MarshallSpeaker();
	
	public void powerOn() {
		System.out.println("Apple TV : TV를 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("Apple TV : TV를 끕니다.");
	}
	
	public void channelUp() {
		System.out.println("Apple TV : 채널을 올립니다.");
	}
	
	public void channeDown() {
		System.out.println("Apple TV : 채널을 내립니다.");
	}
	
	public void soundUp() {
		speaker.soundUp();
	}
	
	public void soundDown() {
		speaker.soundDown();
	}

	@Override
	public void setSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		
	}
	
}
