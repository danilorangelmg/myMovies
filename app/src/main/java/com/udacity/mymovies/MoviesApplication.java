package com.udacity.mymovies;

import android.app.Application;

import com.udacity.mymovies.component.DaggerMoviesComponent;
import com.udacity.mymovies.component.MoviesComponent;
import com.udacity.mymovies.module.RetrofitModule;

/**
 * Created by danilorangel on 10/06/2018.
 */

public class MoviesApplication extends Application {

    private MoviesComponent component;
    private static MoviesApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        component = DaggerMoviesComponent.builder().retrofitModule(new RetrofitModule()).build();
    }

    public static MoviesApplication getInstance() {
        return instance;
    }

    public MoviesComponent getComponent() {
        return component;
    }
}
