package recap.java_8.lambda_expression_with_more_parameters;

public class LambdaExpressionWithMoreParameters {

    public static void main(String[] args) {
        //Parametre tipi belirtmeden yazabilirsin
        FunctionalInterfaceWithMoreParameters functionalInterfaceWithMoreParameters1 = ((number1, number2) -> System.out.println(" Plus is : " + (number1 + number2)));

        //Parametre tipi belirtmeden yazabilirsin
        FunctionalInterfaceWithMoreParameters functionalInterfaceWithMoreParameters2 = (int number1, int number2) -> System.out.println(" Plus is : " + (number1 + number2));


        // lambda body ile yazacak olursak,
        FunctionalInterfaceWithMoreParameters functionalInterfaceWithMoreParameters3 = (int number1,int number2) ->{
            System.out.println(" Plus is : " + (number1 + number2));
        };


                functionalInterfaceWithMoreParameters1.plus(10, 12);
                functionalInterfaceWithMoreParameters2.plus(1, 3);
                functionalInterfaceWithMoreParameters3.plus(2,5);


    }
}
