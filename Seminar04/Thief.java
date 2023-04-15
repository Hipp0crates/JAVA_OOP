package JAVA_OOP.Seminar04;

public class Thief extends Fighter<Knife> {
    public Thief(String name, int hp, Knife weapon) {
        super(name, hp, weapon);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}