package questions.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private char letter;
    private boolean isWord;
    private Map<Character, TrieNode> nextCharMap = new HashMap<>();

    public TrieNode(char letter, boolean isWord) {
        this.letter = letter;
        this.isWord = isWord;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public Map<Character, TrieNode> getNextCharMap() {
        return nextCharMap;
    }

    public void setNextCharMap(Map<Character, TrieNode> nextCharMap) {
        this.nextCharMap = nextCharMap;
    }
}
