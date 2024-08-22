package recap.java_8.consumer;

import java.util.function.Consumer;

public class ChainedConsumerExample {
    public static void main(String[] args) {

        //sınıf nesnesi oluşturma
        ChainedConsumerExample chainedConsumerExample = new ChainedConsumerExample();

        Consumer <String> printConsumer = chainedConsumerExample.createPrintConsumer();
        Consumer<String> upperCaseConsumer = chainedConsumerExample.createUpperCaseConsumer();

        //consumer'ları birleştirme
        Consumer<String> combinedConsumer = chainedConsumerExample.combineConsumers(printConsumer,upperCaseConsumer);
        chainedConsumerExample.useConsumer(combinedConsumer,"Hello");

    }

    // Orijinal değeri yazdıran Consumer oluşturma metodu
    public Consumer<String> createPrintConsumer() {
        return s -> System.out.println("Original : " + s);
    }

    // Büyük harfe çeviren Consumer oluşturma metodu
    public Consumer<String> createUpperCaseConsumer() {
        return string -> System.out.println("UpperCase : " + string.toUpperCase());
    }
    // İki Consumer'ı birleştirme metodu
    public Consumer<String> combineConsumers(Consumer<String> first, Consumer<String> second) {
        return first.andThen(second);
    }
    // Consumer'ı kullanma metodu. Kullanırken void yap
    public void useConsumer(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }
}
