package recap.java_8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10)
                .filter(i -> (i % 2 == 0))
                .map(i -> i * 3)
                .forEach(System.out::println);


        System.out.println("**************************");

        Stream.of("Hasan", "Kadir", "", "Java")
                .filter(name -> !name.isEmpty())
                .map(name -> name.length() > 3)
                .forEach(System.out::println);

        System.out.println("**************************");

        Stream.of("Java", "Java", "Java8", "JAva")
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        Stream<Integer> stream = Stream.iterate(10, n -> n + 2);     //10'dan başlayarak her bir sonraki sayıyı bir öncekinin üzerine 2 ekleyerek üreten sonsuz bir akış (stream) oluşturur.
        stream.skip(3).limit(2).forEach(System.out::println);   //skip(3) 3 tane atlayacak ->yani 10-12-14 'ü atlar 16 dan devam eder. limit 2 -> 2 tane alır->onlarda 16 ve 18 dir

    }
}
