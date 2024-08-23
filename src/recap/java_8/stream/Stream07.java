package recap.java_8.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream07 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("monkey", "ape", "bonobo");
        Stream<String> stream2 = Stream.of("ape", "bonobo","monkey");

        Comparator<String> comp = Comparator.comparingInt(String::length);

        Optional<String> min = stream1.min(comp);
        Optional<String> max = stream2.max(comp);

        System.out.println(min);
        System.out.println(max);
    }
}
