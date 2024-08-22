package recap.java_8.function;

import java.util.ArrayList;
import java.util.List;

public class FunctionAddEmployeeToList {
    public static void main(String[] args) {

        FunctionAddUserToList functionAddUserToList = new FunctionAddUserToList();

        Employee employee1 = new Employee("Can",25);
        Employee employee2 = new Employee("Cem",27);
        Employee employee3 = new Employee("Canan",29);

        List<Employee>employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        List<String> nameList = employees.stream().map(Employee::getName).toList();
        System.out.println(nameList);
    }

}
class Employee {
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}