package recap.algorithm;

/*
Her bir tamsayının 0 ila m-1 aralığında ve m > n olduğu,
n farklı tamsayıdan oluşan sıralanmış bir dizi verildiğinde .
Dizide eksik olan en küçük sayıyı bulun.

Örnekler:

Giriş: {0, 1, 2, 6, 9}, n = 5, m = 10
 Çıkış: 3 Giriş: {4, 5, 10, 11}, n = 4, m = 12
 Çıkış: 0 Giriş: {0 , 1, 2, 3}, n = 4, m = 5
 Çıkış: 4 Giriş: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
 Çıkış: 8

 */
public class FindSmallestMissingNumber {

    public static void main(String[] args) {
        FindSmallestMissingNumber findSmallestMissingNumber = new FindSmallestMissingNumber();

        int[] arr1 = {0, 1, 2, 6, 9};
        System.out.println("for arr 1  : the smallest missing number is : " + findSmallestMissingNumber.findTheSmallestMissingNumber(arr1, 5, 10));

        int[] arr2 = {4, 5, 10, 11};
        System.out.println("for arr 2  : the smallest missing number is : " + findSmallestMissingNumber.findTheSmallestMissingNumber(arr2, 4, 12));

        int[] arr3 = {0, 1, 2, 3};
        System.out.println("for arr 3  : the smallest missing number is : " + findSmallestMissingNumber.findTheSmallestMissingNumber(arr3, 4, 5));

        int[] arr4 = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println("for arr 4  : the smallest missing number is : " + findSmallestMissingNumber.findTheSmallestMissingNumber(arr4, 9, 11));
    }

    //n=dizinin eleman sayısı, m=n den büyük ve dizinin son elemanı
    public int findTheSmallestMissingNumber(int[] arr, int n, int m) {
        // Eğer dizinin ilk elemanı 0'dan büyükse, eksik olan en küçük sayı 0'dır
        if (arr[0] > 0) {
            return 0;
        }
        //Şimdi 0'dan sonraki sayılar için aradaki farkı kontrol et
        for (int i = 0; i < n - 1; i++) {
            //Eğer iki ardışık sayı arasındaki fark 1 den büyükse, eksik olan sayıyı dön
            if (arr[i + 1] - arr[i] > 1) {                  //arr[i + 1] - arr[i]-->iki ardışık elaman arasındaki farkı hesaplar.Eğer bu fark 1'den büyükse (> 1), bu, iki ardışık eleman arasında en az bir sayının eksik olduğu anlamına gelir.
                return arr[i]+1;
            }
        }
        // Dizinin son elemanından sonra eksik sayı olup olmadığını kontrol et
        if (arr[n - 1] < m - 1) {
            return arr[n - 1] + 1;
        }
        // Eğer tüm sayılar ve aralıklar kontrol edildiyse ve eksik sayı bulunamadıysa, m-1'dir
        return m - 1;
    }
}
