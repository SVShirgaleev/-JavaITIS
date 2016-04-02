package Class;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by salavatshirgaleev on 31.03.16.
 */
public class RectangleTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
    @Test
    public void shouldReturnZero(){
        Rectangle rectangle = ac.getBean(Rectangle.class);
        Assert.assertEquals(0,rectangle.isLargerThan(rectangle));
        Assert.assertEquals(0,rectangle.differenceMult(rectangle));
        Assert.assertEquals(0,rectangle.differenceAdd(rectangle));
    }


}
