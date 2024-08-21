package methods.java_8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predicate02 {

    public static void main(String[] args) {
        //java 9
        List<String>myList = List.of("java8", "hasan", "kadir", "demircan", "hello", "hhhh","haki");
        Stream<String>myStream = myList.stream();

        /*
        //List in daha kısa yazılışı.yukardakinin kısa şekli
        List<String> myList2 = List.of("java8", "hasan", "kadir", "demircan", "hello", "hhhh","haki");
        myList2.stream().filter(s -> s.length() == 4).forEach(System.out::println);
        List<String> filteredList2 = myList2.stream().filter(s -> s.length() == 4).toList();
        */
        Predicate<String>predicate1 = element -> element.length() == 4;
        myStream.filter(predicate1).forEach(System.out::println);

        //toList ile yazdırma
        Stream<String>myStream2 = myList.stream();
        List<String>filteredList = myStream2.filter(predicate1).collect(Collectors.toList());
        //stream' i list'e donusturdum.


        //System.out.println(filteredList);



    }
}
