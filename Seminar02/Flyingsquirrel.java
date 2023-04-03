package JAVA_OOP.Seminar02;

public class Flyingsquirrel extends Herbivore implements Walkable, Flyable {

    public Flyingsquirrel(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Зззз";
    }

    @Override
    public int runSpeed() {
        return 30;
    }

    @Override
    public int flySpeed() {
        return 25;
    }

    @Override
    public String feed() {
        return "Орехи";
    }
}