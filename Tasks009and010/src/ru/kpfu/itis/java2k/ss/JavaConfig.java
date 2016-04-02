package ru.kpfu.itis.java2k.ss;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by salavatshirgaleev on 30.03.16.
 */
@Configuration
@ComponentScan(basePackages = "")
public class JavaConfig {




    @Bean
    public ComplexNumber complexNumber(){
        ComplexNumber complexNumber = new ComplexNumber();
        return  complexNumber;
    }

    @Bean
    public ComplexVector2D complexVector2D(){
        ComplexVector2D complexVector2D = new ComplexVector2D();
        return complexVector2D;
    }


    @Bean
    public ComplexMatrix2x2 complexMatrix2x2() {
        ComplexMatrix2x2 complexMatrix2x2 = new ComplexMatrix2x2();
        return complexMatrix2x2;

    }
}

