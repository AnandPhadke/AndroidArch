package com.satsun.project.feature.login;

import android.content.Context;

import com.satsun.project.pojo.TempResponse;
import com.satsun.project.rest_service.ApiObserver;
import com.satsun.project.rest_service.CustomObservableTransformer;
import com.satsun.project.rest_service.EventBus;
import com.satsun.project.rest_service.RestService;
import com.satsun.project.utils.Constants;

public class LoginRestService extends RestService {

    LoginRestInterface loginRestInterface;

    public LoginRestService(Context context, EventBus eventBus) {
        super(context, eventBus);
        loginRestInterface = retrofit.create(LoginRestInterface.class);
    }

    public void loginUser() {
        loginRestInterface.getDetails()
        .compose(CustomObservableTransformer.<TempResponse>transformObservable())
        .subscribeWith(new ApiObserver<TempResponse>(eventBus, Constants.REQUEST_CODE.TEMP_LOGIN_REQUEST_CODE));
    }
}
