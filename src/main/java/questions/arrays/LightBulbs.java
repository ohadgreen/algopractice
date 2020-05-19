package questions.arrays;

import java.util.HashMap;
import java.util.Map;

public class LightBulbs {

    public static int lightCount(int[] A) {
        int lightCount = 0;
        boolean gapsExist = false;

        boolean[] lights = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            gapsExist = false;
            lights[A[i] - 1] = true;
            for (int j = 0; j <= i; j++) {
                if (!lights[j]) {
                    gapsExist = true;
                }
            }
            if (!gapsExist) {
                lightCount ++;
            }
        }

        return lightCount;
    }

}
