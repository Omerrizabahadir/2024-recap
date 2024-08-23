package recap.java_8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream02WithMethods {
    public static void main(String[] args) {

        //verilen List
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");

        //Listedeki Çift sayıları elde etme
        List<Integer> evenNumbers = getEvenNumbers(numbers);

        // Çift sayıları metodu çağırarak yazdırma
        printNumbers(evenNumbers);

    }

    // Sayıları çift olanları elde etme
    public static List<Integer> getEvenNumbers(List<String> numbers){
        return numbers.stream()
                .map(Integer::valueOf)          // String'leri Integer'a dönüştürme
                .filter(number->number %2 == 0) // Çift sayıları filtreleme
                .collect(Collectors.toList());   // Sonuçları listeye toplama
    }
    // Sayıları yazdırma
    public static void printNumbers(List<Integer>numbers){
        System.out.println(numbers);
    }


}
