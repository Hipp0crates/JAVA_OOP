package JAVA_OOP.Seminar04;

public abstract class Personage {
    private String name;
    private int hp;

    public Personage(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void reduceHP(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }
}