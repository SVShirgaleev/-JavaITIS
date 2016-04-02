package ru.kpfu.itis.java2k.ss;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */
public class Contacts implements Client, callUp {

    public Contacts() {
    }

    public String name(String name) {

        return ("Имя контакта:" + name);
    }


    public String date(String date) {
        return ("Стоить позвонить ему " + date + " числа");
    }


    public String time(String time) {
        return ("Учтите время, контакт будет свободен в " + time);
    }


    public String gender(String gender) {
        return ("Гендерная пренадлежность:" + gender);
    }


    public String phoneNumber(String phoneNumber) {
        return ("Номер телефона" + phoneNumber);
    }

    @Override
    public String callTime(int p) {
        return null;
    }

    @Override
    public String callName(String name) {
        return null;
    }

    @Override
    public String duration(int t) {
        return null;
    }
}