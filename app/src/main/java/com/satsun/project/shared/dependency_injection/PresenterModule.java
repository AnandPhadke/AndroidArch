package com.satsun.project.shared.dependency_injection;

import android.app.Activity;

import com.satsun.project.rest_service.EventBus;
import com.satsun.project.rest_service.RxBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    private Activity activity;
    public PresenterModule(Activity activity) {
        this.activity = activity;
    }

    @Singleton
    @Provides
    EventBus getEventBus() {
        return new RxBus();
    }
}
