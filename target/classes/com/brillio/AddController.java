package com.brillio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponset;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/v1/")
public class AddController {
	
	@GetMapping("get")
	public String method() {
		return "DevOps Training"
	}
	
}
