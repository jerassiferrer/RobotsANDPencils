package com.mobile.jera.robotsandpencilsstore;


import java.util.Set;

/**
 * Created by jera on 4/21/17.
 */

public interface MainContract {

    interface View extends BaseView {
        void showData(Set<Comment> comments);
    }

    interface Presenter extends BasePresenter<View> {
        void saveComment(Comment comment);
    }
}
