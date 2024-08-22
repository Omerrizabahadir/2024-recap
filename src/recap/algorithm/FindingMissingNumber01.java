package recap.algorithm;

import java.util.Arrays;

public class FindingMissingNumber01 {

    /*
    Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
    Output: 5
    Explanation: Here the size of the array is 8, so the range will be [1, 8].
    The missing number between 1 to 8 is 5

    Input: arr[] = {1, 2, 3, 5}, N = 5
    Output: 4
    Explanation: Here the size of the array is 4, so the range will be [1, 5].
    The missing number between 1 to 5 is 4
    */


    public static void main(String[] args) {


        FindingMissingNumber01 findingMissingNumber = new FindingMissingNumber01();

        int [] arr = {1, 2, 4, 6, 3, 7, 8};
        Arrays.sort(arr);
        int N = 8;

        int missingNumber = findingMissingNumber.findMissingNumber(arr,N);
        System.out.println("Missing number is : "+missingNumber);

    }

    public int findMissingNumber(int[] arr, int N){
        for (int i=0;i<arr.length; i++){
            if (arr[i] !=i+1){
                return i+1;
            }
        }
        return N;
    }

    }
