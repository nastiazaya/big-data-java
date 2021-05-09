package stream;


import lombok.Data;

@Data
public class Employee {

    private String name;
    private int salary;
    private Genter genter;
    private String companyName;
    private Categories categories;

    public Employee(String name, int salary, Genter genter, String companyName) {
        this.name = name;
        this.salary = salary;
        this.genter = genter;
        this.companyName = companyName;
        this.categories = Categories.getCategore(salary);
    }
}
