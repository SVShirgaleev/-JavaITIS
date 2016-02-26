import org.junit.Assert;
import org.junit.Test;

/**
 * Created by salavatshirgaleev on 26.02.16.
 */
public class ContactTest {
    @Test
    public void callTimeShouldReturn5Hours() {
        int five = 5;
        Contact c = new Contact();
        String g =  c.callTime(five);
        Assert.assertEquals("Контакт звонил в 5 часов",g);
    }

    @Test
    public void callNameShouldReturnName(){
        String name = "Linus";
        Contact c = new Contact();
        Assert.assertEquals("Вам звонил Linus",c.callName(name));
    }

    @Test
    public void durationShouldReturnNumber(){
        int n = 14;
        Contact c = new Contact();
        Assert.assertEquals("Контакт звонил 14 раз!", c.duration(n));
    }
}
