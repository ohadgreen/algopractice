package exercise.singleton;

public class MySingleton2 {
    private String name;
    private static boolean instanceExists;
    private static MySingleton2 myInstance;

    public static MySingleton2 getInstance (String name) {
        if (!instanceExists) {
            instanceExists = true;
            myInstance = new MySingleton2(name);
        }
        return myInstance;
    }

    private MySingleton2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
