package com.satsun.project.feature.login;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.satsun.project.R;
import com.satsun.project.shared.dependency_injection.PresenterComponent;
import com.satsun.project.shared.view.activity.PresentedActivity;

public class LoginActivity extends PresentedActivity<LoginPresenter> implements IloginView {

    private static final String TAG = "LoginActivity";
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginPresenter.loginUser();

    }

    @Override
    protected LoginPresenter onCreatePresenter() {
        loginPresenter = new LoginPresenter(this);
        return loginPresenter;
    }

    @Override
    protected void injectPresenter(PresenterComponent presenterComponent, LoginPresenter presenter) {
        LoginComponent loginComponent = DaggerLoginComponent
                .builder()
                .presenterComponent(presenterComponent)
                .loginModule(new LoginModule(this))
                .build();
        loginComponent.inject(loginPresenter);
    }

    @Override
    public void setTempResult(String str) {
        Log.v(TAG,"setTempResult   :  "+str);
    }
}
