package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        //nums = [2,7,11,15], target = 9
        int[] nums = new int[]{3, 2, 1, 7, 9, 4};
        int target = 6;
        TwoSumSolution solution = new TwoSumSolution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

    static class TwoSumSolution {
        public int[] twoSum(int[] nums, int target) {

            /*int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (j != i) {
                        sum = nums[i] + nums[j];
                        if (sum == target) {
                            return new int[]{i, j};
                        }
                    }
                }
            }
            return null;*/

            Map<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                hm.put(nums[i], i);
            }
            int[] arr = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int k = nums[i];
                if (k == target && hm.containsKey(0)) {
                    arr[0] = i;
                    arr[1] = hm.get(0);
                    break;
                } else if (hm.containsKey(target - k)) {
                    if (hm.get(target - k) > i) {
                        arr[0] = i;
                        arr[1] = hm.get(target - k);
                        break;
                    }
                }
            }
            return arr;
        }
    }
}