package JAVA_OOP.Seminar07HW;

public class Complex extends Adapter {
    private int real;
    private int imaginary;

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary == 1) {
            return String.format("(%d + i)", real);
        }
        if (imaginary == -1) {
            return String.format("(%d - i)", real);
        }
        if (imaginary < -1) {
            return String.format("(%d - %di)", real, -imaginary);
        }
        return String.format("(%d + %di)", real, imaginary);

    }

    @Override
    public Calculatable addition(Complex arg2) {
        Complex z1 = this;
        Complex z2 = arg2;
        int a = z1.getReal() + z2.getReal();
        int b = z1.getImaginary() + z2.getImaginary();
        return new Complex(a, b);
    }

    @Override
    public Calculatable subtraction(Complex arg2) {
        Complex z1 = this;
        Complex z2 = arg2;
        int a = z1.getReal() - z2.getReal();
        int b = z1.getImaginary() - z2.getImaginary();
        return new Complex(a, b);
    }

    @Override
    public Calculatable multiplication(Complex arg2) {
        Complex z1 = this;
        Complex z2 = arg2;
        int a = (z1.getReal() * z2.getReal()) - (z1.getImaginary() * z2.getImaginary());
        int b = (z1.getReal() * z2.getImaginary()) + (z2.getReal() * z1.getImaginary());
        return new Complex(a, b);
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}