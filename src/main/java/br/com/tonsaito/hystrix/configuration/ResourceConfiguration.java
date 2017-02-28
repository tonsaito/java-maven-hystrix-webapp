package br.com.tonsaito.hystrix.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.tonsaito.hystrix.api.TestApi;

@Configuration
public class ResourceConfiguration extends ResourceConfig{
	
	
	public ResourceConfiguration(){
		register(TestApi.class);
		packages("br.com.tonsaito.mew.api");
	}
	
}
