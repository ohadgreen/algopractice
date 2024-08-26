package exercise.singleton;

public class MySingleton3 {
    private String name;
    private static MySingleton3 instance;

    public MySingleton3(String name) {
        this.name = name;
    }

    public MySingleton3 getInstance(String name) {
        if (instance == null) {
            instance = new MySingleton3(name);
        }
        return instance;
    }
}
