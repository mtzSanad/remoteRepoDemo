package com.ezdk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping({"/","/home"})
public class MainController {
	//Testing History changes
	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		System.out.println(2);
		return "index";
	}
}
