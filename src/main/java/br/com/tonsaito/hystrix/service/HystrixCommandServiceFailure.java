package br.com.tonsaito.hystrix.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import br.com.tonsaito.hystrix.log.Log;

public class HystrixCommandServiceFailure extends HystrixCommand<String> {

    private final String name;

    public HystrixCommandServiceFailure(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }

    @Override
    protected String run() {
    	Log.info("Calling Run Hystrix Method that fails!");
    	Log.info("Calling Run Hystrix Method that fails!");
    	Log.info("Calling Run Hystrix Method that fails!");
        throw new RuntimeException("this command always fails");
    }

    @Override
    protected String getFallback() {
    	Log.info("Calling Fallback Method!");
    	Log.info("Calling Fallback Method!");
    	Log.info("Calling Fallback Method!");
        return "Hello Failure " + name + "!";
    }
}