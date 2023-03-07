package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {

        int x = 123211;
        System.out.println(new PalindromeNumberSolution().isPalindrome(x));
    }

    static class PalindromeNumberSolution {

        public boolean isPalindrome(int x) {

            String s = String.valueOf(x);
            int i = 0;
            int j = s.length() - 1;

            while (i <= j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }

}
