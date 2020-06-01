package questions.queue;

public interface Queue <T>{

    boolean add(T item); // if the item is already exist, return false

    T poll(); // return and remove the first item in the queue

    T peek(); // return the first item in the queue

    int size();
}
