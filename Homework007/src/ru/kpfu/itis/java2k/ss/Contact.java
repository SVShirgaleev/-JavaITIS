package ru.kpfu.itis.java2k.ss;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */
public class Contact implements Call {
    Contact() {

    }

    public String callTime(int p) {
        return ("Контакт звонил в " + p + " часов");
    }


    public String callName(String name) {
        return ("Вам звонил " + name);
    }


    public String duration(int t) {
        return ("Контакт звонил " + t + " раз!");
    }
}
