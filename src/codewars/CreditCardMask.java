package codewars;

import java.util.Arrays;

public class CreditCardMask {
    public static void main(String[] args) {
        String s = "123456789";
        System.out.println(Maskify.maskify(s));
    }

    public static class Maskify {
        public static String maskify(String str) {
            char[] charStr = str.toCharArray();
            for( int i = 0; i < charStr.length - 4; i++ ) {
                charStr[i] = '#';
            }
            return new String(charStr);
            /*switch (str.length()) {
                case (0) -> {
                    return "";
                }
                case (1 | 2 | 3 | 4) -> {
                    return str;
                }
                default -> {
                    for (int i = 0; i < str.length() - 4; i++) {
                        charStr[i] = '#';
                    }
                    return new String(charStr);
                }
            }*/
        }
    }

}
