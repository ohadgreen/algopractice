package questions.parallelComp;

import java.util.ArrayList;
import java.util.List;

public class StringsTransform1 {
    private List<String> data = new ArrayList<>();
    public StringsTransform1(List<String> startingData) {
        this.data = startingData;
    }

    private void forEach(StringFunction function) {
        List<String> newData = new ArrayList<String>();
        for (String str : data) {
            newData.add(function.transform(str));
        }
        data = newData;
    }

    public List<String> transform(List<StringFunction> functions) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (final StringFunction f : functions) {
            Thread thread = new Thread(() -> forEach(f));
            threads.add(thread);
            thread.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        return data;
    }
}
