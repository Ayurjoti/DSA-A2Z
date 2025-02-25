package two_sum_problem;

import java.util.HashMap;
import java.util.Map;

public class two_sum_hashing {


    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 11;
        int size = arr.length;
        String ans = twoSum(arr, size, target);
        System.out.println(ans);
    }

    private static String twoSum(int[] arr, int size, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int moreNeeded = target - arr[i];
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }
            mpp.put(arr[i],i);
        }
        return "NO";
    }

}
