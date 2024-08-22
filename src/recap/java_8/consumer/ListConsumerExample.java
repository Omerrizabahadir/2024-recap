package recap.java_8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListConsumerExample {
    public static void main(String[] args) {
       //Verilen Liste
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        //metotları çekmek için bu sınıfın nesnesini oluştur
        ListConsumerExample listConsumerExample = new ListConsumerExample();

        //Consumer'ı oluştur ve verilen listenin name'i ile Consumer'daki toUpperCaseConsumer 'i içine koy
        Consumer<String> toUpperCaseConsumer = listConsumerExample.createToUpperCaseConsumer();
        listConsumerExample.processList(names,toUpperCaseConsumer);
    }
    public Consumer <String> createToUpperCaseConsumer(){
        return name -> System.out.println(name.toUpperCase());
    }
    public void processList(List<String> list, Consumer<String> consumer){
        list.forEach(consumer);
    }
}
