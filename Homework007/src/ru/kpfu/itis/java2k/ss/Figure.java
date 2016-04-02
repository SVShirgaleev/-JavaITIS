package ru.kpfu.itis.java2k.ss;

/**
 * Created by salavatshirgaleev on 19.03.16.
 */
public interface Figure {
    public int getSquare();
    public String name();
    public int isLargerThan(Figure c);

    public double differenceAdd(Figure c);

    public int differenceMult(Figure c);
}
