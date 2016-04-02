package Class;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by salavatshirgaleev on 31.03.16.
 */
@Configuration
public class JavaConfig {


    @Bean
    public Contact contact(){
        Contact contact = new Contact();
        return contact;
    }


    @Bean
    public Contacts contacts(){
        Contacts contacts = new Contacts();
        return contacts;
    }


    @Bean
    public Rectangle rectangle(){
        Rectangle rectangle = new Rectangle();
        return rectangle();
    }
}
