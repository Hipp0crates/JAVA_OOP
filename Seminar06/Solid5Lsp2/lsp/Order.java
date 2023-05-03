package JAVA_OOP.Seminar06.Solid5Lsp2.lsp;

public class Order extends Orderable {
    public Order(int qnt, int price) {
        super(qnt, price);
        this.price = price;
        this.qnt = qnt;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }

    @Override
    public int getAmount() {
        return qnt * price;
    }
}