package Conn;


import Entity.UserEntity;

import java.nio.charset.Charset;

import java.util.Base64;
/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public class ServerAuthentication {
    private static String Password;
    public static UserEntity currentUser;
    private ServerConn server = new ServerConn();

    static String getLoginPass() {
        return Password;
    }

    public boolean tryAuth(String login, String pass) {
        save(login, pass);
        UserEntity user = new UserEntity();
        try {
            user = server.getUser();
            if (user != null) currentUser = user;
            return true;
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return user != null;
    }


    private void save(String login, String pass) {
        byte[] bytes = (login + ":" + pass).getBytes(Charset.forName("UTF-8"));
        Password = "Basic " + Base64.getEncoder().encodeToString(bytes);

    }




}
