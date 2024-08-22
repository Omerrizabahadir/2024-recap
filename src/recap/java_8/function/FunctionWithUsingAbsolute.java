package recap.java_8.function;

import java.util.function.Function;

public class FunctionWithUsingAbsolute {
    public static void main(String[] args) {
        //mutlak değer alma 1. kullanım farkı var sadece alttakiyle
        Function<Integer,Integer> function1 = str -> Math.abs(str);

        //mutlak değer alma 2
        Function<Integer,Integer>function2 = Math::abs;

        System.out.println("Function 1 absolute value is : "+function1.apply(-600));
        System.out.println("Function 1 absolute value is : "+function2.apply(-700));
    }
}
