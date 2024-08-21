package methods.java_8.interface_feature_test02;

public class ActionPerformer implements MyFunctionalInterface {

    //MyFunctionalInterface teki abstract metodu mutlaka @Override etmelisin.zaten altını çiziyor
    @Override
    public void performAction(String message) {
        System.out.println("Mesaj : " + message);
    }
    public static void main(String[] args) {

        ActionPerformer actionPerformer = new ActionPerformer();
        actionPerformer.performAction("Merhaba Dünya!");


        //Aynı işlemi lambda ifadesiyle yapalım
        MyFunctionalInterface myFunctionalInterface = (String message) -> {
            System.out.println("Lamda mesaj : "+message);
        };
        myFunctionalInterface.performAction("Merhaba Lambda!!");
    }
}


