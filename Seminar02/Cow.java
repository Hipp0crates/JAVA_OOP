package JAVA_OOP.Seminar02;

public class Cow extends Herbivore implements Walkable {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Мууу";
    }

    @Override
    public int runSpeed() {
        return 20;
    }
}