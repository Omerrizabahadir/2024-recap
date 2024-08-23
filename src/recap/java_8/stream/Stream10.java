package recap.java_8.stream;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


        public class Stream10 {
            public static void main(String[] args) {
                String[] roseQuote = "a rose is a rose is a rose".split(" ");
                Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());


                Arrays.stream(roseQuote).collect(Collectors.toList());
                Arrays.stream(roseQuote).toList();

                System.out.println("Unique words (Set): " + words); // Sonuçları yazdırma
            }
        }