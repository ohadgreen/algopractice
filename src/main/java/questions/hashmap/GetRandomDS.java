package questions.hashmap;

public interface GetRandomDS<T> {

    boolean insert(T object);

    boolean delete(T object);

    boolean search(T object);

    T getRandom();

}
