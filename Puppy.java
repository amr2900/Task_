package test;

public class Puppy extends test.Pet {

    protected Puppy(boolean isMale) {
        super(isMale);
    }

    @Override
    int getNumberOfLegs() {
        return 4;
    }
}
