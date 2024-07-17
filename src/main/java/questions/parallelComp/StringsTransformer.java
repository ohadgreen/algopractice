package questions.parallelComp;

public class StringsTransformer {

    public static String[] transform(String[] strings, StringFunction function) {
        String[] transformedStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            transformedStrings[i] = function.transform(strings[i]);
        }
        return transformedStrings;
    }

    public static String[] transformParallel(String[] strings, StringFunction function) {
        String[] transformedStrings = new String[strings.length];
        Thread[] threads = new Thread[strings.length];
        for (int i = 0; i < strings.length; i++) {
            int index = i;
            threads[i] = new Thread(() -> {
                transformedStrings[index] = function.transform(strings[index]);
            });
            threads[i].start();
        }
        for (int i = 0; i < strings.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return transformedStrings;
    }
}
