package stream;

import java.util.*;

import java.util.stream.Collectors;

public class EmployeeMain {


    public static void main(String[] args) {

        EmployeeMain employeeMain = new EmployeeMain();
        List<Employee> employeeList = List.of(new Employee("employee1", 30000,Genter.MAN,"company1"),
                new Employee("employee2", 1500, Genter.WOMAN,"company1"),
                new Employee("employe3", 40000, Genter.WOMAN,"company2"),
                new Employee("emp4", 20100,Genter.WOMAN,"company2"));

        System.out.println(employeeMain.sumSalary(employeeList));
        System.out.println(employeeMain.sortEmploesByNameLength(employeeList));
        System.out.println(employeeMain.isManEmployeesMoreExpensive(employeeList));
        System.out.println(employeeMain.sortEmployeesBySalary(employeeList));

        System.out.println(employeeMain.groupEmployeeByCompanyName(employeeList));

        System.out.println(companyNameWithMoreSeniors(employeeList));


    }

    public static String companyNameWithMoreSeniors(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(e -> e.getCategories().equals(Categories.SENIORS))
                .collect(Collectors.groupingBy((Employee::getCompanyName), Collectors.counting())).entrySet().stream()
                .max((e1, e2) -> e1.getValue() > e2.getValue() ? 1 : -1).get().getKey();
    }

    public Map<String, List<Employee>> groupEmployeeByCompanyName(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCompanyName, Collectors.toList()));
    }

    private  List<String> sortEmployeesBySalary(List<Employee> employeeList) {
        return employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public int sumSalary(List<Employee> employeeList){
        return employeeList.stream()
                .map(Employee::getSalary)
                .reduce(Integer::sum)
                .get();
    }

    public String stringFromName(List<Employee> employeeList){
       return employeeList.stream()
               .map(Employee::getName)
               .reduce((name, nextName) -> name + "," + nextName)
               .orElse("");
    }

    public List<String> sortEmploesByNameLength(List<Employee> employeeList){
        return employeeList.stream()
                .map(Employee::getName).
                map(t -> t.toUpperCase())
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public boolean isManEmployeesMoreExpensive(List<Employee> employeeList){
        Map<Genter, Integer> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGenter, Collectors.summingInt(Employee::getSalary)));
        return collect.get(Genter.MAN) > collect.get(Genter.WOMAN);
    }
}
