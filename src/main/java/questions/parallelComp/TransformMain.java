package questions.parallelComp;

import com.sun.tools.javac.util.List;

public class TransformMain {

    public static void main(String[] args) {
        TransformMain transformMain = new TransformMain();
        transformMain.transform();
    }

    private void transform() {
        List<String> strings = List.of("cat", "dog");
//        StringsTransformOrig stringsTransformOrig = new StringsTransformOrig(strings);
        StringsTransform1 stringsTransform1 = new StringsTransform1(strings);
        StringFunction uppercaseString = new UppercaseString();
//        StringFunction reverseString = new ReverseString();

        StringFunction addSpaces = new StringFunction() {
            @Override
            public String transform(String str) {
                return  str.replaceAll("", " ").trim();
            }
        };

        List<StringFunction> functions = List.of(uppercaseString, addSpaces);

        try {
            System.out.println(stringsTransform1.transform(functions));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
