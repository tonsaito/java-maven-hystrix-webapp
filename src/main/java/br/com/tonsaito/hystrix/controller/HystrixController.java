package br.com.tonsaito.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tonsaito.hystrix.service.HystrixCommandServiceFailure;
import br.com.tonsaito.hystrix.service.HystrixService;

@Controller
@RequestMapping("/hystrix")
public class HystrixController {
	
	@Autowired
	HystrixService hystrixService;

	@RequestMapping("/success")
	public String success(Model model){
		model.addAttribute("message" , hystrixService.hystrixSuccess());
		return "hystrix/result";
	}
	
	@RequestMapping("/fail")
	public String fail(Model model){
		model.addAttribute("message" , hystrixService.hystrixFailed());
		return "hystrix/result";
	}
	
	@RequestMapping("/command/fail")
	public String commandFail(Model model){
		model.addAttribute("message" , new HystrixCommandServiceFailure("Test").execute());
		return "hystrix/result";
	}
	
}
