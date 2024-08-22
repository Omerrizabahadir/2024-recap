package recap.java_8.function;

import java.util.function.Function;

public class BasicFunctionExample {

    /*
    Java 8 ile gelen Function arayüzü,
    fonksiyonel programlama paradigmasında oldukça önemli bir rol oynar.
    Function arayüzü, bir girdi alır ve bir çıktı üretir.
    Java 8'den itibaren, Function arayüzü java.util.function paketinde yer alır ve işlevsel arayüzlerin bir örneğidir.
     */

    public static void main(String[] args) {

        BasicFunctionExample basicFunctionExample=new BasicFunctionExample();


        Function<String,Integer> stringLengthFunction = basicFunctionExample.createStringLengthFunction();
        Integer length = basicFunctionExample.applyFunction(stringLengthFunction,"Hello World!");
        System.out.println("length : "+ length);
    }

    // String'in uzunluğunu döndüren Function oluşturma metodu
    public Function<String, Integer> createStringLengthFunction() {
        return s -> s.length();
    }

    // Function'ı kullanma metodu
    public <T,R> R  applyFunction(Function<T,R>function,T value) {
        return function.apply(value);
    }

}
