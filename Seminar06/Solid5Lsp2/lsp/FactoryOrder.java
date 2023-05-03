package JAVA_OOP.Seminar06.Solid5Lsp2.lsp;

public class FactoryOrder {
    public Order create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(qnt, price);
        }
        return new Order(qnt, price);
    }
}