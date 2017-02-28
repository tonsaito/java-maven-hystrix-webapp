package br.com.tonsaito.hystrix.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixService {

	@HystrixCommand(commandKey="hystrixSuccess", fallbackMethod="fallbackMethod")
	public String hystrixSuccess(){
		System.out.println("Calling Hystrix Success Method!");
		System.out.println("Calling Hystrix Success Method!");
		System.out.println("Calling Hystrix Success Method!");
		return "Hystrix Success!!!";
	}
	
	@HystrixCommand(commandKey="hystrixFailed", fallbackMethod="fallbackMethod")
	public String hystrixFailed() throws RuntimeException{
		System.out.println("Calling Hystrix Failed Method!");
		System.out.println("Calling Hystrix Failed Method!");
		System.out.println("Calling Hystrix Failed Method!");
		throw new RuntimeException("Hystrix Exception!!!");
	}
	
	@HystrixCommand
	public String fallbackMethod(){
		System.out.println("Calling Callback!!!!!!!");
		System.out.println("Calling Callback!!!!!!!");
		System.out.println("Calling Callback!!!!!!!");
		return "Calling fallback Method!";
	}
	
}
