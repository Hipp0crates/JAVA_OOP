package JAVA_OOP.Seminar02;

public class Bat extends Predator implements Flyable {

    public Bat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Сссс";
    }

    @Override
    public int flySpeed() {
        return 70;
    }

    @Override
    public String feed() {
        return "Насекомые";
    }
}