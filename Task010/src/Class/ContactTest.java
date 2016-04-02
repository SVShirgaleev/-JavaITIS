package Class;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by salavatshirgaleev on 31.03.16.
 */
public class ContactTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);


    @Test
    public void callTimeEqual3(){
        Contact contact = ac.getBean(Contact.class);
        Assert.assertEquals("Контакт звонил в 3 часов",contact.callTime());
    }

    @Test
    public void callNameIsElla(){
        Contact contact=ac.getBean(Contact.class);
        Assert.assertEquals("Вам звонил Ella",contact.callName());
    }

    @Test
    public void durationIs3(){
        Contact contact=ac.getBean(Contact.class);
        Assert.assertEquals( "Контакт звонил 3 раз!",contact.duration());
    }
}
