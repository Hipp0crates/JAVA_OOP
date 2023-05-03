package JAVA_OOP.Seminar06.Solid1Srp1.srp;

public class Area {
    private int side;

    public Area(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}