package br.com.tonsaito.hystrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tonsaito.hystrix.util.GeneralUtil;

@Controller
public class TestController {

	@RequestMapping({"/test", "hi"})
	public String test(Model model){
		model.addAttribute("message", "Maven + Spring Example Webapp Up and Running");
		return "test/index";
	}
	
	@RequestMapping("aspect")
	public String aspect(Model model){
		GeneralUtil.test();
		model.addAttribute("message", "Testing Aspect, view the Server Log.");
		return "test/index";
	}
	
	
}
