package net.developia.spring01.di202e;

import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@PropertySource("net/developia/spring01/di202e/system.properties")
public class FileOutputterImpl implements FileOutputter{

	@Value("${fileName}")
	private String fileName;
	
	
	@Override
	public void output(String msg) throws Exception {
		FileWriter fw = new FileWriter(fileName);
		fw.write(msg);
		fw.flush();
		fw.close();
		
	}
	
}
