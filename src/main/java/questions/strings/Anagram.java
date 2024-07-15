package questions.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    // Input = "CAT", "ACT"
    // Output = boolean

    public boolean solve(String str1, String str2) {
        Map<Character, Integer> charMap = new HashMap<>();
        boolean isAnagram = false;

        for (int i = 0; i < str1.length(); i++) {
            if (charMap.keySet().contains(str1.charAt(i))) {
                charMap.put(str1.charAt(i), charMap.get(str1.charAt(i)) + 1);
            }
            else {
                charMap.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str2.length() ; i++) {
            char aChar = str2.charAt(i);

            if (charMap.keySet().contains(aChar)) {
                Integer charCount = charMap.get(aChar);
                if (charCount > 1) {
                    charCount --;
                    charMap.put(aChar, charCount);
                }
                if (charCount == 1) {
                    charMap.remove(aChar);
                }
            }
            else
                break;
        }

        if (charMap.keySet().size() > 0) {
            isAnagram = true;
        }
        return isAnagram;
    }

    public Map<Character, Integer> buildCharactersMap(String word) {
        Map<Character, Integer> charsMap = new HashMap<>();

        for (char myChar : word.toCharArray()) {
            charsMap.putIfAbsent(myChar, 0);
            charsMap.put(myChar, charsMap.get(myChar) + 1);
        }

        return charsMap;
    }




    // C1A1T1
    // Input = {"CAT", "ACT", "STAR", "ADD", "ARTS", "DAD", "RAT", "RAT"}
    // Output = {{"CAT", "ACT"}, {"STAR", "ARTS"}, {"ADD", "DAD"}, {"RAT"}}
}
