package com.per.misha.common.ModuleBase;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by misha on 16/5/11.
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    public Application proviceApplication() {
        return this.application;
    }

}
