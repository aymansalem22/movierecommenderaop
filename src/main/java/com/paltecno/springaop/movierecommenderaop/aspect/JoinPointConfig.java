package com.paltecno.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

	@Pointcut("execution(* com.paltecno.springaop.movierecommenderaop.data.*.*(..))")
	public void dataLayerPointcut() {
	}

	@Pointcut("execution(* com.paltecno.springaop.movierecommenderaop.data.*.*(..))")
	public void businessLayerPointcut() {
	}

	@Pointcut("com.paltecno.springaop.movierecommenderaop.aspect.JoinPointConfig.dataLayerPointcut() ||"
			+ " com.paltecno.springaop.movierecommenderaop.aspect.JoinPointConfig.businessLayerPointcut()")
	public void allLayerPointcut() {
	}

	@Pointcut("bean(movie*)")
	public void movieBeanPointcut() {
	}

}
