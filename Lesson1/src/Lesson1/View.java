package Lesson1;

/**
 * Created by mac on 2017/4/1.
 */
public class View {

    private Presenter presenter;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
        System.out.println("view.presenter = "+this.presenter);
    }
}
