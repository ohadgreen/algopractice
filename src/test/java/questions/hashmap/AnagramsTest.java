package questions.hashmap;

import org.junit.jupiter.api.Test;
import questions.strings.Anagram;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    private final Anagram anagram = new Anagram();

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

    @Test
    void buildCharMapTest() {
        String str1 = "CATA";
        String str2 = "ACTA";
        String str3 = "TCAA";

        Map<Character, Integer> charactersMap = anagram.buildCharactersMap(str1);
        charactersMap.entrySet()
                .forEach(System.out::println);

        assertEquals(2, charactersMap.get('A'));
        System.out.println();

        Map<Character, Integer> charactersMap2 = anagram.buildCharactersMap(str2);
        charactersMap.entrySet()
                .forEach(System.out::println);

        assertEquals(2, charactersMap2.get('A'));
        assertEquals(charactersMap, charactersMap2);
        System.out.println();

        Map<Character, Integer> charactersMap3 = anagram.buildCharactersMap(str3);
        charactersMap3.entrySet()
                .forEach(System.out::println);

//        assertNotEquals(charactersMap, charactersMap3);
    }


}