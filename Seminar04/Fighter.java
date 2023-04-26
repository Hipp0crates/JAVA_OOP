package JAVA_OOP.Seminar04;

import java.util.Random;

public abstract class Fighter<T extends Weapon, B extends Block> extends Personage {
    protected static Random random = new Random();
    protected T weapon;
    protected B block;

    public Fighter(String name, int hp, T weapon, B block) {
        super(name, hp, block);
        this.weapon = weapon;
        this.block = block;
    }

    public int dealingDamage() {
        boolean isHit = random.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = random.nextInt(weapon.damage() + 1);
        } else {
            System.out.print("(промах) ");
        }
        return damage;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(" ").append(this.getName()).append("\n")
                .append("\t Здоровье: ").append(getHp()).append("\n")
                .append("\t Оружие: ").append(this.weapon).append("\n")
                .append("\t Щит: ").append(this.block);
        return res.toString();
    }
}