package com.evolutiondso.www.examw6.Dagger;

import android.content.Context;

import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Albrtx on 22/11/2016.
 */
@MyModule
public class MyModule {
    private Context context;

    private static final String BASE_URL = "https://randomuser.me/";

    public MyModule(Context context) {
        this.context = context;
    }

    @Provides
    public Retrofit provideRetroFit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    @Provides
    public OkHttpClient provideOkHTTP(){
        return new OkHttpClient();
    }

}
