package ru.kpfu.itis.java2.ss.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by salavatshirgaleev on 01.04.16.
 */
@Aspect
public aspect Task013 {
    @Around("execution(* *..*.setEmail(String))")
    public java.lang.Object checkEmail(ProceedingJoinPoint joinPoint) throws Throwable {
        String s = (String) joinPoint.getArgs()[0];
        Pattern p = Pattern.compile("/.+@.+\\..+/i");
        Matcher m = p.matcher(s);
        if(m.find()){
            System.out.println("Good!");
            return null;
        }
        return joinPoint.proceed();
    }
}
