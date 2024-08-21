package methods.java_8.lambda_expression_with_one_parameter;

public class LambdaTest {
    public static void main(String[] args) {

        FunctionalInterfaceWithOneParameter functionalInterfaceWithParameter1 = message -> System.out.println("Message 1 is : " + message);

        //parametre tipini belirterek yazma
        FunctionalInterfaceWithOneParameter functionalInterfaceWithParameter2 = (String message) -> System.out.println("Message 2 is : "+message);

        //lambda body ile yazarsak
        FunctionalInterfaceWithOneParameter functionalInterfaceWithParameter3 = (String message) -> {
            System.out.println("Message 3 is : " +message);
        };

        functionalInterfaceWithParameter1.message("hello lambda expression");
        functionalInterfaceWithParameter2.message("merhaba lambda ifadesi");
        functionalInterfaceWithParameter3.message("hi lambda ");
    }
}
