package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PicturePaintTest {

    @Test
    void groupCountTest3by3() {
        List<String> picLines = new ArrayList<>();
        picLines.add("aab");
        picLines.add("aab");
        picLines.add("aac");
        int groupCountResult = PicturePaint.groupCount(picLines);
        assertEquals(3, groupCountResult);
    }

    @Test
    void groupCountUniteGroupTest() {
        List<String> picLines = new ArrayList<>();
        picLines.add("rbrr");
        picLines.add("rrrg");
        picLines.add("gggg");
        picLines.add("ggrr");
        int groupCountResult = PicturePaint.groupCount(picLines);
        assertEquals(4, groupCountResult);
    }


    @Test
    void createArrayTest() {
        List<String> picLines = new ArrayList<>();
        picLines.add("aaaba");
        picLines.add("aaaba");
        picLines.add("aaaba");

        char[][] pictureArray = PicturePaint.createPictureArray(picLines, 3, 3);

        System.out.println("pictureArray = " + pictureArray);

        char c = pictureArray[2][2];
        assertEquals('a', c);
    }

    @Test
    void mapInitTest() {
        List<String> picLines = new ArrayList<>();
        picLines.add("aab");
        picLines.add("aab");
        picLines.add("aac");
        picLines.add("aac");

        Map<Integer, Boolean> integerBooleanMap = PicturePaint.paintIndicationMapInit(picLines, 3, 4);
        System.out.println(integerBooleanMap);
    }

    @Test
    void strokesCount() {
        List<String> picLines = new ArrayList<>();
        picLines.add("aab");
        picLines.add("aab");
        picLines.add("aac");

        PicturePaint.strokesRequired(picLines);
    }

    @Test
    void emptyMapSize() {
        Map<Integer, String> testMap = new HashMap<>();
        System.out.println("new map size: " + testMap.size());

    }

}