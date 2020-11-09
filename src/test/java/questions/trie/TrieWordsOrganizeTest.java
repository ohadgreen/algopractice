package questions.trie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrieWordsOrganizeTest {
    TrieWordsOrganize trieWordsOrganize = new TrieWordsOrganize();
    @Test
    void addWords() {
        trieWordsOrganize.addWordToTrie("go");
        trieWordsOrganize.addWordToTrie("get");
        trieWordsOrganize.addWordToTrie("good");
        trieWordsOrganize.addWordToTrie("goodness");
        trieWordsOrganize.addWordToTrie("goodies");
    }

    @Test
    void findWordsTest() {
        trieWordsOrganize.addWordToTrie("go");
        trieWordsOrganize.addWordToTrie("get");
        trieWordsOrganize.addWordToTrie("god");
        trieWordsOrganize.addWordToTrie("good");
        trieWordsOrganize.addWordToTrie("goodness");
        trieWordsOrganize.addWordToTrie("goodies");

        List<String> allWords = trieWordsOrganize.getAllWordsFromTrie();
        allWords.stream().forEach(word -> System.out.println(word));

    }


}