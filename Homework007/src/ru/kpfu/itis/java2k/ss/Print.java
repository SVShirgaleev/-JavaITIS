package ru.kpfu.itis.java2k.ss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */
@Component
public class Print {

    @Autowired
    private Figure figure;


    public void Print(Figure figure) {
        this.figure = figure;
    }


    public void showSquare() {
        System.out.println("Square of " + figure.name() + " is " + figure.getSquare());
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
