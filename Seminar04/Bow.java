package JAVA_OOP.Seminar04;

public class Bow extends RangeWeapon {
    private String name;

    public Bow(int range) {
        super(range);
        this.name = "Лук";
    }

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(name).append(super.toString());
        return res.toString();
    }
}