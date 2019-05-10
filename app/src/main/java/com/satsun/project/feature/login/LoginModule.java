package com.satsun.project.feature.login;

import android.app.Activity;

import com.satsun.project.rest_service.EventBus;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {
    private Activity activity;

    public LoginModule(Activity activity){
        this.activity = activity;
    }

    @Provides
    LoginRestService getLoginRestService(EventBus eventBus){
        return new LoginRestService(activity, eventBus);
    }
}
