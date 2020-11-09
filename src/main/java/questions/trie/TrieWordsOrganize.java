package questions.trie;

import java.util.ArrayList;
import java.util.List;

public class TrieWordsOrganize {

    private TrieNode trieRoot = new TrieNode(' ', false);
    private List<String> wordsList = new ArrayList<>();

    public void addWordToTrie(String word) {
        addLetterToTrie(word, 0, trieRoot);
    }

    private void addLetterToTrie(String letters, int charIndex, TrieNode trieNode) {
        char[] charArray = letters.toCharArray();
        Character nextChar = charArray[charIndex];
        boolean nextCharIsLast = (charArray.length == charIndex + 1);

        if (trieNode.getNextCharMap().keySet().contains(nextChar)) {
            TrieNode nextNode = trieNode.getNextCharMap().get(nextChar);
            if (nextCharIsLast) {
                nextNode.setWord(true);
            }
            else {
                addLetterToTrie(letters, charIndex + 1, nextNode);
            }
        }
        else {  // next char not exists
            TrieNode newTrieNode = new TrieNode(nextChar, nextCharIsLast);
            trieNode.getNextCharMap().put(nextChar, newTrieNode);
            if (!nextCharIsLast) {
                addLetterToTrie(letters, charIndex + 1, newTrieNode);
            }
        }
    }
    
    public List<String> getAllWordsFromTrie() {
        List<String> wordsList = new ArrayList<>();
        
        findWords("", trieRoot);
        return this.wordsList;
    }

    private void findWords(String chars, TrieNode trieNode) {
        String currentCharString = chars + trieNode.getLetter();
        if (trieNode.isWord()) {
            wordsList.add(currentCharString);
        }

        if (trieNode.getNextCharMap().size() > 0) {
            for(Character c : trieNode.getNextCharMap().keySet()) {
                TrieNode nextNode = trieNode.getNextCharMap().get(c);
                findWords(currentCharString, nextNode);
            }
        }
    }
}
