package JAVA_OOP.Seminar02;

public abstract class Predator extends Mammal {

    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Мясо";
    }
}