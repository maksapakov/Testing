package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DoubledPairs {
    public static void main(String[] args) {

        int[] arr = new int[]{4,-2,2,-4};
        Solution solution = new Solution();
        System.out.println(solution.canReorderDoubled(arr));

    }

    static class Solution {
        public boolean canReorderDoubled(int[] arr) {
            // count[x] = the number of occurrences of x in A
            Map<Integer, Integer> count = new HashMap();
            for (int x: arr)
                count.put(x, count.getOrDefault(x, 0) + 1);

            // B = A as Integer[], sorted by absolute value
            Integer[] arrB = new Integer[arr.length];
            for (int i = 0; i < arr.length; ++i)
                arrB[i] = arr[i];
            Arrays.sort(arrB, Comparator.comparingInt(Math::abs));

            for (int x: arrB) {
                // If this can't be consumed, skip
                if (count.get(x) == 0) continue;
                // If this doesn't have a doubled partner, the answer is false
                if (count.getOrDefault(2*x, 0) <= 0) return false;

                // Write x, 2*x
                count.put(x, count.get(x) - 1);
                count.put(2*x, count.get(2*x) - 1);
            }

            // If we have written everything, the answer is true
            return true;
        }
    }
}
