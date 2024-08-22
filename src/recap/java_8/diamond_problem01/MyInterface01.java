package recap.java_8.diamond_problem01;

public interface MyInterface01 {
    /*default metotları Override etmek zorunda değiliz.
    Ancak aynı isimde farklı interface'lerde default metotlar varsa DIAMOND PROBLEM ortaya çıkıyor.
    o zaman default metot olsa bile bunlarıda Override etmek zorundayız.
     */
public default void defaultMethod(){
    System.out.println("MyInterface 01 defaultMethod");

}
    public abstract void test();
}
