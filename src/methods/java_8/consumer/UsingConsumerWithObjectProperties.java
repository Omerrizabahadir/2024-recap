package methods.java_8.consumer;

import java.util.function.Consumer;

public class UsingConsumerWithObjectProperties {
    public static void main(String[] args) {
        //Person nesnesi oluştur.
        Person person = new Person("John",25);

        //sınıfın metotlarını çağırması için bu sınıfın nesnesini oluşturmalısın
        UsingConsumerWithObjectProperties usingConsumerWithObjectProperties = new UsingConsumerWithObjectProperties();

        //Consumer metodlarını çağır
        Consumer<Person> printPersonConsumer = usingConsumerWithObjectProperties.createPrintPersonConsumer();
        usingConsumerWithObjectProperties.useConsumer(printPersonConsumer,person);


    }
    // Person nesnesi üzerinde işlem yapan Consumer oluşturma metodu
    public Consumer <Person> createPrintPersonConsumer(){
        return person -> person.printPerson();
    }
    // Consumer'ı kullanma metodu.Consumer boş döndüreceği için void olmalı
    public void useConsumer(Consumer <Person> consumer, Person person){
       consumer.accept(person);
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printPerson() {
        System.out.println(name + " is " + age + " years old.");
    }

}