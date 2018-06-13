package com.udacity.mymovies.component;

import com.udacity.mymovies.module.MainModule;
import com.udacity.mymovies.scope.ActivityScope;
import com.udacity.mymovies.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by danilorangel on 13/06/2018.
 */

@ActivityScope
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
