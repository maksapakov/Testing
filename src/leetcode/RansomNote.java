package leetcode;

public class RansomNote {
    public static void main(String[] args) {

        String ransomNote = "aaf";
        String magazine = "acabf";
        RansomNoteSolution solution = new RansomNoteSolution();
        System.out.println(solution.canConstruct(ransomNote, magazine));
    }

    static class RansomNoteSolution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()) return false;
            int[] alphabets_count = new int[26];

            for (char c :
                    magazine.toCharArray()) {
                alphabets_count[c - 'a']++;
            }
            for (char c :
                    ransomNote.toCharArray()) {
                if (alphabets_count[c - 'a'] == 0) return false;
                alphabets_count[c - 'a']--;
            }
            return true;
        }
    }

}
