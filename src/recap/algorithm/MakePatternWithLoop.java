package recap.algorithm;

public class MakePatternWithLoop {

    /*

     *
     **
     ***
     ****
     *****

     */
    public static void main(String[] args) {

        int satirSayisi = 5;

        // Dış döngü: Her bir satırı oluşturmak için
        for (int i = 1; i <= satirSayisi; i++) {
            //iç döngü : Satıra yıldızları yerleştirmek için
            for (int j = 1; j <= i; j++) {
                //Yıldızları aynı satıra yazdır
                System.out.print("*");
            }
            // Satırı bitirip bir alt satıra geçmek için yeni satır karakteri
            System.out.println();
        }
    }
}