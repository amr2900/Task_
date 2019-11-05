package test;

public abstract class Pet {
    private boolean isMale;

    Pet(boolean isMale) {
        this.isMale = isMale;
    }

    abstract int getNumberOfLegs();

    public boolean canBreasFeed() {
        return !isMale;
    }
}
