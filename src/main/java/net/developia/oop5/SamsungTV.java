package net.developia.oop5;

public class SamsungTV implements TV{
	
	Speaker speaker;
	
	public void setSpeaker(Speaker s) {
		speaker= new HaramSpeaker();;
	}
	
	public void powerOn() {
		System.out.println("Samsung TV : TV를 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV : TV를 끕니다.");
	}
	
	public void channelUp() {
		System.out.println("Samsung TV : 채널을 올립니다.");
	}
	
	public void channeDown() {
		System.out.println("Samsung TV : 채널을 내립니다.");
	}
	
	public void soundUp() {
		System.out.println("Samsung TV : 소리를 키웁니다.");
	}
	
	public void soundDown() {
		System.out.println("Samsung TV : 소리를 내립니다.");
	}
}
