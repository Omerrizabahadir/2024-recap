package recap.java_8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream08 {
    public static void main(String[] args) {

        //Verilen Liste
        List<String> list = Arrays.asList("monkey", "2", "chimp");

        Stream<String> infinite1 = Stream.generate(() -> "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");

        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(predicate));      //true
        System.out.println(list.stream().allMatch(predicate));      //false
        System.out.println(list.stream().noneMatch(predicate));     //false

        //infinitive
        System.out.println(infinite1.anyMatch(predicate));
        // System.out.println(infinite.allMatch(pred)); // true ->  endless loop

        System.out.println(infinite2.noneMatch(predicate));    //false
    }
}