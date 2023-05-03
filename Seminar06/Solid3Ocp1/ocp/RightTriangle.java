package JAVA_OOP.Seminar06.Solid3Ocp1.ocp;

public class RightTriangle implements Shape {
    private int katet1;
    private int katet2;
    private double gipotenuza;

    public RightTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }

    public int getKatet2() {
        return katet2;
    }

    public int getKatet1() {
        return katet1;
    }

    public double getGipotenuza() {
        return gipotenuza;
    }
}