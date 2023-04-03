package JAVA_OOP.Seminar02;

public class Platypus extends Mammal implements Walkable {

    public Platypus(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Уффф";
    }

    @Override
    public String feed() {
        return "Яйца";
    }

    @Override
    public int runSpeed() {
        return 5;
    }
}