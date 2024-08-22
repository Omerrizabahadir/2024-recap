package recap.java_8.predicate;

import java.util.function.Predicate;

public class PredicateNumberIsPositiveOrNegative {
    public static void main(String[] args) {

        // Bir sayının pozitif olup olmadığını kontrol eden Predicate
        Predicate <Integer> isPositive = number -> number > 0;

        //test etme
        System.out.println("Is number positive : "+ isPositive.test(-12));
        System.out.println("Is number positive : "+ isPositive.test(12));

    }
}
