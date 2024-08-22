package recap.java_8.lambda_expression01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaUsingAfterJava8 {
    //Lambda expression is started to use after java 8
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("b1");
        list.add("c2");
        list.add("c1");

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        for (String item : list){
            System.out.println(item);
        }
    }


}