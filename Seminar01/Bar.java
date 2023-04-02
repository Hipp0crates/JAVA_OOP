package JAVA_OOP.Seminar01;

public class Bar extends Product {
    public Bar(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("батончик ").append(super.toString());
        return res.toString();
    }
}