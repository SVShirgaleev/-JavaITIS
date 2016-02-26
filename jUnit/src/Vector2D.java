/**
 * Created by salavatshirgaleev on 15.02.16.
 */


public class Vector2D {


    public double length() {
        return Math.sqrt(x * x + y * y);
    }


    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {

        this.x = x;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D() {
        this(0, 0);
    }

    public Vector2D add(Vector2D n) {
        Vector2D n1 = new Vector2D();
        n1.x = this.x + n.x;
        n1.y = this.y + n.y;
        return n1;
    }

    public void add2(Vector2D n) {
        this.x += n.x;
        this.y += n.y;
    }

    public Vector2D sub(Vector2D n) {
        Vector2D n1 = new Vector2D();
        n1.x = this.x + n.x;
        n1.y = this.y + n.y;
        return n1;
    }

    public void sub2(Vector2D n) {
        this.x += n.x;
        this.y += n.y;
    }

    public Vector2D mult(double i) {
        Vector2D n1 = new Vector2D();
        n1.x = n1.x * i;
        n1.y = n1.y * i;
        return n1;
    }

    public void mult2(double i) {
        this.x *= i;
        this.y *= i;
    }

    public String toString() {
        return "{" + x + "," + y + "}";
    }

    public double Length() {
        return Math.sqrt(x * x + y * y);
    }

    public double scalarProduct(Vector2D n) {
        Vector2D n2 = new Vector2D();
        n2.x = this.x * n.x;
        n2.y = this.y * n.y;
        return n2.x + n2.y;

    }

    public double cos(Vector2D n) {
        return scalarProduct(n) / (this.Length() * n.Length());
    }

    public boolean equals(Vector2D n) {
        return (this.x == n.x) && (this.y == n.y);
    }
}

