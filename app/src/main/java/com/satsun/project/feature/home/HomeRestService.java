package com.satsun.project.feature.home;

import android.app.Activity;
import android.content.Context;

import com.satsun.project.rest_service.EventBus;
import com.satsun.project.rest_service.RestService;

public class HomeRestService extends RestService{
    private final Context context;
    private final EventBus eventBus;
    HomeRestInterface restInterface;

    public HomeRestService(Context context, EventBus eventBus) {
        super(context,eventBus);
        this.context = context;
        this.eventBus = eventBus;
        restInterface = retrofit.create(HomeRestInterface.class);
    }
}
