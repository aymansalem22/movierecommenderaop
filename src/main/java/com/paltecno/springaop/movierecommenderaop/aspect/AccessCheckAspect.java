package com.paltecno.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
@Configuration
public class AccessCheckAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("com.paltecno.springaop.movierecommenderaop.aspect.JoinPointConfig.movieBeanPointcut()")
	// @Before("execution(*
	// com.paltecno.springaop.movierecommenderaop..*.*Filtering(..)) ||
	// execution(String com.paltecno.springaop.movierecommenderaop..*.*(..))")
	// @Before("execution(String
	// com.paltecno.springaop.movierecommenderaop..*.*(String))")
	// @Before("execution(*
	// com.paltecno.springaop.movierecommenderaop..*.*Filtering(..))")
	// @Before("execution(String
	// com.paltecno.springaop.movierecommenderaop..*.*(..))")
	// @Before("execution(*
	// com.paltecno.springaop.movierecommenderaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Intercepted call before execution of: {}", joinPoint);
	}

	public void userAccess(JoinPoint joinPoint) {
		logger.info("Intercepted method call");
	}

}
