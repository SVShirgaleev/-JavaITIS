package ru.kpfu.itis.java2k.ss;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by salavatshirgaleev on 30.03.16.
 */
public class ComplexMatrix2x2Test {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    static double EPS = 1e-9;


    @Test
    public void additionShouldBeZero() {
        ComplexMatrix2x2 s = ac.getBean(ComplexMatrix2x2.class);
        ComplexMatrix2x2 f =new  ComplexMatrix2x2();
        Assert.assertEquals(f,f.add(s));
    }


    @Test
    public void multShouldEqualZero(){
        ComplexMatrix2x2 s = ac.getBean(ComplexMatrix2x2.class);
        Assert.assertEquals(s,s.mult(s));
    }


    @Test
    public void detShouldEqualZero(){
        ComplexMatrix2x2 s = ac.getBean(ComplexMatrix2x2.class);
        ComplexNumber cn = ac.getBean(ComplexNumber.class);
        Assert.assertEquals(cn,s.det());
    }


    @Test
    public void multVectorShouldEqualOriginalVector(){
        ComplexVector2D cv = ac.getBean(ComplexVector2D.class);
        ComplexMatrix2x2 cm = ac.getBean(ComplexMatrix2x2.class);
        Assert.assertEquals(cv,cm.multVector(cv));
    }




}
