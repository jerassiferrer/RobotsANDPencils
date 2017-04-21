package com.mobile.jera.robotsandpencilsstore;

/**
 * Created by jera on 4/21/17.
 */

public interface BasePresenter <V extends BaseView>  {

    void attachView(V view);

    void detachView();
}
