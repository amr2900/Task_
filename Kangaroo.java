package test;

public class Kangaroo extends test.Pet {
    protected Kangaroo(boolean isMale) {
        super(isMale);
    }

    @Override
    int getNumberOfLegs() {
        return 2;
    }
}
