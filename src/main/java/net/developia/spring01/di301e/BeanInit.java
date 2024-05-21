package net.developia.spring01.di301e;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Component로 하니까 안됨....
@Configuration
@PropertySource("net/developia/spring01/di301e/system.properties")
// 여기에 있는 프로퍼티 소스를 아래 빈들이 따라감.
public class BeanInit {
	
	@Bean
	FileOutputter fileOutputter() {
		return new FileOutputterImpl();
	}
	
	@Bean
	Outputter outputter() {
		OutputterImpl outputter = new OutputterImpl();
		outputter.setFileOutputter(fileOutputter());
		return outputter;
	}
	
}
