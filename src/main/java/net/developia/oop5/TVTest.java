package net.developia.oop5;

import java.io.FileInputStream;
import java.util.Properties;

public class TVTest {

	public static void main(String[] args) throws Exception{
		Properties props = new Properties();
		props.load(new FileInputStream("product.properties"));
		
		String className = props.getProperty("tv");
		String speakerName = props.getProperty("speaker");
		Class tvClass = Class.forName(className); // 존재하면 메모리에 로드 됨. 없으면 예외가 발생하면서 빠져나옴.
		Class speakerClass = Class.forName(speakerName);
		
		Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();
		// TV 클래스가 있어야 해당 클래스를 실행할 수 있음.
		// Constructor가 있어서 의존적이게 된다. 
		TV tv = (TV) tvClass.getConstructor().newInstance();
		tv.setSpeaker(speaker);
		// TV tv = new AppleTV();
		
		
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.powerOff();
		
		
		TV appTv = new AppleTV();
		// 애플티비에서마샬스피커 출력하기
		
	}

}
