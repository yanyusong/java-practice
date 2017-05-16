package SingletonLesson;

/**
 * Created by mac on 2017/4/11.
 * 懒汉式
 */
public class Singleton1 {

    private static Singleton1 ourInstance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (ourInstance == null) {
            ourInstance = new Singleton1();
        }
        return ourInstance;
    }
}
