package JAVA_OOP.Seminar02;

public class Goat extends Herbivore implements Walkable {

    public Goat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Беее";
    }

    @Override
    public int runSpeed() {
        return 35;
    }
}