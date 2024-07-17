package exercise.cache;

public interface CacheProvider {

    void set(String key, String value);
    String get(String key);

    boolean containsKey(String key);
    int getSize();

     void clear();
}
