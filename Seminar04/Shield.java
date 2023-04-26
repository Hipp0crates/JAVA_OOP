package JAVA_OOP.Seminar04;

import java.util.Random;

public abstract class Shield implements Block {
    protected String name;
    private int block;

    // Расчтёт вероятности блока, если блок сработал то урон не пройдёт
    @Override
    public boolean isBlock() {
        Random random = new Random();
        int current = random.nextInt(0, 101);
        if (current <= block) {
            return true;
        }
        return false;
    }

    public Shield(String name, int block) {
        this.name = name;
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(" (Вероятность блока: ").append(this.block).append("%)");
        return res.toString();
    }
}