package JAVA_OOP.Seminar06.Solid7Dip;

import JAVA_OOP.Seminar06.Solid7Dip.dip.ConsoleReport;
import JAVA_OOP.Seminar06.Solid7Dip.dip.PrintReport;
import JAVA_OOP.Seminar06.Solid7Dip.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new PrintReport());
        report.output(new ConsoleReport());
    }
}