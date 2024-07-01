package exercise.singleton;

public class MySingleton {

    private static MySingleton instance;
    private String name;

    private MySingleton(String name) {
        this.name = name;
    }

    public synchronized static MySingleton getInstance(String name) {
        if (instance == null) {
            instance = new MySingleton(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

}
