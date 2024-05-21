package net.developia.spring01.di102;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVTest {

	public static void main(String[] args) {
		//net/developia/spring01/di102/beaninit.xml  대신 아래처럼 쓸수 있음: 현재 내 클래스가 있는곳의 beaninit.xml을 읽어들임.
		ApplicationContext context = new GenericXmlApplicationContext(TVTest.class, "beaninit.xml");
		// 외부 xml에 있는 스프링 빈을 읽어서 컨텍스트를 생성함.
		
		TV tv1 = (TV) context.getBean("tv");
		
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.soundUp();
		tv1.soundUp();
		tv1.powerOff();

		
		TV tv2 = (TV) context.getBean("tv");

		tv2.powerOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.soundUp();
		tv2.soundUp();
		tv2.powerOff();
		
		System.out.println(tv1.hashCode() + ", " + tv2.hashCode());
		
		// scope에 다라 다름 prototype => 사용할때마다 생성함.

	}

}
