import org.junit.Assert;
import org.junit.Test;

/**
 * Created by salavatshirgaleev on 15.02.16.
 */
public class RationalFractionTest {
    public final static double EPS = 1e-9;
    /*@Test
    public void denominatorShouldNotBeZero(){
        RationalFraction rf = new RationalFraction();
        Assert.assertFalse(0,rf.getD());
    }*/

//    @Test(expected = )
//    public void rationalFractionCanNotHaveZeroDenominator() {
//        RationalFraction rf = new RationalFraction();
//
//
//    }

    @Test
    public void additionOfRationalFraction() {
        RationalFraction rf1 = new RationalFraction();
        RationalFraction rf2 = new RationalFraction();
        RationalFraction rf3 = new RationalFraction();
        Assert.assertEquals(3, rf1.add(rf2), EPS);
    }

}
