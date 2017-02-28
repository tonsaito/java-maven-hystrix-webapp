package br.com.tonsaito.hystrix.log;

import org.apache.log4j.Logger;

public class Log {
	final static Logger logger = Logger.getLogger(Log.class);
	
	private Log(){
		
	}
	
	public static void info(final String message){
		logger.info(message);
		
	}

}
