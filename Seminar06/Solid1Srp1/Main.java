package JAVA_OOP.Seminar06.Solid1Srp1;

import JAVA_OOP.Seminar06.Solid1Srp1.srp.Area;
import JAVA_OOP.Seminar06.Solid1Srp1.srp.Point;
import JAVA_OOP.Seminar06.Solid1Srp1.srp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1, 1), 5);
        Area area = new Area(square.getSide());
        square.setZoom(2);
        System.out.printf("Площадь фигуры: %d \n", area.getArea());
        square.draw();
    }
}