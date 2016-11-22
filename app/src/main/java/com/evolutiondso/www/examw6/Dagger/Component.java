package com.evolutiondso.www.examw6.Dagger;

import com.evolutiondso.www.examw6.MainActivity;

import javax.inject.Singleton;

/**
 * Created by Albrtx on 22/11/2016.
 */


@Singleton
@dagger.Component(modules = {MyModule.class})
public interface Component {
    void inject(MainActivity mainActivity);
}
