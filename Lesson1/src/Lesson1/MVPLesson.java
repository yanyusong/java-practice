package Lesson1;

/**
 * Created by mac on 2017/4/1.
 * 练习android开发中google sample的mvp构架中，V和P是怎么关联在一块的
 */
public class MVPLesson {

    public static void main(String[] args) {

        View view = new View();
        new Presenter(view);

    }


}
