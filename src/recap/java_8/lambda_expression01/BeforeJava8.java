package recap.java_8.lambda_expression01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeforeJava8 {
    //Before Jva 8 without lambda expression
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("b1");
        list.add("b2");
        list.add("c1");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        for (String item : list){
            System.out.println(item);
        }
    }

}
