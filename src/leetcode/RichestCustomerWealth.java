package leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        RichestCustomerWealthSolution solution = new RichestCustomerWealthSolution();
        System.out.println(solution.maximumWealth(accounts));
    }

    static class RichestCustomerWealthSolution {
        public int maximumWealth(int[][] accounts) {

            int colLength = accounts[0].length;
            int maxWealth = 0;
            int sum;

            for (int[] account : accounts) {
                sum = 0;
                for (int j = 0; j < colLength; j++) {
                    sum += account[j];
                }
                if (sum > maxWealth) {
                    maxWealth = sum;
                }
            }

            return maxWealth;
        }

    }
}
