package SingletonLesson;

/**
 * Created by mac on 2017/4/11.
 * 饿汉式
 */
public class Singleton0 {

    private static Singleton0 ourInstance = new Singleton0();

    private Singleton0() {
    }

    public static Singleton0 getInstance() {
        return ourInstance;
    }
}
