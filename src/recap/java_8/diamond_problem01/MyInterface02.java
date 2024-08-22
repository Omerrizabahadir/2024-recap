package recap.java_8.diamond_problem01;

public interface MyInterface02 {

    public default void defaultMethod(){
        System.out.println("MyInterface 02 defaultMethod");
    }

    //abstract metod mutlaka başka sınıftan Override edilmeli
    public abstract void test();
}
