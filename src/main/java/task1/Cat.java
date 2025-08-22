package task1;

public class Cat extends Animals {
    private String name;
    private int appetite; // ability to eat for 1 time
    private boolean satiety;

    Cat(int runLimit) {
        super(runLimit, -1);

    }

    @Override
    public String swim(int distance) {
        return getClassName() + " не может плавать";
    }

    Cat(String name, int appetite) {
        super();
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    void setFullness(boolean status) {
        satiety = status;
    }

    void eat(Misk plate) {
        if (!satiety) {
            satiety = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Кошка - " + name + ", покушала = " +
                appetite + ", сытость = " + satiety;
    }
}