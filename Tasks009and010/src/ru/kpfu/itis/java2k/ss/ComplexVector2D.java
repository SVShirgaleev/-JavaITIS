package ru.kpfu.itis.java2k.ss;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by salavatshirgaleev on 30.03.16.
 */
public class ComplexVector2D {
    public ComplexNumber getX() {
        return x;
    }

    public void setX(ComplexNumber x) {
        this.x = x;
    }
    @Autowired
    private ComplexNumber x;

    public ComplexNumber getY() {
        return y;
    }

    public void setY(ComplexNumber y) {
        this.y = y;
    }
    @Autowired
    private ComplexNumber y;

    public ComplexVector2D(ComplexNumber x, ComplexNumber y) {
        this.x = x;
        this.y = y;
    }

    public ComplexVector2D() {
        this(new ComplexNumber(), new ComplexNumber());
    }

    public ComplexVector2D add(ComplexVector2D n) {
        ComplexVector2D n1 = new ComplexVector2D();
        n1.x = this.x.add(n.x);
        n1.y = this.y.add(n.y);
        return n1;
    }

    public String toString() {
        return "{" + x + "," + y + "}";
    }


    public ComplexNumber scalarProduct(ComplexVector2D n) {
        return this.x.multi(n.x).add(this.y.multi(n.y));
    }

    public boolean equals(ComplexVector2D n) {
        return (this.x.equals(n.x)) && (this.y.equals(n.y));
    }

}
