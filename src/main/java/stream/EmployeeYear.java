package stream;


import lombok.Data;
import lombok.experimental.FieldNameConstants;

import java.util.Arrays;


@Data
public class EmployeeYear {
    private String name;
    private int[] salary = new int[12];

    EmployeeYear(String name, int salary){
        this.name = name;
        Arrays.fill(this.salary, salary);
    }
}
