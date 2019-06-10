package questions.arrays;

import questions.model.SecondValue;

import java.util.ArrayList;
import java.util.List;

public class ValuesPerSecond {
    public static List<Double> calculateAvgPerSecond(SecondValue[] secondVals) {
        List<Double> avgList = new ArrayList<>();
        Integer prevRoundSecond = null;
        Integer secondValsCum = 0;
        Integer secondValsCount = 0;
        for (int i = 0; i < secondVals.length; i++) {
            Integer roundSecond = Math.round(secondVals[i].getSecond());
            if(roundSecond == prevRoundSecond) {
                secondValsCum += secondVals[i].getValue();
                secondValsCount ++;
            }
            else {
                if (secondValsCount > 0)
                    avgList.add( ((double)secondValsCum / secondValsCount));
                prevRoundSecond = roundSecond;
                secondValsCum = secondVals[i].getValue();
                secondValsCount = 1;
            }
        }

        if (secondValsCount > 0)
            avgList.add( ((double)secondValsCum / secondValsCount));

        return avgList;
    }

}
