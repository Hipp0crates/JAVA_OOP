package JAVA_OOP.Seminar04;

public class Thief extends Fighter<Knife, Shield> {
    public Thief(String name, int hp, Knife weapon, Shield block) {
        super(name, hp, weapon, block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}