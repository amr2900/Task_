package test;

/**
 * @author Mohamed Elshaarawy on Nov 05, 2019.
 */
public class Kangaroo extends test.Pet {
    protected Kangaroo(boolean isMale) {
        super(isMale);
    }

    @Override
    int getNumberOfLegs() {
        return 2;
    }
}
