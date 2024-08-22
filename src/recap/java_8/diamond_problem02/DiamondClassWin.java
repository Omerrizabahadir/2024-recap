package recap.java_8.diamond_problem02;

public class DiamondClassWin extends  BaseClass implements BaseInterface{

    public static void main(String[] args) {
        new DiamondClassWin().message();
        // print BaseClass message..
        // cunku class win kurali vardir.
        // Yani ayni isimde 1'den fazla method varsa class'da bulunan method tercih edilir.
    }
}
