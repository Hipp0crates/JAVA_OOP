package JAVA_OOP.Seminar04;

public abstract class Personage {
    private String name;
    private int hp;
    protected Block block;

    public Personage(String name, int hp, Block block) {
        this.name = name;
        this.hp = hp;
        this.block = block;
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
        if (this.block.isBlock()) {
            this.hp -= 0;
            System.out.print("(блок) ");
        } else {
            this.hp -= damage;
            if (this.hp < 0) {
                this.hp = 0;
            }
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }
}