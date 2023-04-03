package JAVA_OOP.Seminar02;

public class Wolf extends Predator implements Walkable {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Рррр";
    }

    @Override
    public int runSpeed() {
        return 40;
    }
}