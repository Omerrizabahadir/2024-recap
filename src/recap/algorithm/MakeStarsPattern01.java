package recap.algorithm;

public class MakeStarsPattern01 {

    /*

     *
     **
     ***
     ****
     *****

     */
    public static void main(String[] args) {

        int satirSayisi = 5;

        System.out.println("iç döndü kullanarak yıldız deseni yazdırma : ");
        getStarsPatternInnerWithLoop(satirSayisi);

        System.out.println("-----------");

        System.out.println("iç döngü olmadan yıldız deseni yazdırma : ");
        getStarsPatternWithoutInnerLoop(satirSayisi);

    }
    public static void getStarsPatternInnerWithLoop(int satirSayisi){

        // Dış döngü: Her bir satırı oluşturmak için
        for (int i = 0; i < satirSayisi; i++) {
            //iç döngü : Satıra yıldızları yerleştirmek için
            for (int j = 0; j <= i; j++) {
                //Yıldızları aynı satıra yazdır
                System.out.print("*");
            }
            // Satırı bitirip bir alt satıra geçmek için yeni satır karakteri
            System.out.println();
        }
    }
    public static void getStarsPatternWithoutInnerLoop(int satirSayisi){
        // Dış döngü: Her bir satırı oluşturmak için
        for (int i = 1; i <= satirSayisi; i++) {

           //boşluk yok bu desnde

            //Yıldızları yazdırma
            System.out.print("*".repeat(i));

            // Satırı bitirip bir alt satıra geçmek için yeni satır karakteri
            System.out.println();
        }
    }
}