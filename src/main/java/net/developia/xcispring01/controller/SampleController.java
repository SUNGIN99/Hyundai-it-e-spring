package net.developia.xcispring01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;
import net.developia.scispring01.domain.SampleDTO;

@Controller
@RequestMapping("/sample/*")
@Log
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic....");
		
	}
	
	@GetMapping("/ex01")
	// queryParameter로 넘어오면 DTO에 값을 넣어줌(Spring이)
	public String ex01(SampleDTO dto) {
		log.info(""+dto);
		return "ex01";
	}
}
