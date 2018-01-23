/**
 * Created by Anton Mikhaylov on 23.01.2018.
 */
public class MySingleton {

    private static MySingleton instance;

    private final String name;

    private MySingleton(String name) {
        this.name = name;
    }

    public static MySingleton getInstance(String name) {

        synchronized (MySingleton.class) {
            if (instance == null) {
                instance = new MySingleton(name);
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

}
