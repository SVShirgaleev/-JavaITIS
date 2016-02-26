import org.junit.*;

/**
 * Created by salavatshirgaleev on 24.02.16.
 */
public class Matrix2x2Test {
    public final static double EPS = 1e-9;

    @Test
    public void detShouldReturnZero(){
        Matrix2x2 m = new Matrix2x2();
        Assert.assertEquals(0,m.det(),EPS);
    }

    @Test
    public void defaultMatrixShouldHaveZeroDet(){
        Matrix2x2  m = new Matrix2x2();
        Assert.assertEquals(0, m.det(), EPS);
    }

    @Test
    public void matrixWithTaxParamHaveDetUnequalToZero(){
        Matrix2x2 m = new Matrix2x2(1,4,5,1);
        Assert.assertNotEquals(0,m.det(),EPS);

    }

    @Test
    public void matrixWithTaxArrayParamShouldHaveParamUnequalZero(){
        double [][] a = new double[2][2];
        a[0][0]=3;
        a[0][1]=2;
        a[1][0]=1;
        a[1][1]=7;

        Matrix2x2 m = new Matrix2x2(a);
        Assert.assertNotEquals(0, m.det(), EPS);
    }

    @Test
    public void additionOfMatrixShouldEqualFirstMatrix(){
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Matrix2x2 s = new Matrix2x2();
        Assert.assertEquals(f,s.add(f));
    }

    @Test
    public void addition2OfMatrixShouldEqualsMatrix(){
        Matrix2x2 q = new Matrix2x2(1,1,1,1);
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Matrix2x2 s = new Matrix2x2();
        s.add2(f);

        Assert.assertEquals(q, s);
    }


    @Test
    public void subOfMatrixShouldEqualFirstMatrix(){
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Matrix2x2 s = new Matrix2x2();
        Assert.assertEquals(f,f.sub(s));

    }


    @Test
    public void sub2OfMatrixShouldEqualFirstMatrix(){
        Matrix2x2 q = new Matrix2x2(1,1,1,1);
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Matrix2x2 s = new Matrix2x2();
        s.sub2(f);
        Assert.assertEquals(f,s);
    }



    @Test
    public void multOfMatrixAndZeroMatrixEqualZeroMatrix(){
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Matrix2x2 s = new Matrix2x2();
        Assert.assertEquals(s,s.mult(f));
    }

    @Test
    public void mult2OfMatrixAndZeroMatrixEqualZeroMatrix(){
        Matrix2x2 q = new Matrix2x2(1,1,1,1);
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Matrix2x2 s = new Matrix2x2();
        s.mult2(f);
        Assert.assertEquals(q,s);
    }


    @Test
    public void multMatrixWithNumbOneShouldEqualMatrix(){
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Assert.assertEquals(f,f.multiNumber(1));
    }


    @Test
    public void mult2MatrixWithNumbOneShouldEqualMatrix(){
        Matrix2x2 q = new Matrix2x2(1,1,1,1);
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        f.multiNumber2(1);
        Assert.assertEquals(q,f);
    }

    @Test
    public void multMatrixWithMatrixShouldEqualsFirstMatrix(){
        Matrix2x2 q = new Matrix2x2(1,1,1,1);
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Assert.assertEquals(q,f.mult(f));
    }

    @Test
    public void mult2MatrixWithMatrixShouldEqualsFirstMatrix(){
        Matrix2x2 q = new Matrix2x2(1,1,1,1);
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        f.mult2(q);
        Assert.assertEquals(q,f);
    }

    @Test
    public void transposeOfZeroMatrixEqualOriginal(){
        Matrix2x2 q = new Matrix2x2();
        Matrix2x2 f =  new Matrix2x2();
        f.transpose();
        Assert.assertEquals(q,f);
    }

    @Test
    public  void inverseMatrixShouldEqualCertainMatrix(){
        Matrix2x2 certain = new Matrix2x2(-1,1,1,-0.5);
        Matrix2x2 f = new Matrix2x2(1,2,2,2);
        f.inverseMatrix();
        Assert.assertEquals(certain,f);
    }
    @Test
    public void equalDiagonalShouldEqualCertainMatrix(){
        Matrix2x2 certain = new Matrix2x2();
        Matrix2x2 f = new Matrix2x2();
        f.equavialentDiagonal();
        Assert.fail("Доделать");

    }

    @Test
    public void multMatrixAndVectorIs4X4(){
        Matrix2x2 f = new Matrix2x2(1,1,1,1);
        Vector2D x = new Vector2D(2,2);
        Vector2D ff = new Vector2D(4,4);
        f.multVector(x);
        Assert.assertEquals(ff,x);
    }

}
