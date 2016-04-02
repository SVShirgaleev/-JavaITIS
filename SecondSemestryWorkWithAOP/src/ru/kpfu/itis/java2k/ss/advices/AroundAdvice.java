package ru.kpfu.itis.java2k.ss.advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by salavatshirgaleev on 01.04.16.
 */

public class AroundAdvice  implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("You're connected!!");
    }
}
