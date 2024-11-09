package task1;

public class Misk {
    private int maxQuantity;
    private int food;

    Misk(int maxQuantity, int food) {
        this.maxQuantity = maxQuantity;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= maxQuantity) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "В миске: " + food + "еды";
    }
}