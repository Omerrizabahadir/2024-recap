package recap.java_8.interface_feature_test01;

public class InterfaceFeatureTest {

    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.eat();      //Dog sınıfında Animal interface'indeki eat() metodunu override etmedim. bu Animal içindeki eat() çalışır. Animal is eating
        animal.run();      //Dog sınıfında Animal interface'indeki run() metodunu override ettiğimiz için artık override edilen run() metodu yani Dog sınıfındaki run çalışır.Dog is running.

        //static metot -> breathe() ise Önce İnterface adı sonra metot adıyla çağırırız
        ///breathe() metodu default olmadığı için Override edilemez
        Animal.breathe();
    }
}
