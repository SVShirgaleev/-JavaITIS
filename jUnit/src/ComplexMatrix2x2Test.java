import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by salavatshirgaleev on 25.02.16.
 */
public class ComplexMatrix2x2Test {
    public final static double EPS = 1e-9;


    @Test
    public void additionOfComplexMatrixShouldEqualOriginal() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getA()).thenReturn(0.0);
        when(cn.getB()).thenReturn(0.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        ComplexMatrix2x2 mcn = mock(ComplexMatrix2x2.class);
        ComplexNumber[][] arr = new ComplexNumber[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = cn;
            }
        }
        when(mcn.a).thenReturn(arr);
        Assert.assertEquals(mcn, cm.add(mcn));
    }


    @Test
    public void multOfTwoComplexMatrixShouldEqualOriginal() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getA()).thenReturn(1.0);
        when(cn.getB()).thenReturn(1.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        ComplexMatrix2x2 mcn = mock(ComplexMatrix2x2.class);
        ComplexNumber[][] arr = new ComplexNumber[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = cn;
            }
        }
        when(mcn.a).thenReturn(arr);
        Assert.assertEquals(mcn, cm.mult(mcn));
    }

    @Test
    public void detOfMatrixShouldEqualZero() {
        ComplexNumber cn = mock(ComplexNumber.class);
        when(cn.getA()).thenReturn(0.0);
        when(cn.getB()).thenReturn(0.0);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn);
        Assert.assertEquals(0, cm.det());

    }



    @Test
    public void multOfMatrixWithVectorShouldEqualZero(){
        ComplexNumber n = mock(ComplexNumber.class);
        when(n.getA()).thenReturn(0.0);
        when(n.getB()).thenReturn(0.0);
        ComplexVector2D v = mock(ComplexVector2D.class);
        when(v.getX()).thenReturn(n);
        when(v.getY()).thenReturn(n);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        Assert.assertEquals(v,cm.multVector(v));
    }
}
