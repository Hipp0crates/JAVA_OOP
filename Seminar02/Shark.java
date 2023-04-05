package JAVA_OOP.Seminar02;

public class Shark extends Predator implements Floatable {

    private int speed;

    public Shark(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public String speak() {
        return "...";
    }

    @Override
    public int floatSpeed() {
        return speed;
    }

    @Override
    public String feed() {
        return "Рыба";
    }
}