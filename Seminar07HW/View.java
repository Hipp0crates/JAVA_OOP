package JAVA_OOP.Seminar07HW;

import java.util.Scanner;

public class View {
    Creator creator = new Creator();
    Calculator calculator = new Calculator();
    Memory memory = new Memory();
    Loger loger = new Loger();

    public void run() {
        while (true) {
            System.out.println("Введите первое число (a + bi)");
            createComplexNumber();
            while (true) {
                String cmd = prompt("Kоманда (+) (-) (*) (0)exit): ");
                if (cmd.equals("+")) {
                    addition();
                    showLog();
                    break;
                }
                if (cmd.equals("-")) {
                    subtractiontraction();
                    showLog();
                    break;
                }
                if (cmd.equals("*")) {
                    multiplicationplication();
                    showLog();
                    break;
                }
                if (cmd.equals("0")) {
                    return;
                }
            }
            String cmd = prompt("Ещё (1)Yes (Enter)No)?: ");
            if (cmd.equals("1")) {
                loger = new Loger();
                continue;
            }
            break;
        }
    }

    private void showLog() {
        System.out.println("Лог: " + loger.show());
    }

    private void log(String comment) {
        loger.log(comment);
    }

    public Complex createComplexNumber() {
        int real = Integer.parseInt(prompt("Действительная часть (a): "));
        int imaginary = Integer.parseInt(prompt("Мнимая часть (b): "));
        Complex complex = creator.createComplex(real, imaginary);
        log(complex.toString());
        memory.to(complex);
        return complex;
    }

    public void addition() {
        if (memory.last() instanceof Complex) {
            System.out.println("Введите второе число (a + bi)");
            log("+");
            Calculatable res = calculator.addition((Complex) memory.from(), this.createComplexNumber());
            log("=");
            log(res.toString());
            memory.to(res);
            System.out.println("Результат: " + res);
        }
    }

    private void subtractiontraction() {
        if (memory.last() instanceof Complex) {
            System.out.println("Введите второе число (a + bi)");
            log("-");
            Calculatable res = calculator.subtraction((Complex) memory.from(), this.createComplexNumber());
            memory.to(res);
            log("=");
            log(res.toString());
            System.out.println("Результат: " + res);
        }
    }

    private void multiplicationplication() {
        if (memory.last() instanceof Complex) {
            System.out.println("Введите второе число (a + bi)");
            log("*");
            Calculatable res = calculator.multiplication((Complex) memory.from(), this.createComplexNumber());
            memory.to(res);
            log("=");
            log(res.toString());
            System.out.println("Результат: " + res);
        }
    }

    Scanner in = new Scanner(System.in);

    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }
}