package recap.java_8.interface_feature_test01;


public interface Animal {
    //default olan metotlar başka sınıftan Override edilebilir
    public default void eat(){
        System.out.println("Animal is eating");
    }
    public default void run(){
        System.out.println("Animal ia running");
    }
    //default olmayan metotlar Override edilemez
    public static void breathe(){
        System.out.println("Animal is breathing");
    }

}
