package JAVA_OOP.Seminar02;

public class Platypus extends Mammal implements Walkable, Floatable {

    public Platypus(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Уффф";
    }

    @Override
    public String feed() {
        return "Насекомые";
    }

    @Override
    public int runSpeed() {
        return 3;
    }

    @Override
    public int floatSpeed() {
        return 6;
    }
}