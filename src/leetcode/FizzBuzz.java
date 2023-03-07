package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 20;
        FizzBuzzSolution solution = new FizzBuzzSolution();
        System.out.println(solution.fizzBuzz(n));
    }

    static class FizzBuzzSolution {
        public List<String> fizzBuzz(int n) {

            List<String> answer = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                String s = getF(i);
                answer.add(s);
            }

            return answer;
        }

        String getF(int n) {
            if (n % 3 == 0 && n % 5 == 0) {
                return "leetcode.FizzBuzz";
            } else if (n % 3 == 0) {
                return "Fizz";
            } else if (n % 5 == 0) {
                return "Buzz";
            }

            return Integer.toString(n);
        }
    }
}
