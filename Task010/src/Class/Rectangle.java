package Class;

import Intefaces.Comparison;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by salavatshirgaleev on 08/02/16.
 */

@Component
public class Rectangle implements Comparison {
    @Value("1")
    public int height;
    @Value("1")
    public int weight;

    public int getArea() {
        return height * weight;
    }


    @Override
    public int isLargerThan(Comparison c) {
        Rectangle other = (Rectangle) c;
        if (this.getArea() > other.getArea()) {
            return 1;
        } else {
            if (this.getArea() == other.getArea()) {
                return 0;
            } else return -1;
        }

    }

    @Override
    public double differenceAdd(Comparison c) {
        Rectangle other = (Rectangle) c;
        return Math.abs(this.getArea() - other.getArea());
    }

    @Override
    public int differenceMult(Comparison c) {
        Rectangle other = (Rectangle) c;
        return Math.abs(this.getArea() / other.getArea());
    }

}

