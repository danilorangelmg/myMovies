package com.udacity.mymovies.module;

import com.udacity.mymovies.contract.MainContract;
import com.udacity.mymovies.ui.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by danilorangel on 13/06/2018.
 */
@Module
public class MainModule {
    private MainContract.View mView;

    public MainModule(MainContract.View view) {
        mView = view;
    }

    @Provides
    public MainContract.View provideView() {
        return mView;
    }

    @Provides
    public MainContract.Presenter providePresenter(MainContract.View categoryView) {
        return new MainPresenter(categoryView);
    }
}
