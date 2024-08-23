package recap.java_8.supplier;

import java.util.function.Supplier;

public class SupplierExampleReturnStringObject {
    public static void main(String[] args) {

        //sınıf metotları için sınıf nesnesi oluşturma
        SupplierExampleReturnStringObject supplierExampleReturnStringObject = new SupplierExampleReturnStringObject();

        // Nesne oluşturma örneğini çalıştır
        String message = supplierExampleReturnStringObject.getStringSupplier().get();
        System.out.println("Message : "+ message);
    }
    // Yeni bir String nesnesi döndüren Supplier metodu
    public Supplier<String> getStringSupplier(){
        return () -> "Hello World!";
    }
}
