package exercise.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LeastRecentUse implements CacheProvider {

    private final int capacity = 3;
    private final List<CacheElement> cachList = new LinkedList<>();
    private final Map<String, Integer> cacheMap = new HashMap<>();

    @Override
    public void set(String key, String value) {
        if (cachList.size() == capacity) {
            CacheElement removeElement = cachList.remove(0);
            cacheMap.remove(removeElement.getKey());
        }
        cachList.add(new CacheElement(key, value));
        cacheMap.put(key, cachList.size() - 1);

    }

    @Override
    public String get(String key) {
        if (cacheMap.containsKey(key)) {
            int index = cacheMap.get(key);
            CacheElement element = cachList.get(index);
            cachList.remove(index);
            cachList.add(element);
            return element.getValue();
        } else {
            return null;
        }
    }

    @Override
    public boolean containsKey(String key) {
        return cacheMap.containsKey(key);
    }

    @Override
    public int getSize() {
        return cachList.size();
    }

    @Override
    public void clear() {
        cachList.clear();
        cacheMap.clear();
    }
}
