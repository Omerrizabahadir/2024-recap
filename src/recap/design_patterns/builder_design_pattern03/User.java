package recap.design_patterns.builder_design_pattern03;

public class User {
    private  String firstName;
    private  String lastName;
    private int age;
    private  String position;
    private double salary;

    //parametreleri sil yerine UserBuilder koy.constructor'ına UserBuilder koy ve eşitliğin sağ tarafındakileri userBuilderdan almak için düzeltme yap.
    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.position = userBuilder.position;
        this.salary = userBuilder.salary;
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
    public static class UserBuilder{
        private  String firstName;
        private  String lastName;
        private int age;
        private  String position;
        private double salary;

        //constructor'da istediklerini zorunlu yapıyorsun. diğerleri zorunlu değil setle
        //setlenenler void gelir onları UserBuilder yap
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        public UserBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
