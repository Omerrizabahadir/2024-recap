package recap.java_8.stream;

import java.util.stream.Stream;

import java.util.stream.Stream;

public class Stream09 {

    public static void main(String[] args) {
        // İlk Stream işlemini yapma ve sonucu yazdırma
        String concatenatedWord = concatenateStreamElements();
        System.out.println(concatenatedWord); // Xw1o2l3f4

        // İkinci Stream işlemini yapma ve sonucu yazdırma
        String formattedWord = formatStreamElements();
        System.out.println(formattedWord); // w--o--l--f--
    }

    // Stream elemanlarını birleştirme ve başlangıç değeri kullanma
    public static String concatenateStreamElements() {
        Stream<String> stream = Stream.of("w1", "o2", "l3", "f4");
        return stream.reduce("X", String::concat); // "X" ile başlayarak String'leri birleştirme
    }

    // Stream elemanlarını özel formatla birleştirme
    public static String formatStreamElements() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        return stream.reduce("", (s, c) -> s + c + "--"); // Her elemanı "--" ile birleştirme
    }
}
