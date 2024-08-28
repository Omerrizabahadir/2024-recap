package recap.design_patterns.use_without_state_design_pattern;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;
    private String status; // "Active", "Sick", "Leave"

    public Employee(String firstName, String lastName, double salary, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.status = status;
    }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public void handleRequest(){
        if (status.equals("Active")){
            System.out.println("Çalışan şu anda aktif. İş yapabilir");
        } else if (status.equals("Sick")) {
            System.out.println("Çalışan hasta. İş yapamaz.");
        }else if (status.equals("Leave")){
            System.out.println("Çalışan şu an izinli. İş yapamaz");
        }else {
            System.out.println("Bilinmeyen durum");
        }
        }
    }

