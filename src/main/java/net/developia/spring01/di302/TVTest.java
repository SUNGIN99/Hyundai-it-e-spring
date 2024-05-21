package net.developia.spring01.di302;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanInit.class);
		// 외부 xml에 있는 스프링 빈을 읽어서 컨텍스트를 생성함.
		
		TV tv1 = (TV) context.getBean("tv");
		
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.soundUp();
		tv1.soundUp();
		tv1.powerOff();

	}

}
