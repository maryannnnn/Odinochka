package Patterns.Odinochka;

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    //Сначала проверьте, создается лн новый экземпляр, и если нет - ТОГДА
    // синхронизируйте фрагмент кода.
    //В этом случае синхронизация будет выполняться только при первом вызове.

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }

        }
        return uniqueInstance;
    }

    // Другие методы
}
