package recap.algorithm;

public class MakeStarsPattern02 {

    /*

     *****
     ****
     ***
     **
     *

     */

    public static void main(String[] args) {

        int satirSayisi = 5;

        System.out.println("iç döngü kullanarak deseni yazdırma : ");
        getStarsPatternWithoutInnerLoop(satirSayisi);

        System.out.println("--------------");

        System.out.println("iç döngü olmadan repeat() ile deseni yazdırma : ");
        getStarsPatternWithoutInnerLoop(satirSayisi);

    }

    //inner loop kullanmadan deseni yazma
    public static void getStarsPatternWithoutInnerLoop(int satirSayisi) {
        //Other way for inner loop
        // Dış döngü: Her bir satırı oluşturmak için
        for (int i = 0; i < satirSayisi; i++) {
            // Boşlukları yazdır
            System.out.print(" ".repeat(i));

            // Yıldızları yazdır
            System.out.print("*".repeat(satirSayisi - i));

            // Satırı bitirip bir alt satıra geçmek için yeni satır karakteri
            System.out.println();
        }
        }


    public static void getStarsPatternWithInnerLoop(int satirSayisi) {
        // Dış döngü: Her bir satırı oluşturmak için
        for (int i = 1; i < satirSayisi; i++) {
            //iç döngü : Satıra yıldızları yerleştirmek için
            for (int j = 1; j < i; j++) {
                //Yıldızları aynı satıra yazdır
                System.out.print("*");
            }
            // Satırı bitirip bir alt satıra geçmek için yeni satır karakteri
            System.out.println();


            System.out.println("----------");

        }
    }
}