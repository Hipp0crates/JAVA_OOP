package JAVA_OOP.Seminar07HW;

public class Calculator {
    public Calculatable addition(Complex arg1, Complex arg2) {
        Calculatable add = arg1.addition(arg2);
        return add;
    }

    public Calculatable subtraction(Complex arg1, Complex arg2) {
        Calculatable sub = arg1.subtraction(arg2);
        return sub;
    }

    public Calculatable multiplication(Complex arg1, Complex arg2) {
        Calculatable multi = arg1.multiplication(arg2);
        return multi;
    }
}