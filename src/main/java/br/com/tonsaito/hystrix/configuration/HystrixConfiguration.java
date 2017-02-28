package br.com.tonsaito.hystrix.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;

import br.com.tonsaito.hystrix.log.Log;

@Configuration
public class HystrixConfiguration {

	@Bean
	public HystrixCommandAspect hystrixAspect() {
		Log.info("initializing Hystrix Command Aspects");
		return new HystrixCommandAspect();
	}

}
