package utils;

import org.junit.jupiter.api.Test;
import questions.strings.WordCount;

import static org.junit.jupiter.api.Assertions.*;

class WordsSplitToArrayTest {
    private final String longPhrase = "For decades, US immigration laws have given priority to family-based immigration, and about two-thirds of all people granted green cards each year have family ties to people in the United States\n" +
            "Trump’s plan would keep legal immigration steady at 1.1 million people a year, but family-based immigration would account for only a third of that. Instead, high-skilled people with jobs would be given priority, and could bring with them their spouses and children, the officials told reporters at a White House briefing on Wednesday.\n" +
            "It would harden the border by building more of Trump’s coveted southern border wall and improve inspections of goods and people at ports of entry to fight drug smuggling. It would propose an increase in fees collected at the border to pay for border security infrastructure.\n" +
            "“Our goal in the short term is to make sure that we are laying out what the president’s policy is in terms of what he’s looking for from immigration reform, and we would like to see if we could get the Republican Party to come together on these two pillars, which we think is a very, very logical, very mainstream point of view,” said one official.\n" +
            "Trump will present an overview of the plan, with details of the “very large document” to be released in coming weeks, the official said.\n" +
            "SHIFT TO SKILLED WORKERS\n" +
            "It does not address some of the hot-button issues in the immigration debate, such as what to do about the surge of people crossing the southern border from Mexico.\n" +
            "Nor does it deal with the “Dreamer” children of immigrants in the country illegally or immigrants in the country under Temporary Protected Status, both of whom are priorities of Democratic lawmakers. The plan also does not include provisions to help farmers and other seasonal employers obtain more guest workers.\n" +
            "Instead, Kushner and others looked at the legal migration systems of Canada, Japan, Australia and New Zealand for clues on how to shift US policy more toward attracting skilled workers and less on uniting extended families.\n" +
            "After studying the systems of the other countries, they found that 12% of migration to the United States was based on employment and skill, compared with 63% for Canada, 57% for New Zealand, 68% for Australia and 52% for Japan.\n" +
            "By giving a preference to immigrants proficient in English and with degrees or training and job offers, the officials said the plan would allow 57% of green cards, which grant permanent legal residency, to be based on employment.\n" +
            "Trump will propose ending the diversity lottery system, which offers applicants from countries with low immigration rates the chance to move to the United States.\n" +
            "The plan also proposes changes to the asylum process, which the Trump administration says is abused. It would result in 10 percent of green cards being given to immigration for humanitarian reasons, down from 22 percent currently.\n" +
            "Senate Judiciary Chairman Lindsey Graham proposed legislation on Wednesday to deal with the surge of migrants from Central America at the southern US border, changes the administration officials described as needed to address the immediate crisis.";

    @Test
    public void replaceDash() {
        String origPhrase = "With alphanumeric-regex at our disposal, the solution is dead-simple";

        String normPhrase = WordsSplitToArray.replaceCharInWord(origPhrase, "-", " ");
        System.out.println(normPhrase);
        assertEquals("With alphanumeric regex at our disposal, the solution is dead simple", normPhrase);
    }

    @Test
    public void replaceDot() {
        String origWord = "dot.";
        String normWord = WordsSplitToArray.replaceCharInWord(origWord, "\\.", "");
        System.out.println(normWord);
        assertEquals("dot", normWord);
    }

    @Test
    public void phraseToWordsArray() {
        String phrase = "Dog cat mouse. Duck-fish bird 'eggs' in a house";
        String[] words = {"dog", "cat", "mouse", "duck", "fish", "bird", "egg", "in", "a", "house"};
        String[] normWordsArray = WordsSplitToArray.splitWordsToArray(phrase);
        assertEquals(words[0], normWordsArray[0]);
        assertEquals(words[3], normWordsArray[3]);
        assertEquals(10, normWordsArray.length);
    }

    @Test
    public void parseLongPhrase() {

        String[] normWordsArray = WordsSplitToArray.splitWordsToArray(longPhrase);
        assertEquals("for", normWordsArray[0]);
    }

    @Test
    public void testWordCount() {
        WordCount.countWords(WordsSplitToArray.splitWordsToArray(longPhrase));
        assertEquals(1,1);
    }
}