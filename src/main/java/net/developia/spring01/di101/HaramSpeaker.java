package net.developia.spring01.di101;

public class HaramSpeaker implements Speaker {
	
	
	@Override
	public void soundUp() {
		System.out.println("Haram 스피커 소리를 키웁니다.");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Haram 스피커 소리를 키웁니다.");
		
	}
	

}


