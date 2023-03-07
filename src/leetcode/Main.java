package leetcode;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[] {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        AlienDictionary alienDictionary = new AlienDictionary();
        System.out.println(alienDictionary.isAlienSorted(words, order));
    }
}