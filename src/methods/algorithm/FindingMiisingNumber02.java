package methods.algorithm;

public class FindingMiisingNumber02 {
    public static void main(String[] args) {
        FindingMiisingNumber02 findingMiisingNumber02 = new FindingMiisingNumber02();

        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int N = 8;
        int missingNumber = findingMiisingNumber02.findMissingNumber(arr, N);
        System.out.println("missing number : " + missingNumber);
    }

    public int findMissingNumber(int[] nums, int N) {
        for (int i = 1; i <= N; i++) {
            boolean isMissing = true;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    isMissing = false;
                    break;
                }
            }
            if (isMissing) {
                return i;
            }
        }
        return -1;
    }
}
