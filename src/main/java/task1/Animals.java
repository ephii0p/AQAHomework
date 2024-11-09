package task1;

abstract class Animals implements InterAnimals {

    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    Animals(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public Animals() {

    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " не может пробежать " + distance;
        } else {
            return className + " успешно пробежал " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " не может проплыть " + distance;
        } else {
            return className + " успешно проплыл " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}