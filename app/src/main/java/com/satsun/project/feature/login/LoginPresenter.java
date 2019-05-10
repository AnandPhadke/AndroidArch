package com.satsun.project.feature.login;

import android.util.Log;
import android.widget.Toast;

import com.satsun.project.R;
import com.satsun.project.pojo.TempResponse;
import com.satsun.project.rest_service.Event;
import com.satsun.project.rest_service.EventBus;
import com.satsun.project.rest_service.EventSubscriber;
import com.satsun.project.shared.presenter.PresenterStub;
import com.satsun.project.utils.Constants;

import javax.inject.Inject;

public class LoginPresenter extends PresenterStub implements EventSubscriber {

    @Inject
    LoginRestService loginRestService;

    @Inject
    EventBus eventBus;

    IloginView iloginView;

    public LoginPresenter(IloginView iloginView) {
        this.iloginView = iloginView;
    }


    public void loginUser() {
        loginRestService.loginUser();
    }

    @Override
    public void onEvent(Event event) {
        switch (event.getType()){
            case Event.TYPE_SUCCESS:
                Log.v("onEvent", "Success");
                if(event.getRequestCode() == Constants.REQUEST_CODE.TEMP_LOGIN_REQUEST_CODE){
                    iloginView.setTempResult(((TempResponse)event.getResult()).getAa());
                }
                break;
            case Event.TYPE_COMPLETION:
                break;
            case Event.TYPE_ERROR:
                break;
        }
    }

    @Override
    public void onPostCreate() {
        eventBus.subscribe(this);
    }

    @Override
    public void onDestroy() {
        eventBus.unsubsribe();
    }

}
