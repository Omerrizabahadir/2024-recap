package methods;

import static methods.Method02.divide;

public class Method01 {

    public static void main(String[] args) {
        //static sum() metodu için
        System.out.println("sum : n1 + n2 = "+sum(10,2));

        //static olmayan substract() metodu için
        Method01 method01 = new Method01();
        System.out.println("substraction : n3 - n4 = "+method01.substract(2,8));

        //MULTİPLY() metodu static değil mutlaka new ile üretmelisin
        Method02 method02 = new Method02();
        System.out.println("multiply : n5 * n6 = " + method02.multiply(3,6));

        //Method2 sınıfındaki bölme metounu static OLD. için direkt çağırırsın divide(); veye  önce sınıf adı sonra metod ile çağırırsın
        System.out.println("divide : n7 / n8 = " + divide(34,4));
        //System.out.println("divide : n7 / n8 = " + Method02.divide(34,4));


        System.out.println("---------------------------------------");

        //şu şekildede kullanabiliriz.
        /* variable1-->metodlardaki 1. parametreyi alır,
           variable2-->metodlardaki 2. parametreyi alır. örnek aşağıda
         */
        int variable1 = 20;
        int variable2 = 10;
        //static metodu

        int sumResult = sum(variable1,variable2);                   // int sumResult = sum(20,10); -->buda olur.bunu yaparsan yukarda tanımlamazsın
        System.out.println("sumResult : "+sumResult);

        //static olmayan metod için
        int substractResult = method01.substract(variable1,variable2);
        System.out.println("substractResult : "+substractResult);

        //Method02 sınıfındakilerden static olmayan metod için. tekrar üretmem yukarda new ile üretmiştik
        int multiplyResult = method02.multiply(variable1,variable2);
        System.out.println("multiply : "+multiplyResult);

        //Method02 sınıfındakilerden static olan metod için.direkt metodu ile--> divide() veye Sınıfının ismiyle metodunu çağır
        double divideResult = divide(variable1,variable2);
        System.out.println("divideResult : "+ divide(variable1,variable2));
        //System.out.println("divideResult : "+ Method02.divide(variable1,variable2));


    }
    //"static" kullandığımızda ayrıca nesne üretmeyecez. Direkt metodu çağırmamız yeterli
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
    //"static" kullanmadığımızda metodu çağırmamız için mutlaka nesne üretmeliyiz. main metotta
    public int substract(int n3, int n4) {
        return n3 - n4;
    }
}
