package methods.java_8.consumer;

import java.util.function.Consumer;

public class NestedConsumerExample {
    public static void main(String[] args) {

        //metotları çekmek için sınıfın nesnesini oluştur
        NestedConsumerExample nestedConsumerExample = new NestedConsumerExample();

        //iki Consumer metodunu burada oluştur
        Consumer<Integer> addFiveConsumer = nestedConsumerExample.createAddFiveConsumer();
        Consumer<Integer> multiplyTwoConsumer = nestedConsumerExample.createMultiplyTwoConsumer();

        //Consumer ları birleştir
        Consumer<Integer> nestedConsumer = nestedConsumerExample.combineConsumers(addFiveConsumer, multiplyTwoConsumer);
        nestedConsumerExample.useConsumer(nestedConsumer,10);

    }

    // Sayıya beş ekleyen Consumer oluşturma metodu
    public Consumer<Integer> createAddFiveConsumer() {
        return num -> System.out.println("Add five : " + (num + 5));
    }

    // Sayıyı iki ile çarpan Consumer oluşturma metodu
    public Consumer<Integer> createMultiplyTwoConsumer() {
        return num -> System.out.println("Multiply two : " + (num * 2));
    }

    // İki Consumer'ı birleştirme metodu
    public Consumer<Integer> combineConsumers(Consumer<Integer> first, Consumer<Integer> second) {
        return first.andThen(second);
    }

    // Consumer'ı kullanma metodu.Consumer void döndürür -->void olmalı
    public void useConsumer(Consumer<Integer> consumer, Integer value) {
        consumer.accept(value);
    }
}
