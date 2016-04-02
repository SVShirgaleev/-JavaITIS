package ru.kpfu.itis.java2k.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        //Rectangle r = ac.getBean(Rectangle.class);
        Foursquare fs = ac.getBean(Foursquare.class);
        Print print =ac.getBean(Print.class);
        print.showSquare();

    }
}
