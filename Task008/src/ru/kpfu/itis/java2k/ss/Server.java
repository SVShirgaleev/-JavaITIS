package ru.kpfu.itis.java2k.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by salavatshirgaleev on 28.12.15.
 */
@Component
public class Server {
    static ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
    static Socket s = (Socket) ac.getBean("s");
    static ServerSocket ss = (ServerSocket) ac.getBean("ss");

    public static void main(String[] args) throws IOException {

        System.out.println("Starting server");
        s = ss.accept();
        System.out.println("Connected!");

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream()));

        Dots dots = new Dots(pw, 0, "Server");

        while (true) {
            String message = is.readLine();
            dots.updateData(message, 2);
        }


    }

}
