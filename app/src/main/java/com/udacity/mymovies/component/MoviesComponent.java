package com.udacity.mymovies.component;

import com.udacity.mymovies.module.RetrofitModule;
import com.udacity.mymovies.ui.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by danilorangel on 12/06/2018.
 */

@Singleton
@Component(modules = {RetrofitModule.class})
public interface MoviesComponent {
    void inject(MainPresenter mainPresenter);

}
