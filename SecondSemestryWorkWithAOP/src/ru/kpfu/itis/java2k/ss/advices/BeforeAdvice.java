package ru.kpfu.itis.java2k.ss.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by salavatshirgaleev on 01.04.16.
 */
@Aspect
public class BeforeAdvice implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object o;
        System.out.println("We are trying to connect...");
        o = methodInvocation.proceed();
        System.out.println("Connection is successful....");
        return o;
    }
}
