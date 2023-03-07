package codewars;

public class YouReASquare {

    public static void main(String[] args) {
        System.out.println(Square.isSquare(-1));
    }

    public static class Square {
        public static boolean isSquare(int n) {
            return Math.sqrt(n) % 1 == 0;
/*
            if (n == 0) return true;
            if (n % Math.sqrt(n) == 0) {
                return true;
            } else return false; // fix me!
*/
        }
    }
}
