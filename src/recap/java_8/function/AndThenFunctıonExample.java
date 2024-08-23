package recap.java_8.function;

import java.util.function.Function;

public class AndThenFunctıonExample {
    public static void main(String[] args) {

        //sınıf nesnesi oluştur. ve metotları çekmek için
        AndThenFunctıonExample andThenFunctıonExample = new AndThenFunctıonExample();

        //Function ları oluştur
        Function<Integer, Integer> squareFunction = andThenFunctıonExample.calculateSquareOfNumber();
        Function<Integer, Integer> doubleFunction = andThenFunctıonExample.calculateDoubleOfNumber();

        //Metotları birleştiren Function oluştur
        Function<Integer,Integer> squareThenDouble = andThenFunctıonExample.combineFunctions(squareFunction,doubleFunction);
        Integer result = andThenFunctıonExample.applyFunction(squareThenDouble,3);                      //3 sayısının karesi 9 olur ve 9 ikiyle çarpıldığında sonuç 18 olur.
        System.out.println("Result : "+result);
    }

    // Bir sayının karesini hesaplayan Function oluşturma metodu
    public Function<Integer, Integer> calculateSquareOfNumber() {
        return x -> x * x;
    }

    // Bir sayının iki katını hesaplayan Function oluşturma metodu.
    public Function<Integer, Integer> calculateDoubleOfNumber() {
        return x -> x * 2;
    }

    // İki Function'ı andThen ile birleştirme metodu
    public <T> Function<T, T> combineFunctions(Function<T, T> first, Function<T,T> second) {
        return first.andThen(second);

    }
    public <T> T applyFunction(Function<T,T>function,T value){
        return function.apply(value);
    }
}
