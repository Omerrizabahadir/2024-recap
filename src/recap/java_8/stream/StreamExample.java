package recap.java_8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    /*
    Java 8 ile birlikte gelen Stream API, koleksiyonlar üzerinde veri işleme işlemlerini daha fonksiyonel ve deklaratif bir biçimde yapmanıza olanak tanır.
    Stream API, verilerle işlem yaparken daha okunabilir, sürdürülebilir ve paralel işlem yapma yeteneği sunar.
    koleksiyonları veya diğer veri kaynaklarını işlemeye yönelik bir API'dir.
    Stream arayüzü, veri akışlarını temsil eder ve veri kaynaklarından (örneğin, koleksiyonlar, diziler, dosyalar) veri alarak bu veriler üzerinde çeşitli işlemler yapar. Bu işlemler arasında filtreleme, dönüştürme, sıralama ve toplama gibi işlemler bulunur.
    Stream İşlemleri
    Temel İşlemler:

    -filter(Predicate<T> predicate): Akıştaki elemanları filtreler.
    -map(Function<T, R> mapper): Her bir elemanı dönüştürür.
    -flatMap(Function<T, Stream<R>> mapper): Akıştaki her bir elemanı bir akışa dönüştürür ve tüm akışları birleştirir.
    -distinct(): Tekil elemanları seçer.
    -sorted(): Elemanları sıralar.
    -peek(Consumer<T> action): Her eleman üzerinde belirtilen işlemi uygular, genellikle debugging için kullanılır.
    -limit(long maxSize): Akışın boyutunu sınırlamak için kullanılır.
    -skip(long n): İlk n elemanı atlar.

     Terminal Operasyonlar:

        *forEach(Consumer<T> action): Akış üzerindeki her eleman için belirtilen işlemi uygular.
        *collect(Collector<? super T, A, R> collector): Akışın elemanlarını bir koleksiyona dönüştürür.
        *reduce(T identity, BinaryOperator<T> accumulator): Akış elemanlarını birleştirir ve tek bir sonuç üretir.
        *count(): Akıştaki eleman sayısını döndürür.
        *anyMatch(Predicate<? super T> predicate): Akıştaki herhangi bir eleman predicate koşulunu sağlıyorsa true döner.
        *allMatch(Predicate<? super T> predicate): Akıştaki tüm elemanlar predicate koşulunu sağlıyorsa true döner.
        *noneMatch(Predicate<? super T> predicate): Akıştaki hiç bir eleman predicate koşulunu sağlamıyorsa true döner.

     */
    public static void main(String[] args) {

        //Liste
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Filtreleme ve dönüştürme işlemini gerçekleştirme
        List<String>filteredNames=filterNameAndTransformToUpperCase(names);

        //sonuçları yazdırma
        printNames(filteredNames);

    }
    // İsimleri filtreleme ve dönüştürme işlemi
    public static List<String> filterNameAndTransformToUpperCase(List<String> names){
        return names.stream()
                .filter(name->name.startsWith("A"))             // "A" ile başlayan isimleri filtreleme
                .map(String::toUpperCase)                       // İsimleri büyük harfe dönüştürme
                .collect(Collectors.toList());                   // Listeye toplama
    }
    //  İsimleri yazdırma
    public static void printNames(List<String>names){
        System.out.println(names);

    }
}
