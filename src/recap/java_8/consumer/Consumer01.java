package recap.java_8.consumer;

import java.util.function.Consumer;

public class Consumer01 {

    /*
    Java 8 ile tanıtılan Consumer arayüzü,
    Java'nın fonksiyonel programlama özelliklerinden biridir.
    Consumer arayüzü, bir nesneyi alır ve bu nesne üzerinde bir işlem gerçekleştirir,
    ancak hiçbir değer döndürmez.
    Consumer arayüzü, java.util.function paketinde bulunur ve genellikle işlemler uygulamak, yan etkiler oluşturmak ve işlevsel programlama tarzında kod yazmak için kullanılır.
    Tip: Consumer<T>
    T türünde bir nesne alır.
    void döndürür, yani herhangi bir değer döndürmez.
    Ana Metod:
    void accept(T t): T türünde bir nesne alır ve bu nesne üzerinde belirli bir işlem gerçekleştirir.
     */
    public static void main(String[] args) {

        Consumer01 consumer01 = new Consumer01();

        Consumer<String> printConsumer = consumer01.createPrintConsumer();
        consumer01.useConsumer(printConsumer,"Hello, World!");

    }
    // Consumer oluşturma metodu
    public Consumer<String> createPrintConsumer() {
        return s -> System.out.println(s);
    }

    // Consumer'ı kullanma metodu
    public void useConsumer(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }
}


