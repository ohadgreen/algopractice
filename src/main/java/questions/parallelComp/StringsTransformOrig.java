package questions.parallelComp;

import java.util.ArrayList;
import java.util.List;

public class StringsTransformOrig {
    private List<String> data = new ArrayList<>();
    public StringsTransformOrig(List<String> startingData) {
        this.data = startingData;
    }

    private void forEach(StringFunction function) {
        List<String> newData = new ArrayList<String>();
        for (String str : data) {
            newData.add(function.transform(str));
        }
        data = newData;
    }

    public List<String> transform(List<StringFunction> functions)
            throws InterruptedException {
        List<Thread> threads = new ArrayList<Thread>();
        for (final StringFunction f : functions) {
            threads.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    forEach(f);
                }}));
        }
        for (Thread t : threads) {
            t.join();
        }
        return data;
    }

}
