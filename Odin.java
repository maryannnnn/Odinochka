package Patterns.Odinochka;

public class Odin {
    private static Odin ourInstance = new Odin();

    public static Odin getInstance() {
        return ourInstance;
    }

    private Odin() {
    }
}
