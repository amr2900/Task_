package test;



public class Caw extends test.Pet {
    protected Caw(boolean isMale) {
        super(isMale);
    }

    @Override
    int getNumberOfLegs() {
        return 4;
    }
}
