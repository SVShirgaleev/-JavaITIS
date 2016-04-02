package Class;

import Intefaces.callUp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by salavatshirgaleev on 08/02/16.
 */
@Component
public class Contacts implements  callUp {
    @Value("Ella")
    public String name;
    @Value("1/21/2016")
    public String date;
    @Value("12:12PM")
    public String time;
    @Value("Female")
    public String gender;
    @Value("88005553535")
    public String phoneNumber;
    public Contacts() {
    }

    public Contacts(String name, String date, String time, String gender, String phoneNumber) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }



    @Override
    public String Date() {
        return "Стоить позвонить ему " +date+" числа";
    }

    @Override
    public String Time() {
        return "Учтите время, контакт будет свободен в "+time;
    }

    @Override
    public String Name() {
        return "Имя контакта: "+name;
    }

}
