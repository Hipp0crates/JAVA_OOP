package JAVA_OOP.Seminar07HW;

public class Creator {
    public Complex createComplex(int real, int imaginary) {
        return new Complex(real, imaginary);
    }
}