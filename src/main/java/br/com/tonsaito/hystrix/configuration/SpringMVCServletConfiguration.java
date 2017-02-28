package br.com.tonsaito.hystrix.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.tonsaito.hystrix.log.Log;

@Configuration
public class SpringMVCServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Log.info("getRootConfigClasses complete!");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Log.info("getServletConfigClasses complete!");
		return new Class[] { WebAppConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		Log.info("getServletMappings complete!");
		return new String[]{"/"};
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		Log.info("onStartup complete!");
		super.onStartup(servletContext);
	}
	
}
