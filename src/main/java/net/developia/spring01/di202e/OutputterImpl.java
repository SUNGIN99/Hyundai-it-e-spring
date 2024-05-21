package net.developia.spring01.di202e;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@PropertySource("net/developia/spring01/di202e/system.properties")
public class OutputterImpl implements Outputter{
	
	@Value("${name}")
	private String name;
	@Value("${greeting}")
	private String greeting;
	
	@NonNull
	private FileOutputter fileOutputter;

	@Override
	public void greeting() {
		System.out.println(name + "님, " + greeting);
		try {
			if(fileOutputter != null)
				fileOutputter.output(name + "님, " + greeting);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
