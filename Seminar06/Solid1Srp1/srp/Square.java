package JAVA_OOP.Seminar06.Solid1Srp1.srp;

import java.util.ArrayList;
import java.util.List;

public class Square {

    private List<Point> points;
    private int side;

    public int getSide() {
        return side;
    }

    private int zoom = 1;

    public void setZoom(int zoom) {
        this.zoom = zoom;
        this.side *= zoom;
    }

    public Square(Point point1, int side) {
        this.side = side * zoom;

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);

        points = new ArrayList<>(4);
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }

    public List<Point> getPoints() {
        return points;
    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < side - 2; i++) {
            System.out.print("* ");
            for (int j = 1; j < side - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < side; i++) {
            System.out.print("* ");
        }
    }
}