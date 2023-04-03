package JAVA_OOP.Seminar02;

public abstract class Herbivore extends Mammal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Трава";
    }
}