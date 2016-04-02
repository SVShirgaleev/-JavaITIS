package ru.kpfu.itis.java2k.ss;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */

public class Rectangle implements Figure {

    @Value("2")
    public int weight;
    @Value("3")
    public int height;


    public Rectangle() {

    }

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getSquare() {
        return height * weight;
    }


    public String name() {
        return "Rectangle";
    }

    public int isLargerThan(Figure c) {
        Figure other = (Figure) c;
        if (this.getSquare() > other.getSquare()) {
            return 1;
        } else {
            if (this.getSquare() == other.getSquare()) {
                return 0;
            } else return -1;
        }

    }


    public double differenceAdd(Figure c) {
        Figure other = (Figure) c;
        return Math.abs(this.getSquare() - other.getSquare());
    }


    public int differenceMult(Figure c) {
        Rectangle other = (Rectangle) c;
        return Math.abs(this.getSquare() / other.getSquare());
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}

