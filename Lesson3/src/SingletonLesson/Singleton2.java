package SingletonLesson;

/**
 * Created by mac on 2017/4/11.
 * 线程锁
 */
public class Singleton2 {

    private static Singleton2 ourInstance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        synchronized (Singleton2.class) {
            if (ourInstance == null) {
                ourInstance = new Singleton2();
            }
        }
        return ourInstance;
    }
}
