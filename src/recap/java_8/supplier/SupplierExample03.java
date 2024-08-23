package recap.java_8.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample03 {
    public static void main(String[] args) {
        //3 tane Supplier kullanımı yazacaz.hEPSİ Random (rastgele) sayı üretecek. Hepsi aynı sonucu verecek.Sadece yazılışı farklı

        //supplier 1
        Supplier<Integer> supplier1 = () -> new Random().nextInt(20);
        Stream.generate(supplier1).limit(5).forEach(System.out::println);

        System.out.println("***********************");

        //supplier 2 yukardakinin fatklı kullanım.Aynı sonuç
        Supplier<Integer> supplier2 = new Random()::nextInt;
        Stream.generate(supplier2).limit(6).filter(number -> number >5).forEach(System.out::println);

        //BU KULLANIM DİĞERLERİNE GÖRE DAHA FARKLI YAZILIYOR!!!!!
        System.out.println("--------------------------");
        Supplier<Integer> supplier3 = SupplierExample03::createRandomNumber;
        System.out.println(supplier3.get());
    }
    public static Integer createRandomNumber(){
        return new Random().nextInt();
    }
}
