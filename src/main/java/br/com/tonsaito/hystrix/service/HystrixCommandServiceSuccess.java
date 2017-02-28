package br.com.tonsaito.hystrix.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class HystrixCommandServiceSuccess extends HystrixCommand<String> {

	private final String name;

	public HystrixCommandServiceSuccess(String name) {
	        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
	        this.name = name;
	    }

	@Override
	protected String run() {
		return "Hello " + name + "!";
	}

}
