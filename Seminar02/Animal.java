package JAVA_OOP.Seminar02;

public abstract class Animal implements Speakable {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("кличка: " + name + ",").append(" корм: " + feed());
        return res.toString();
    }

    public abstract String feed();
}