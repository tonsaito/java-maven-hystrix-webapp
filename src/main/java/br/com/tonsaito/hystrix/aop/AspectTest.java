package br.com.tonsaito.hystrix.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class AspectTest {

	@Before("execution(* br.com.tonsaito.hystrix.util.GeneralUtil.test())")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("************************************************");
		System.out.println("Running Aspect successfully!");
		System.out.println("************************************************");
	}

}
