package net.developia.spring01.di301;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanInit {
	
	@Bean
	public TV tv() {
		//메서드 이름이 요청하는 아이디가 됨
		return new SamsungTV();
	}
	/*
	 * <bean id="tv" class="net.developia.sprint01.di101.samsungTV">
	 * 	  <property name="speaker" ref="speaker"/>
	 * </bean>
	 *  과 같은 역할
	 */
	
	@Bean
	public Speaker speaker() {
		return new HaramSpeaker();
	}
}
