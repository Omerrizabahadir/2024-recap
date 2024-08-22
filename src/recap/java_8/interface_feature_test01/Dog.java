package recap.java_8.interface_feature_test01;

public class Dog implements Animal {
    //Animal interface 'indeki default olan metotları OVERRİDE edebiliriz
    //override etmeseydik Animaldaki run metodu çalışırdı.Override ettiğimiz için Dog içindeki run() metodu çalışacak
    @Override
    public void run() {
        System.out.println("Dog is running!");
    }
}
