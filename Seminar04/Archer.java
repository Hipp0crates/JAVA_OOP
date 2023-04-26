package JAVA_OOP.Seminar04;

public class Archer extends Fighter<RangeWeapon, Shield> {
    public Archer(String name, int hp, RangeWeapon weapon, Shield block) {
        super(name, hp, weapon, block);
    }

    public int range() {
        return random.nextInt(this.weapon.range) + 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}