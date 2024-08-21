package methods.java_8.predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicate01 {
    //Predicate condition(if) kontrolü yapar
    //Functional interface'tir.->Bu nedenle 1 tane abstract metodu olmalı

    public static void main(String[] args) {
        //AŞAĞIDAKİ TÜM KULLANIMLAR AYNI SONUCU VERECEKTİR!!!!!!!

        //parametresi yok,veri tipi yoksa tek satırda oluşturuluyordu.
        Predicate<String>predicate1 = element -> element.startsWith("h");

        //parametresi varsa
        Predicate<String>predicate2 = (String element)->element.startsWith("h");

        // açık şekilde return etmek istersek,paramtresi varsa
        // süslü parantez kullanmamız gerekir.
        Predicate<String>predicate3 = (String element)->{
            return element.startsWith("h");
        };
        Stream.of("java8","hasan","kadir","demircan","hello").filter(predicate1).forEach(System.out::println);
    }
}
