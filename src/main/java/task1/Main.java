package task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        InterAnimals[] animals = {cat, dog};
        for (InterAnimals animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println("Животные были созданы: " + Animals.getCountOfAnimals());

        Cat[] cats = {
                new Cat("Челси", 15), new Cat("Лиза", 10), new Cat("Варя", 40)
        };
        Misk misk = new Misk(50, 30);
        System.out.println(misk);

        for (Cat kitty : cats) {
            kitty.eat(misk);
            System.out.println(kitty);
        }

        System.out.println(misk);
        misk.add(40);
        System.out.println(misk);

        for (Cat kitty : cats) {
            kitty.setFullness(false); // make the cat hungry
            kitty.eat(misk);
            System.out.println(kitty);
        }
        System.out.println(misk);
    }
}