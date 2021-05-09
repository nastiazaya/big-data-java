package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeYearMain {

    public static void main(String[] args) {
        EmployeeYear employee1 = new EmployeeYear("employee1", 12000);
        EmployeeYear employee2 = new EmployeeYear("employee2", 14000);

        List<EmployeeYear> employeeYearList = List.of(employee1, employee2);

        int yearSalary = employeeYearList.stream().flatMapToInt(employee -> Arrays.stream(employee.getSalary())).sum();

    }
}
