package com.evolutiondso.www.examw6;

/**
 * Created by Albrtx on 22/11/2016.
 */

import com.evolutiondso.www.examw6.entities.ResultAPI;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import rx.Observable;
import rx.schedulers.Schedulers;


/**
 * Created by jluis on 11/22/16.
 */

public class MyHelper {

    public static final String BASE_URL = "https://randomuser.me/";

    public static class Factory {

        public static Retrofit create() {
            return new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
                    .build();
        }

        public static Observable<ResultAPI> getUsers() {
            Retrofit retrofit = create();
            UserService userService = retrofit.create(UserService.class);
            return userService.getUser();
        }

    }

    public interface UserService {

        @GET("api")
        Observable<ResultAPI> getUser();

    }
}
