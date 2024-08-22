package recap.java_8.function;

import java.util.function.Function;

public class FunctionWithUsingParseInt {
    public static void main(String[] args) {
        //String'i Integer'a çevirme 1
        Function<String,Integer> f1 = str -> Integer.parseInt(str);

        //String'i Integer'a çevirme 2
        Function<String,Integer> f2 = Integer::parseInt;


        System.out.println(f1.apply("768"));
        System.out.println(f2.apply("5000"));
    }
}
