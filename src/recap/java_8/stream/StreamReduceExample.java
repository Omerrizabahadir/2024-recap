package recap.java_8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {

        List<Integer>numbers = Arrays.asList(1,2,3,4,5);
        sumNumbersWithReduce(numbers);

    }
    public static void sumNumbersWithReduce(List<Integer>numbers){
        int sum = numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println("Sum of array  : "+ sum);     // Çıktı: Sum: 15
    }
}
