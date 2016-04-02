package ru.kpfu.itis.java2k.ss;

import org.springframework.aop.framework.ProxyFactory;
import ru.kpfu.itis.java2k.ss.advices.AroundAdvice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by salavatshirgaleev on 28.12.15.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        final int PORT = 3450;
        ServerSocket ss = new ServerSocket(PORT);
        System.out.println("Starting server");
        Socket s = ss.accept();

        System.out.println("Connected!");

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream()));

        Dots dots = new Dots(pw, 0, "Server");
        ProxyFactory pf = new ProxyFactory(dots);
        pf.addAdvice(new AroundAdvice());

        while (true) {
            String message = is.readLine();
            dots.updateData(message, 2);
        }
    }
}
