package ru.kpfu.itis.java2k.ss;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */
@Component
public class Foursquare implements Figure {
    @Value("3")
    public int heightAndWeight;


    public Foursquare(){

    }
    public Foursquare(int heightAndWeight) {
        this.heightAndWeight = heightAndWeight;
    }


    public int getSquare() {
        return heightAndWeight*heightAndWeight;
    }


    public String name() {
        return "Foursquare";
    }

    public int isLargerThan(Figure c) {
        Figure other = (Figure) c;
        if (this.getSquare() > other.getSquare()) {
            return 1;
        } else {
            if (this.getSquare() == other.getSquare()) {
                return 0;
            } else return -1;
        }

    }



    public double differenceAdd(Figure c) {
        Figure other = (Figure) c;
        return Math.abs(this.getSquare() - other.getSquare());
    }


    public int differenceMult(Figure c) {
        Figure other = (Figure) c;
        return Math.abs(this.getSquare() / other.getSquare());
    }
}

