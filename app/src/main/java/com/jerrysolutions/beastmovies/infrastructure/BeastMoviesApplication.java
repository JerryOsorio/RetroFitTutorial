package com.jerrysolutions.beastmovies.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by Jerry on 5/19/2017.
 */

public class BeastMoviesApplication extends Application {
    private Bus bus;

    public BeastMoviesApplication(){
        bus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Bus getBus() {
        return bus;
    }
}
