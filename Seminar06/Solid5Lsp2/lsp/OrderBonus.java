package JAVA_OOP.Seminar06.Solid5Lsp2.lsp;

public class OrderBonus extends Orderable {

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d (бонус)", qnt, price);
    }
}