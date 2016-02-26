/**
 * Created by salavatshirgaleev on 25.02.16.
 */
public class ComplexNumber {
    private double a;
    private double b;

    public double getB() {
        return b;
    }

    public double getA() {

        return a;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber multiNumber(double i) {
        ComplexNumber t = new ComplexNumber();
        t.a = this.a * i;
        t.b = this.b * i;
        return t;
    }
    public void multiNumber2(int i) {
        this.a = this.a * i;
        this.b = this.b * i;
    }
    public ComplexNumber add(ComplexNumber k) {
        ComplexNumber t = new ComplexNumber();
        t.a = this.a + t.a;
        t.b = this.b + t.b;
        return t;
    }

    public void add2(ComplexNumber k) {
        this.a = this.a + k.a;
        this.b = this.b + k.b;
    }

    public ComplexNumber sub(ComplexNumber k) {
        ComplexNumber t = new ComplexNumber();
        t.a = this.a - t.a;
        t.b = this.b - t.b;
        return t;
    }

    public void sub2(ComplexNumber k) {
        this.a = this.a - k.a;
        this.b = this.b - k.b;
    }

    public ComplexNumber multi(ComplexNumber k) {
        ComplexNumber t = new ComplexNumber();
        t.a = this.a * k.a - this.b * k.b;
        t.b = this.b * k.a + this.a * k.b;
        return t;
    }

    public void multi2(ComplexNumber k) {
        this.a = this.a * k.a - this.b * k.b;
        this.b = this.b * k.a + this.a * k.b;
    }

    public ComplexNumber div(ComplexNumber k) {
        ComplexNumber t = new ComplexNumber();
        t.a = (this.a * k.a + this.b * this.b) / (k.a * k.a + k.b * k.b);
        t.b = (this.b * k.a - this.a * k.b) / (k.a * k.a + k.b * k.b);
        return t;
    }

    public void div2(ComplexNumber k) {
        this.a = (this.a * k.a + this.b * this.b) / (k.a * k.a + k.b * k.b);
        this.b = (this.b * k.a - this.a * k.b) / (k.a * k.a + k.b * k.b);
    }

    public double Length() {
        return Math.sqrt(this.a * this.a + this.b * this.b);
    }

    public String toString() {
        if (this.b > 0) {
            return a + "i +" + b;
        } else {
            return a + "i " + b;
        }
    }

    public double arg() {
        return Math.atan(this.b / this.b);
    }

    public ComplexNumber pow(int n) {
        double r = Math.pow(this.Length(), n);
        this.a = r * (Math.cos(arg() * n));
        this.b = r * (Math.sin(arg() * n));
        return this;
    }

    public boolean equals(ComplexNumber k) {
        return (this.a == k.a) && (this.b == k.b);
    }
}
