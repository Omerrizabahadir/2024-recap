package recap.algorithm;

public class MakeStarsPattern03 {
    /*
       *****
        ****
         ***
          **
           *   */

    public static void main(String[] args) {

        int n = 5;         // Yıldızların en fazla olduğu satır sayısı
        getStarPatternWithLoop(n);

    }

    public static void getStarPatternWithLoop(int n) {
        // Dış döngü: Satırları oluşturur
        for (int i = 0; i < n; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < i; j++) {
                System.out.print(" ");         // Satır başında boşluk
        }
            // Yıldızları yazdır
            for (int k = 0; k < n - i; k++){
                System.out.print("*");  // Satırda yıldızlar
            }
            System.out.println();
        }
    }
}
