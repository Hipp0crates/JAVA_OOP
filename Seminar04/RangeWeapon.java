package JAVA_OOP.Seminar04;

public abstract class RangeWeapon implements Weapon {
    int range;

    public RangeWeapon(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(" (Максимальный урон: ").append(this.damage()).append(", Максимальная дистанция: ")
                .append(this.getRange()).append(")");
        return res.toString();
    }
}