package JAVA_OOP.Seminar04;

public class Archer extends Fighter<RangeWeapon> {
    public Archer(String name, int hp, RangeWeapon weapon) {
        super(name, hp, weapon);
    }

    public int range() {
        return random.nextInt(this.weapon.range) + 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}