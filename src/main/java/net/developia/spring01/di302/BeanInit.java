package net.developia.spring01.di302;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanInit {
	
	@Bean
	public TV tv() {
		//메서드 이름이 요청하는 아이디가 됨
		return new SamsungTV(speaker());
	}
	
	@Bean
	public Speaker speaker() {
		return new OrangeSpeaker();
	}
}
