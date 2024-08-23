package recap.java_8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample02 {
    public static void main(String[] args) {
        Supplier<String> supplier01 = () -> "Supplier Example";
        System.out.println("String output is : "+supplier01.get());
        Random random = new Random();

        Supplier<Integer> supplier02 = () -> random.nextInt();

        System.out.println("Integer output is: "+supplier02.get());
    }
}
