package methods.java_8.predicate;

import java.util.function.Predicate;

public class CombiningMultiplePredicate {

    //Birden fazla Predicate'ı birleştirmek ve kullanmak
    //Combining multiple Predicate
    public static void main(String[] args) {

        //metotları çağırmak için sınıfın nesnesini oluşturdum
        CombiningMultiplePredicate combiningMultiplePredicate = new CombiningMultiplePredicate();

        //çift sayılar için Predicate
        Predicate<Integer> isEven = combiningMultiplePredicate.getEvenNumbers();

        //Posirif sayılar için Predicate
        Predicate <Integer> isPositive = combiningMultiplePredicate.getPositiveNumbers();

        //İki ayrı Predicate metodundakileri aynı Predicate ile kontrol ediyor
        // Pozitif ve Çift sayıları kontrol eden Predicate
        Predicate<Integer> isPositiveAndEven = isEven.and(isPositive);

        //test etme
        System.out.println("Is number positive and even : "+isPositiveAndEven.test(3));
        System.out.println("Is number positive and even : "+isPositiveAndEven.test(-3));
        System.out.println("Is number positive and even : "+isPositiveAndEven.test(0));
        System.out.println("Is number positive and even : "+isPositiveAndEven.test(2));
        System.out.println("Is number positive and even : "+isPositiveAndEven.test(-2));



        System.out.println();
    }

    public Predicate<Integer> getEvenNumbers() {
        return number -> number % 2 == 0;
    }

    public Predicate<Integer> getPositiveNumbers() {
        return number -> number > 0;
    }
}
