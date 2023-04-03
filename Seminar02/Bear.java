package JAVA_OOP.Seminar02;

public class Bear extends Predator implements Walkable {

    private int speed;

    public Bear(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public String speak() {
        return "Аррр";
    }

    @Override
    public int runSpeed() {
        return speed;
    }
}