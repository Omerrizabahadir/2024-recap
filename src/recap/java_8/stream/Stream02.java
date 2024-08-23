package recap.java_8.stream;

import java.util.Arrays;
import java.util.List;

public class Stream02 {
    public static void main(String[] args) {
        //verilen liste
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");


        //Listedeki sayıların çift olanlarını filtreleme ve listeleme
        List<Integer> even = numbers.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println(even);
    }
}
