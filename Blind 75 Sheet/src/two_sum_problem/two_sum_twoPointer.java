package two_sum_problem;

import java.util.Arrays;

public class two_sum_twoPointer {

    public static void main(String[] args) {

        int[] arr = new int[] {2,6,5,11,8};
        int size = arr.length;
        int target = 11;
        int[] result = twoSum(arr, size, target);
        System.out.println(Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Indexes are: "+ Arrays.toString(result));

    }

    private static int[] twoSum(int[] arr, int size, int target) {
        int[] result = new int[] {-1, -1};
        Arrays.sort(arr);
        int left = 0, right = size - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                result [0] = left;
                result [1] = right;
                return result;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
