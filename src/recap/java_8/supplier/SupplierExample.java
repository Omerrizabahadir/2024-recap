package recap.java_8.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    /*
    Supplier arayüzü, bir değer üretmek için kullanılan fonksiyonel bir arayüzdür.
    Supplier, herhangi bir girdi almaz ve bir çıktı döndürür.
    Özellikle, tedarikçi (supplier) fonksiyonlarının kullanıldığı durumlarda,
    örneğin, değeri temin etmek veya nesne oluşturmak için kullanılır.

    Supplier Arayüzü
    Supplier<T> arayüzü, get metodu içerir ve bu metod herhangi bir girdi almadan bir T türünde değer döndürür.
     */
    public static void main(String[] args) {

        //sınıf nesnesi
        SupplierExample supplierExample = new SupplierExample();

        //Supplier sonuç dönecek
        Integer value = supplierExample.getIntegerSupplier().get();
        System.out.println("Value : " + value);
    }

    public Supplier<Integer> getIntegerSupplier() {
        return () -> 42;
    }
}
