package recap.algorithm;

import java.util.Arrays;

public class FindingMissingNumber03 {

    public static void main(String[] args) {
        FindingMissingNumber03 findingMissingNumber03 = new FindingMissingNumber03();

        int[] arr1 = {1, 2, 4, 5, 3, 7, 8};
        System.out.println("Arr 1 içinEksik Sayı : " + findingMissingNumber03.findMissingNumber(arr1));

        System.out.println("---------------------------------------------");

        int[] arr2 = {1, 2, 3, 5};
        System.out.println("Arr 2 için Eksik sayı : " + findingMissingNumber03.findMissingNumber(arr2));

        System.out.println("---------------------------------------------");

        int[] arr3 = {1, 2, 3, 5, 6, 7, 4, 9};
        System.out.println("Arr 3 için Eksik sayı : " + findingMissingNumber03.findMissingNumber(arr3));

    }

    public int findMissingNumber(int[] arr) {
        int N = arr.length + 1;                         //1 tane kayıp rakam var onu length(arrayin uzunluğuna) ekledik
        int realTotalSum = 0;                           //başlangıçta gerçek toplam 0

        //dizinin içindeki sayıların toplamını hesapla

        /* for (int i= 0;i<arr.length;i++) {
            realTotalSum += arr[i];
        }
        */

         /*FOR DÖNGÜSÜ İLE
        for (int num : arr) {
            realTotalSum += num;
        }
        */
        //   JAVA 8 İLE
        realTotalSum = Arrays.stream(arr).sum();

        // Beklenen toplamı hesapla
        int expectedSum = N * (N + 1) / 2;

        System.out.println("Beklenen Toplam : " + expectedSum);
        System.out.println("Gerçekleşen Toplam : " + realTotalSum);

        return expectedSum - realTotalSum;
    }
}
