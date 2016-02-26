import org.junit.Assert;
import org.junit.Test;

/**
 * Created by salavatshirgaleev on 26.02.16.
 */
public class ContactsTest {
    @Test
    public void nameShouldReturn(){
        Contacts cs = new Contacts();
        Assert.assertEquals("Имя контакта Володя",cs.name("Володя"));
    }

    @Test

    public void dateShouldReturnDate(){
        Contacts cs = new Contacts();
        Assert.assertEquals("Стоит ему позвонить ему 28 числа",cs.date("28"));
    }

    @Test

    public void timeShouldReturnTime(){
        Contacts cs = new Contacts();
        Assert.assertEquals("Учтите время, контакт будет свободен в 16:31",cs.time("16:31"));
    }

    @Test
    public void genderShouldBeTrue(){
        Contacts cs = new Contacts();
        Assert.assertEquals("Гендерная пренадлежность:мужская",cs.gender("мужская"));
    }

    @Test
    public void phoneNumberShouldReturnMessage(){
        Contacts cs = new Contacts();
        Assert.assertEquals("Номер телефона 88005553535",cs.phoneNumber("88005553535"));
    }


}
