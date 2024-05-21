package net.developia.xcispring01.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	// @Autowired : JVM에서 실행될때 만들어줌.
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
