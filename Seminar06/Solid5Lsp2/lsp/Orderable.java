package JAVA_OOP.Seminar06.Solid5Lsp2.lsp;

public abstract class Orderable {
    protected int price;
    protected int qnt;

    public Orderable(int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    }

    public abstract int getAmount();

    @Override
    public String toString() {
        return super.toString();
    }
}