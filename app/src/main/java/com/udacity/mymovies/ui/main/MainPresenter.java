package com.udacity.mymovies.ui.main;

import com.udacity.mymovies.MoviesApplication;
import com.udacity.mymovies.contract.MainContract;
import com.udacity.mymovies.module.RetrofitModule;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by danilorangel on 10/06/2018.
 */

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;

    @Inject
    Retrofit retrofit;

    private MainContract.View mView;

    public MainPresenter(MainContract.View view) {
        mView = view;
        MoviesApplication.getInstance().getComponent().inject(this);
    }


}
