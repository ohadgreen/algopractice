package questions.hashmap;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    @Test
    void sortWordTest() {
        String adam = "adam";
        String sortedWord = Anagrams.sortWordToChars(adam);
        System.out.println("sortedWord = " + sortedWord);
        assertEquals("aadm", sortedWord);
    }

    @Test
    void findAnagramsTest() {
        String[] words = {"adam", "mada", "cat", "act", "tca", "xxx"};
        Map<String, Set<String>> anagramsMap = Anagrams.findAnagramsFromWordsArray(words);
        anagramsMap.entrySet().stream()
                .forEach(anagram -> {
                    System.out.println(anagram);
                });

    }
}