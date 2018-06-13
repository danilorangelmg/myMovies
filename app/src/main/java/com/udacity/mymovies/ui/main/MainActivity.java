package com.udacity.mymovies.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.udacity.mymovies.R;
import com.udacity.mymovies.component.DaggerMainComponent;
import com.udacity.mymovies.contract.MainContract;
import com.udacity.mymovies.module.MainModule;
import com.udacity.mymovies.ui.detail.DetailActivity;

import javax.inject.Inject;

/**
 * Created by danilorangel on 17/04/2018.
 */

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().mainModule(new MainModule(this)).build().inject(this);

        final ImageView ivProfile = findViewById(R.id.ivProfile);

        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
// Pass data object in the bundle and populate details activity.
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this,
                                ivProfile,
                                ViewCompat.getTransitionName(ivProfile));
                startActivity(intent, options.toBundle());
            }
        });
    }
}
