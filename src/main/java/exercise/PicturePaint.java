package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PicturePaint {

    public static int groupCount(List<String> picture) {
        int length = picture.get(0).length();
        int height = picture.size();

        Map<Integer, Integer> cellGroupMap = new HashMap<>();
        Map<Integer, List<Integer>> groupCellListMap = new HashMap<>();

        char[][] pictureArray = createPictureArray(picture, height, length);

        int maxGroupNum = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                int cellIndex = i * length + j;
                char cellColor = pictureArray[i][j];

                int leftCellGroup = 0;
                int aboveCellGroup = 0;

                System.out.println(cellIndex + ":" + cellColor);

                // check left
                if (j > 0) {
                    if (pictureArray[i][j - 1] == cellColor) {
                        leftCellGroup = cellGroupMap.get(cellIndex - 1);
                    }
                }// check above
                if (i > 0) {
                    if (pictureArray[i - 1][j] == cellColor) {
                        aboveCellGroup = cellGroupMap.get(cellIndex - length);
                    }
                }

                if (leftCellGroup == 0 && aboveCellGroup == 0) { // new group
                    maxGroupNum ++;
//                    int newGroupNumber = groupCellListMap.size() + 1;
                    cellGroupMap.put(cellIndex, maxGroupNum);
                    List<Integer> groupCellList = new ArrayList<>();
                    groupCellList.add(cellIndex);
                    groupCellListMap.put(maxGroupNum, groupCellList);
                }

                if (leftCellGroup > 0 && (aboveCellGroup == 0 || aboveCellGroup == leftCellGroup)) { // add to left cell group
                    cellGroupMap.put(cellIndex, leftCellGroup);
                    List<Integer> groupCellList = groupCellListMap.get(leftCellGroup);
                    groupCellList.add(cellIndex);
                    groupCellListMap.put(leftCellGroup, groupCellList);
                }

                if (aboveCellGroup > 0 && leftCellGroup == 0) { // add to above cell group
                    cellGroupMap.put(cellIndex, aboveCellGroup);
                    List<Integer> groupCellList = groupCellListMap.get(aboveCellGroup);
                    groupCellList.add(cellIndex);
                    groupCellListMap.put(aboveCellGroup, groupCellList);
                }

                if (leftCellGroup > 0 && aboveCellGroup > 0 && leftCellGroup != aboveCellGroup) { // unite two existing groups
                    cellGroupMap.put(cellIndex, leftCellGroup);

                    // concat groups
                    List<Integer> aboveCellGroupList = groupCellListMap.get(aboveCellGroup);
                    List<Integer> uniteCellList = Stream.concat(groupCellListMap.get(leftCellGroup).stream(), aboveCellGroupList.stream()).collect(Collectors.toList());
                    uniteCellList.add(cellIndex);
                    groupCellListMap.put(leftCellGroup, uniteCellList);
                    groupCellListMap.remove(aboveCellGroup);
                    // update cellGroupMap
                    int finalLeftCellGroup = leftCellGroup;
                    aboveCellGroupList.stream()
                            .forEach(cell -> cellGroupMap.put(cell, finalLeftCellGroup));
                }
            }

        }
        return groupCellListMap.size();
    }

    public static int strokesRequired(List<String> picture) {
        // Write your code here

        int strokes = 1;

        int length = picture.get(0).length();
        int height = picture.size();

        Map<Integer, Boolean> paintIndicationMap = paintIndicationMapInit(picture, height, length);
        char[][] pictureArray = createPictureArray(picture, height, length);

        char currentChar = '*';
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < length - 1; j++) {
                currentChar = pictureArray[i][j];

                int currentIndex = i * length + j;
                Boolean isPainted = paintIndicationMap.get(currentIndex);
                if (isPainted) {
                    if(pictureArray[i][j + 1] == currentChar) {
                        int rightNeighbourIndex = i * length + j + 1;
                        paintIndicationMap.put(rightNeighbourIndex, true);
                    }
                    if(i < height && pictureArray[i + 1][j] == currentChar) {
                        int lowNeighbourIndex = (i + 1) * length + j;
                        paintIndicationMap.put(lowNeighbourIndex, true);
                    }

                }
                else {
                    paintIndicationMap.put(currentIndex, true);
                    strokes ++;
                }
            }
        }

        return strokes;

    }

    protected static char[][] createPictureArray(List<String> rawPicture, int height, int length) {
        char[][] picArray = new char[length][height];

        for (int i = 0; i < height; i++) {

            String pictureLine = rawPicture.get(i);
            System.out.println("pictureLine = " + pictureLine);
            for (int j = 0; j < length; j++) {
                picArray[i][j] = pictureLine.charAt(j);
            }
        }

        return picArray;
    }

    protected static Map<Integer, Boolean> paintIndicationMapInit(List<String> rawPicture, int height, int length) {
        Map<Integer, Boolean> paintIndicationMap = new HashMap<>();

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < length; j++) {
                int index = i * length + j;
                paintIndicationMap.put(index, false);
            }
        }
        return paintIndicationMap;
    }
}
