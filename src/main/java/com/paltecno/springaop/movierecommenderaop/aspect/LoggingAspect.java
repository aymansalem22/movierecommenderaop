package com.paltecno.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
@Configuration
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "execution(* com.paltecno.springaop.movierecommenderaop.business.*.*(..))", returning = "result")
	public void LogAfterExecution(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with: {}", joinPoint, result);
	}

	@AfterThrowing(value = "execution(* com.paltecno.springaop.movierecommenderaop.business.*.*(..))", throwing = "exception")
	public void logAfterException(JoinPoint joinPoint, Object exception) {
		logger.info("Exception in {} returned with: {}", joinPoint, exception);
	}

	@After(value = "execution(* com.paltecno.springaop.movierecommenderaop.business.*.*(..))")
	public void LogAfterMethod(JoinPoint joinPoint) {
		logger.info("After {}", joinPoint);
	}
}
