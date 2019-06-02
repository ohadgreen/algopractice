package utils;

import java.util.regex.Pattern;

public class WordsSplitToArray {
    public static String[] splitWordsToArray(String wordsPhrase) {
        String dashRemoved = replaceCharInWord(wordsPhrase, "-", " ");
        String[] wordsArray = dashRemoved.split("\\s+");
        String[] normWordsArray = new String[wordsArray.length];
        for (int i = 0; i < wordsArray.length; i++) {
            String lowerCaseWord = toLowerCase(wordsArray[i]);
            String normWord = normalizeWord(lowerCaseWord);
//            System.out.println(normWord);
            normWordsArray[i] = normWord;
        }
        return normWordsArray;
    }

    private static String normalizeWord(String origWord) {
        String dotRemoved = replaceCharInWord(origWord, "\\.", "");
        String commaRemoved = replaceCharInWord(dotRemoved, ",", "");
        String ticRemoved = replaceCharInWord(commaRemoved, "'", "");
        return ticRemoved;
    }

    private static String toLowerCase(String origWord) {
        return origWord.toLowerCase();
    }

    private static String removeNonLetterChars(String origWord) {
        String onlyLettersRegex = "[a-zA-Z]+";
        Pattern.matches(onlyLettersRegex, origWord);

        return origWord.toLowerCase();
    }

    protected static boolean matchRegex(String regex, String word) {
        try {
            return Pattern.matches(regex, word);
        } catch (Exception e){
        System.out.println(e);
        return false;
        }
    }

    protected static String replaceCharInWord (String origWord, String charToRemove, String charInstead) {
        try {
           return origWord.replaceAll(charToRemove, charInstead);
        } catch (Exception e){
            System.out.println("cannot replace " + origWord + " " + charToRemove + " to " + charInstead);
            return origWord;
        }
    }
}
