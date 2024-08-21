package methods.java_8.functional_interface;

@FunctionalInterface
public interface Ford extends Car{
    /* Car Interface has 1 abstract method,
        so Ford extend it in own interface that's why Ford is a FunctionalInterface.
        DİKKAT!!!--> Ford interface'i Car interface 'inden genişliyor.
        Car interface'inde 1 adet void speed(); abstract metodu bulunuyor.
        Bu void speed(); abstract metodu Ford içinde geçerli--->>Car interface'inden genişlediği için.
        Ford interface'inde başka bir abstract metot daha olsaydı ÖR: void brake(); gibi, Yani Ford içinde bir adet void brake() yazılsaydı
        o zaman Ford interface 'i functional interface olmazdı
     */

    //void brake();             //bu metot kullanılırsa Ford sınıfı FunctionalInterface olmaz.Çünkü Functional interface olması için 1 adet abstract metot olmalı
}
