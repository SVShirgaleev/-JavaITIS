package Class;

/**
 * Created by salavatshirgaleev on 08/02/16.
 */
class Contacts implements Client, callUp {

    @Override
    public void name(String name) {
        System.out.println("Имя котнтакта:"+name);
    }

    @Override
    public void date(String date) {
        System.out.println("Стоить позвонить ему " +date+" числа");
    }

    @Override
    public void time(String time) {
        System.out.println("Учтите время, контакт будет свободен в "+time);
    }

    @Override
    public void gender(String gender) {
        System.out.println("Гендерная пренадлежность:"+gender);
    }

    @Override
    public void phoneNumber(int phoneNumber) {
        System.out.println("Номер телефона"+phoneNumber);
    }
}
