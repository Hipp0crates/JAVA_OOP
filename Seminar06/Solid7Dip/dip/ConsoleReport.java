package JAVA_OOP.Seminar06.Solid7Dip.dip;

import java.util.List;

public class ConsoleReport implements Reportable {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to console");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}