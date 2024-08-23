package recap.java_8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample02UsingMethods {
    public static void main(String[] args) {
        //sınıf nesnesi oluşturma metotlar için
        SupplierExample02UsingMethods supplierExample02 = new SupplierExample02UsingMethods();

        // getString metodu kullanılarak Supplier'dan değer alma
        String supplier1 = supplierExample02.getString().get();
        System.out.println("String output is : "+supplier1);          // Çıktı: Supplier Example

        System.out.println("*************************************");

        // Random sayı üreten Supplier kullanarak değer alma ve yazdırma
        Integer randomIntegerValue = supplierExample02.getRandomInteger().get();
        System.out.println("Integer output is : "+randomIntegerValue);      // Çıktı: (rastgele bir tamsayı)
    }

    public Supplier<String> getString() {
        return () -> "Supplier Example";
    }

    public Supplier<Integer> getRandomInteger() {
       Random random = new Random();
        return () -> random.nextInt();
    }
}
