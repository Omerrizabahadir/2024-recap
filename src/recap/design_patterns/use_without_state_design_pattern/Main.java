package recap.design_patterns.use_without_state_design_pattern;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("John","Doe",75000,"Active");

        employee.handleRequest();           // Çalışan şu anda aktif. İş yapabilir.
        System.out.println();

        //Durumu değiştir
        employee.setStatus("Sick");
        employee.handleRequest();           // Çalışan hasta. İş yapamaz.

        System.out.println();

        //Durumu değiştir
        employee.setStatus("Leave");       // Çalışan izinli. İş yapamaz.
        employee.handleRequest();

    }
}
