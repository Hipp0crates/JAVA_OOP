package JAVA_OOP.Seminar06.Solid5Lsp2.lsp;

public class OrderBonus extends Order {

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }
}