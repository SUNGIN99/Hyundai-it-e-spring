package net.developia.spring01.di302e;

import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Value;

//@PropertySource("net/developia/spring01/di301e/system.properties")
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
