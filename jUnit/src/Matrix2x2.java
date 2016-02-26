/**
 * Created by salavatshirgaleev on 23.02.16.
 */
public class Matrix2x2 {
    double[][] m = new double[2][2];


    public Matrix2x2() {
        this(0);
    }

    public Matrix2x2(double x) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                m[i][j] = x;
            }
        }
    }

    public Matrix2x2(double a, double b, double c, double d) {
        this.m[0][0] = a;
        this.m[0][1] = b;
        this.m[1][0] = c;
        this.m[1][1] = d;
    }

    public Matrix2x2(double[][] k) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                m[i][j] = k[i][j];
            }
        }
    }

    public Matrix2x2 add(Matrix2x2 k) {
        Matrix2x2 t = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                t.m[i][j] = this.m[i][j] + k.m[i][j];
            }
        }
        return t;
    }

    public void add2(Matrix2x2 k) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                this.m[i][j] += k.m[i][j];
            }
        }
    }

    public Matrix2x2 sub(Matrix2x2 k) {
        Matrix2x2 t = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                t.m[i][j] = this.m[i][j] - k.m[i][j];
            }
        }
        return t;
    }

    public void sub2(Matrix2x2 k) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                this.m[i][j] -= k.m[i][j];
            }
        }
    }

    public Matrix2x2 multiNumber(double o) {
        Matrix2x2 t = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                t.m[i][j] = this.m[i][j] * o;
            }
        }
        return t;
    }

    public void multiNumber2(double o) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 2; j++) {
                this.m[i][j] *= o;
            }
        }
    }

    public Matrix2x2 mult(Matrix2x2 k) {
        Matrix2x2 t = new Matrix2x2();
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                for (int s = 1; s < 3; s++) {
                    t.m[i][j] += this.m[i][s] * k.m[s][j];
                }
            }
        }
        return t;
    }

    public void mult2(Matrix2x2 k) {
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                for (int s = 1; s < 3; s++) {
                    this.m[i][j] += this.m[i][s] * k.m[s][j];
                }
            }
        }
    }

    public double det() {
        return this.m[0][0] * this.m[1][1] - this.m[0][1] * this.m[1][0];
    }

    public void transpose() {
        double c = this.m[0][1];
        this.m[0][1] = this.m[1][0];
        this.m[1][0] = c;
    }

    public Matrix2x2 inverseMatrix() {
        double d = this.det();
        Matrix2x2 l = new Matrix2x2();
        l.m[0][0] = this.m[1][1];
        l.m[0][1] = this.m[1][0];
        l.m[1][0] = this.m[0][1];
        l.m[1][1] = this.m[0][0];
        l.transpose();
        return l.multiNumber(1 / d);
    }

    public Matrix2x2 equavialentDiagonal() {
        Matrix2x2 l = new Matrix2x2();
        l.m[0][0] = this.m[1][1];
        l.m[0][1] = 0;
        l.m[1][0] = 0;
        l.m[1][1] = (this.m[1][1] - this.m[0][1] * this.m[1][0]) / this.m[1][1];
        return l;
    }

    public Vector2D multVector(Vector2D z) {
        Vector2D t = new Vector2D();
        t.setX(this.m[0][0] * z.getX() + this.m[0][1] * z.getY());
        t.setY(this.m[1][0] * z.getX() + this.m[1][1] * z.getY());
        return t;
    }




}
