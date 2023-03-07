package leetcode;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {

        int num = 123;
        NumberOfStepsToReduceANumberToZeroSolution solution = new NumberOfStepsToReduceANumberToZeroSolution();
        System.out.println(solution.numberOfSteps(num));
    }

    static class NumberOfStepsToReduceANumberToZeroSolution {
        public int numberOfSteps(int num) {
            int steps = 0;
            while (num != 0) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num - 1;
                }
                ++steps;
            }

            return steps;
        }
    }
}
