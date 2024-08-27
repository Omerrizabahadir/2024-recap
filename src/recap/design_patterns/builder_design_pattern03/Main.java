package recap.design_patterns.builder_design_pattern03;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee.EmployeeBuilder("John", "Doe", 76000)
                .build();

        Employee employee2 = new Employee.EmployeeBuilder("Ali", "Said", 9000)
                .setPosition("Software Engineer")
                .build();

        System.out.println("First name :" + employee1.getFirstName());
        System.out.println("Last name : " + employee1.getLastName());
        System.out.println();

        System.out.println("First name :" + employee2.getFirstName());
        System.out.println("Last name : " + employee2.getLastName());
        System.out.println("Position : " + employee2.getPosition());

        System.out.println("******************************************");

        Person person = new Person.PersonBuilder(23)
                .build();
        System.out.println("age is: "+person.getAge());


        System.out.println("-------------------------------------------");

        User user = new User.UserBuilder("Cem","Çalık")
                .build();

        System.out.println("FirsName is : "+user.getFirstName());
        System.out.println("LastName is: "+user.getLastName());

    }
}
