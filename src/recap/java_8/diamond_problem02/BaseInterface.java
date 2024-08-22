package recap.java_8.diamond_problem02;

public interface BaseInterface {
    /*default metot Override etmeye gerek yok.
    Ancak message() metodu BaseClass'tada var.
    Bu durumda message metodu başka bir interfacete olsaydı diamond problem old. için bu message metodunu başka sınıftan override ediyorduk
    Ama şimdi burada durum farklı. Burada bir class birde interfacete aynı message metodu var.
    Bu da bir DIAMOND PROBLEM'dır. Bu durumda Override gerekmez Class win. sınıftaki metot kullanılır.
     */
    default public void message(){
        System.out.println("BaseInterface message..");
    }
}
