package net.developia.spring01.di301;

import org.springframework.beans.factory.annotation.Autowired;

public class SamsungTV implements TV{
	
	@Autowired
	private Speaker speaker;
	// Beaninit.class d에서 사용 후 편하ㅔ 게사용
	
	
	public SamsungTV() {
		System.out.println("생성자 호출");
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
		if(speaker == null) {
			System.out.println("Samsung TV: 소리를 키웁니다.");
		}else {
			speaker.soundUp();
		}
	}
	
	public void soundDown() {
		if(speaker == null) {
			System.out.println("Samsung TV: 소리를 내립니다.");
		}else {
			speaker.soundDown();
		}
	}
}
