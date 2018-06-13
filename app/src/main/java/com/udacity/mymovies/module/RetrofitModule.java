package com.udacity.mymovies.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by danilorangel on 12/06/2018.
 */
@Module
public class RetrofitModule {

    public static final String BASE_URL = "http://localhost:8080";

    @Singleton
    @Provides
    Retrofit provideRetrofit() {
        return new Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }



}
