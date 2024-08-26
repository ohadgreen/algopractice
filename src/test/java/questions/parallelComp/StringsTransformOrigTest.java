package questions.parallelComp;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTransformOrigTest {

    private final StringsTransformOrig stringsTransformOrig = new StringsTransformOrig(List.of("hello", "world"));

    @Test
    void testTransform() {
        List<StringFunction> functions = List.of(
                new StringFunction() {
                    @Override
                    public String transform(String str) {
                        return str.toUpperCase();
                    }
                },
                new StringFunction() {
                    @Override
                    public String transform(String str) {
                        return str + "!";
                    }
                }
        );
        try {
            assertEquals(List.of("HELLO!", "WORLD!"), stringsTransformOrig.transform(functions));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}