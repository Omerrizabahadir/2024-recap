package recap.design_patterns.builder_design_pattern03;
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    // Employee constructor parametre olarak EmployeeBuilder ver
    private Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.position = employeeBuilder.position;
        this.salary = employeeBuilder.salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String position;
        private double salary;

        public EmployeeBuilder(String firstName, String lastName, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        // Setter metodlar
        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
