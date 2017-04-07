package Lesson1;

/**
 * Created by mac on 2017/4/1.
 */
public class Presenter {

    public Presenter(View view) {
        view.setPresenter(this);
        System.out.println("presenter =" + this);
    }
}
