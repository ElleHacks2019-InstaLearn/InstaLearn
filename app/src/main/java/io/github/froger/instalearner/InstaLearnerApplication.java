package io.github.froger.instalearner;

import android.app.Application;

import timber.log.Timber;

public class InstaLearnerApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
