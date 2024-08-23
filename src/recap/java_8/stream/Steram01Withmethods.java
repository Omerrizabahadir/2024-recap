package recap.java_8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Steram01Withmethods {
    public static void main(String[] args) {

        processEvenNumbers();

        System.out.println("****************************");

        printNoneEmptyNamesAndThenControlsStartsWithK();

        System.out.println("****************************");

        getDistinctNames();;


        System.out.println("****************************");

        processNumberStream();

    }

    // Çift sayıları 3 ile çarpıp yazdırma
    public static void processEvenNumbers() {
        IntStream.rangeClosed(0, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * 3)
                .forEach(System.out::println);
    }

    // ilk boş mu bakar->boş olanı eler. Geriye kalan 3 taneden de "K" ile başlıyorsa true başlamıyorsa false döner
    public static void printNoneEmptyNamesAndThenControlsStartsWithK() {
        Stream.of("Hasan", "Kadir", "", "Java")
                .filter(name -> !name.isEmpty())
                .map(name -> name.startsWith("K"))
                .forEach(System.out::println);
    }
    // Aynı isimden tekrar ediyorsa yazmayacak.Farklı olanları yazan metot
    public static void getDistinctNames(){
        Stream.of("Java", "Java", "Java8", "JAva")
                .distinct()
                .forEach(System.out::println);
    }
    // Belirli bir dizideki sayıları işleme
    public static void processNumberStream(){
        Stream<Integer> stream = Stream.iterate(10, n->n +2);
        stream.skip(3)                      //İlk 3 sayıyı atlama
                .limit(2)              // İlk 2 elemanı alma
                .forEach(System.out::println);

    }

}
