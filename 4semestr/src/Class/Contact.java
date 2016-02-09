package Class;

/**
 * Created by salavatshirgaleev on 08/02/16.
 */
class Contact implements Call {

    @Override
    public void callTime(int p) {
        System.out.println("Контакт звонил в "+p+"часов");
    }

    @Override
    public void callName(String name) {
        System.out.println("Вам звонил "+name);
    }

    @Override
    public void duration(int t) {
        System.out.println("Контакт звонил " +t+ " раз!");
    }
}
