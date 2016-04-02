package Class;

import Intefaces.Call;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "Class")
public class Contact implements Call {
    @Value("3")
    public int time;
    @Value("0")
    public int n;
    @Value("Ella")
    public String name;

    public Contact(int time, int n, String name) {
        this.time = time;
        this.n = n;
        this.name = name;
    }

    public Contact() {

    }

    @Override
    public String callTime() {
        return "Контакт звонил в " + this.time + "часов";

    }

    @Override
    public String callName() {
        return "Вам звонил " + this.name;
    }

    @Override
    public String duration() {
        return "Контакт звонил " + this.n + " раз!";
    }
}
