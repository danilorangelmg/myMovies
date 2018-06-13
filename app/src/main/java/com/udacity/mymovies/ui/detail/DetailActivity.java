package com.udacity.mymovies.ui.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.udacity.mymovies.R;
import com.udacity.mymovies.contract.DetailContract;

/**
 * Created by danilorangel on 17/04/2018.
 */

public class DetailActivity extends AppCompatActivity implements DetailContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
