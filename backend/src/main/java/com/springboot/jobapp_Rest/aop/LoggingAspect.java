package com.springboot.jobapp_Rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return-type class-name.method-name(arguments)
    @Before("execution(* com.springboot.jobapp_Rest.service.JobService.getAllJobs(..)) || execution(* com.springboot.jobapp_Rest.service.JobService.getJob(..))" )
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    @After("execution(* com.springboot.jobapp_Rest.service.JobService.addJob(..)) || execution(* com.springboot.jobapp_Rest.service.JobService.updateJob(..))" )
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.springboot.jobapp_Rest.service.JobService.deleteJob(..)) || execution(* com.springboot.jobapp_Rest.service.JobService.updateJob(..))" )
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method Crashed " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.springboot.jobapp_Rest.service.JobService.*(..))" )
    public void logMethodSuccess(JoinPoint jp){
        LOGGER.info("Method Executed Successfully " + jp.getSignature().getName());
    }




}
