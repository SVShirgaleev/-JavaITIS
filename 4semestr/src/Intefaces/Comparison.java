package Intefaces;

/**
 * Created by salavatshirgaleev on 08/02/16.
 */
public interface Comparison {
   /* interface Instruments {
        public void play();

        public void name();

        public void type();
    }

    interface Trees {
        public void name();

        public void continent();

        public void color();
    }

    interface Student {
        public void name();

        public void group();

        public void dateOfRelease();

        public void nameOfTeacher();
    }*/

    interface Comparison {
        public int isLargerThan(Comparison c);

        public double differenceAdd(Comparison c);

        public int differenceMult(Comparison c);
    }

}
