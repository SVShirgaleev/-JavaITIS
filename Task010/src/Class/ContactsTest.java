package Class;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by salavatshirgaleev on 31.03.16.
 */
public class ContactsTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);


    @Bean
    public void dateShouldEqualOriginal(){
        Contacts contacts = ac.getBean(Contacts.class);
        Assert.assertEquals("Стоить позвонить ему 12 числа",contacts.Date());
    }


    @Bean
    public void timeShouldEqualOriginal(){
        Contacts contacts = ac.getBean(Contacts.class);
        Assert.assertEquals("Учтите время, контакт будет свободен в 12:35PM",contacts.Time());
    }



    @Bean
    public void nameOfContactIsElla(){
        Contacts contacts=ac.getBean(Contacts.class);
        Assert.assertEquals("Имя контакта: Ella",contacts.Name());
    }

}
