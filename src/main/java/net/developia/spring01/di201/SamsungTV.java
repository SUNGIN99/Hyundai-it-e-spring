package net.developia.spring01.di201;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "tv")
//@AllArgsConstructor
public class SamsungTV implements TV{
	
	// 빈주입 확인하기
	 @Autowired //@Inject
	 @Qualifier(value="orange")//(value="orangeSpeaker") // @Resource()
	private Speaker speaker;
	
	public SamsungTV() {
		// 생성자 한번만 호출됨
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
