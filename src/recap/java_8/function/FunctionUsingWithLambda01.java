package recap.java_8.function;

import java.util.function.Function;

public class FunctionUsingWithLambda01 {
    public static void main(String[] args) {
        //sınıf nesnesi oluşturma metodu çekmek için
        FunctionUsingWithLambda01 functionUsingWithLambda = new FunctionUsingWithLambda01();

        //Function oluştur
        Function<String,Integer> lengthFunction = functionUsingWithLambda.findStringLength();
        int result = lengthFunction.apply("java8");



        System.out.println("Word's length is : "+result);

    }
    public Function<String,Integer> findStringLength(){
        //return function->function.length();
        return (String function) ->  function.length();
    }
}
