package questions.hashmap;

import java.util.*;

public class InsertDeleteGetRandomDS implements GetRandomDS{

    private Map<Object, Integer>  myMap = new HashMap<>();
    private List myList = new ArrayList<>();
    private int currentSize = 0;

    @Override
    public boolean insert(Object object) {
        if (myMap.keySet().contains(object)) {
            return false; // object already exists
        }
        // add item to end of list, add to map
        myList.add(object);
        myMap.put(object, currentSize);
        currentSize ++;
        return true;
    }

    @Override
    public boolean delete(Object object) {
        if (!myMap.containsKey(object)) {
            return false; // object not exists
        }

        // replace the chosen object from list, replace it with last object, update map, update size
        Integer objectIndex = myMap.get(object);
        Object lastObject = myList.get(currentSize - 1);

        myList.set(objectIndex, lastObject);
        myMap.put(lastObject, objectIndex);
        myList.remove(currentSize - 1);
        myMap.remove(object);
        currentSize --;
        return true;
    }

    @Override
    public boolean search(Object object) {
        return myMap.keySet().contains(object);
    }

    @Override
    public Object getRandom() {
        if (currentSize > 0) {
            Random rand = new Random();
            int n = rand.nextInt(currentSize);
            return myList.get(n);
        }
        return null;
    }
}
