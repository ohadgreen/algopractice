package exersize;

public class StringInString {

    // ABCDEFGBC
    // BC
    public static Integer findInString (String str1, String str2) {
        int shortStrLength = str2.length();
        int lastChar = str2.length();
        boolean charsMatch = false;

        for (int i = str1.length(); i >=0  ; i--) {
            for (int j = str2.length(); j >= 0 ; j--) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    charsMatch = true;
                }
            }

        }

        return 1;
    }
}
