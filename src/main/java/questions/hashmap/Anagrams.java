package questions.hashmap;

import java.util.*;

public class Anagrams {
    public static Map<String, Set<String>> findAnagramsFromWordsArray(String[] words) {
        Map<String, Set<String>> anagramMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String anagram = sortWordToChars(words[i]);
            if (anagramMap.containsKey(anagram)){
                Set<String> wordSet = anagramMap.get(anagram);
                wordSet.add(words[i]);
                anagramMap.put(anagram, wordSet);
            } else {
                Set<String> wordSet = new HashSet<>();
                wordSet.add(words[i]);
                anagramMap.put(anagram, wordSet);
            }
        }

        return anagramMap;
    }

    protected static String sortWordToChars(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
