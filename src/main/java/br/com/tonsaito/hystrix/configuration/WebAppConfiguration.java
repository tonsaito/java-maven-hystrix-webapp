package br.com.tonsaito.hystrix.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.tonsaito.hystrix.aop.AspectTest;
import br.com.tonsaito.hystrix.log.Log;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="br.com.tonsaito")
public class WebAppConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		Log.info("Static Configurer complete!");
	}

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		Log.info("Resource View Resolver Complete!");
		return resolver;
	}

	@Bean
	public AspectTest aspectTest(){
		Log.info("AspectTest Bean Complete!");
		return new AspectTest();
	}
}
