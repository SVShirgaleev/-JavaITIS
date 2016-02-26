import org.junit.Assert;
import org.junit.Test;

/**
 * Created by salavatshirgaleev on 26.02.16.
 */
public class RectangleTest {
    @Test
    public void isLargeThanShouldReturnZero(){
        Rectangle r = new Rectangle(1,1);
        Assert.assertEquals(0,r.isLargerThan(r));
    }

    @Test
    public void differenceAddShouldReturnZero(){
        Rectangle r = new Rectangle(1,1);
        Assert.assertEquals(0,r.differenceAdd(r));
    }


    @Test
    public  void differenceMultShouldReturnZero(){
        Rectangle r = new Rectangle(1,1);
        Assert.assertEquals(0,r.differenceMult(r));
    }
}
