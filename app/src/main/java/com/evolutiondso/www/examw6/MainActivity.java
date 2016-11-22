package com.evolutiondso.www.examw6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.evolutiondso.www.examw6.entities.ResultAPI;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "SomeTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Observable<ResultAPI> observable = MyHelper.Factory.getUsers();

        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultAPI>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ResultAPI resultAPI) {

                    }

                });
    }
}