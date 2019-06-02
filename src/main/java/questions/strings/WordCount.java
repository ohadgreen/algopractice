package questions.strings;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void countWords (String[] wordsArray) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsMap.containsKey(wordsArray[i])) {
                wordsMap.put(wordsArray[i], wordsMap.get(wordsArray[i]) + 1);
            }
            else {
                wordsMap.put(wordsArray[i], 1);
            }
        }
        printMap(wordsMap);
    }

    public static void printMap (Map<String, Integer> map) {
        map.keySet().forEach(k -> System.out.println(k + ": " + map.get(k)));
    }
}
