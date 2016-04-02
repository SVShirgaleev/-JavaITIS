package ru.kpfu.itis.java2k.ss;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by salavatshirgaleev on 28.12.15.
 */
@Component
public class Client {
    public static void main(String[] args) throws  IOException {
        final int PORT = 3458;
        Scanner sc = new Scanner(System.in);
        String HOST = sc.nextLine();
        Socket s = new Socket(HOST, PORT);

        PrintWriter os = new PrintWriter(s.getOutputStream(), true);
        BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream()));

        Dots dots = new Dots(os, 1, "Client");

        while (true) {
            String message = is.readLine();
            dots.updateData(message, 1);

        }
    }
}
