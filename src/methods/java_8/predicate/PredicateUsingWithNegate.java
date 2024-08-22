package methods.java_8.predicate;

import java.util.function.Predicate;

public class PredicateUsingWithNegate {
    public static void main(String[] args) {
        PredicateUsingWithNegate predicateUsingWithNegate=new PredicateUsingWithNegate();

        Predicate <String> isEmpty = predicateUsingWithNegate.getName();

        System.out.println("Is name empty ? "+isEmpty.test(""));
        System.out.println("Is name empty ? "+isEmpty.test("hello"));
    }
    public Predicate <String> getName(){
        return name -> name.isEmpty();
    }
}
