package ru.kpfu.itis.java2k.ss;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */
@Configuration
@ComponentScan(basePackages = {"ru.kpfu.itis.java2k.ss"})
public class JavaConfig {



    @Bean
    public Print print() {
        Print print = new Print();
        return print;
    }

    @Bean
    public Foursquare foursquare(){
        Foursquare foursquare = new Foursquare();
        return foursquare;
    }



}
