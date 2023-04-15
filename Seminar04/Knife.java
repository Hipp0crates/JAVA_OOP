package JAVA_OOP.Seminar04;

public class Knife implements Weapon {
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Кинжал").append(" (Максимальный урон: ").append(this.damage()).append(")");
        return res.toString();
    }
}