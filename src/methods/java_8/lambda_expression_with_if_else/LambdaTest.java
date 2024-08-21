package methods.java_8.lambda_expression_with_if_else;

public class LambdaTest {

    public static void main(String[] args) {

        //if ve else te süslü parantez {} kullanılmayabilir
        LambdaUsingWithIfElse lambdaUsingWithIfElse1 = (int number)->{
            if (number % 2 == 0)
                return "even";
            else return "odd";
        };

        //if ve else te süslü parantez {} de kullanılabilir
        LambdaUsingWithIfElse lambdaUsingWithIfElse2 = (int number)->{
            if (number % 2 == 0){
                return "even";
            } else{
                return "odd";
            }
        };

        System.out.println("Number is : "+lambdaUsingWithIfElse1.intKind(20));
        System.out.println("Number is : "+lambdaUsingWithIfElse2.intKind(21));
    }
}
