package questions.queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueueImpl implements Queue {
    private List myList = new ArrayList();
    private Set uniqObj = new HashSet();

    @Override
    public boolean add(Object item) {
        if (uniqObj.contains(item))
            return false;

        else {
            myList.add(item);
            uniqObj.add(item);
            return true;
        }
    }

    @Override
    public Object poll() {
        if (myList.size() > 0) {
            Object obj = myList.remove(0);
            uniqObj.remove(obj);
            return obj;
        }
        else {

            return null;
        }
    }

    @Override
    public Object peek() {
        if (myList.size() > 0) {
            return myList.get(0);
        }
        else
            return null;
    }

    @Override
    public int size() {
        return myList.size();
    }
}
