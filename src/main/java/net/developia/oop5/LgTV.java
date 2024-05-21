package net.developia.oop5;

public class LgTV implements TV{
	
	public void powerOn() {
		System.out.println("Lg TV : TV를 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("Lg TV : TV를 끕니다.");
	}
	
	public void channelUp() {
		System.out.println("Lg TV : 채널을 올립니다.");
	}
	
	public void channeDown() {
		System.out.println("Lg TV : 채널을 내립니다.");
	}
	
	public void soundUp() {
		System.out.println("Lg TV : 소리를 키웁니다.");
	}
	
	public void soundDown() {
		System.out.println("Lg TV : 소리를 내립니다.");
	}

	@Override
	public void setSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		
	}
}
