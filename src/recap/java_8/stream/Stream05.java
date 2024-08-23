package recap.java_8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Stream05 {
    public static void main(String[] args) {
        List<List<Integer>> intsOfInts = Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 4));

        intsOfInts.stream()
                .flatMap(Collection::stream)    //flatMap(Collection::stream): İç içe listeleri tek bir akışa düzleştirir.
                .sorted()                       //sıralayacak
                .map(i -> i * i)               //sayıların karesini alacak
                .forEach(System.out::println);
    }
}
