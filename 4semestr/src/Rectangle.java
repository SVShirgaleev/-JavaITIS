/**
 * Created by salavatshirgaleev on 08/02/16.
 */
class Rectangle implements Comparison {
    public int height;

    public int weight;

    public int getArea() {
        return height * weight;
    }


    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight=weight;
    }

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


    public double differenceAdd(Comparison c) {
        Rectangle other = (Rectangle) c;
        return Math.abs(this.getArea() - other.getArea());
    }


    public int differenceMult(Comparison c) {
        Rectangle other = (Rectangle) c;
        return Math.abs(this.getArea() / other.getArea());
    }

}

