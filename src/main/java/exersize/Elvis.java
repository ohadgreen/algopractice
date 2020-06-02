package exersize;

public  class Elvis {

    private String name;
    private static Elvis elvis;

    private Elvis(String name) {
        this.name = name;
    }

    public static Elvis createObject (String name) {
        if (elvis != null) {
            // create new instance
            elvis = new Elvis(name);
        }
        return elvis;
    }
}
