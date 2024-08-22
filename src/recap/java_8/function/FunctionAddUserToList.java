package recap.java_8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionAddUserToList {
    public static void main(String[] args) {

        //metotları çağırmak için sınıfın nesnesini oluştur
        FunctionAddUserToList functionAddUserToList  = new FunctionAddUserToList();


        List <User> userList = functionAddUserToList.createUserList();
        functionAddUserToList.processAndPrintUsers(userList);

    }
    public List<User> createUserList(){

        User user1 = new User();
        user1.setName("H");
        user1.setSalary(11000);

        User user2 = new User();
        user2.setName("M");
        user2.setSalary(13000);

        //Listeye ekle
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;

    }
    //user ' ı listeye ekleyecek metot
    private void processAndPrintUsers(List<User> userList){
        List<User> updateUsers = userList.stream()
                .filter(user -> user.getSalary() < 12000)
                .map(user -> updateUserSalary(user))
                .collect(Collectors.toList());

        updateUsers.forEach(System.out::println);
    }
    private User updateUserSalary(User user){
        user.setSalary(user.getSalary() * 2);
        return user;
    }
}
class User{
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}