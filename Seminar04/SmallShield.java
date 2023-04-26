package JAVA_OOP.Seminar04;

public class SmallShield extends Shield {
    public SmallShield() {
        super("Малый", 20);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name).append(super.toString());
        return res.toString();
    }
}