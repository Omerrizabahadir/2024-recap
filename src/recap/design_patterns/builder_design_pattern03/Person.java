package recap.design_patterns.builder_design_pattern03;

import java.util.concurrent.RecursiveTask;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;
    
    //constructor'ı
    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
        this.position = personBuilder.position;
        this.salary = personBuilder.salary;
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

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String position;
        private double salary;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return  this;
        }

        public PersonBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        public PersonBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        //constructorda zorunlu alan olarak sadece age istiyorum
        public PersonBuilder(int age) {
            this.age = age;

            
            //age dışındakileri set lemelisin ve setleri void veriyor değiştir->EmployeeBuilder olarak

        }
        public Person build(){
         return new Person(this) ;
        }
    }
}
