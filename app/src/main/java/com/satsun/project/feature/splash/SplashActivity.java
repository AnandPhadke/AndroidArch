package com.satsun.project.feature.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.satsun.project.R;
import com.satsun.project.feature.home.HomeActivity;
import com.satsun.project.feature.login.LoginActivity;
import com.satsun.project.feature.temp.screen_capture.MainActivity;

public class SplashActivity extends AppCompatActivity implements SplashViewInterface {

    SplashPresenter splashPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashPresenter = new SplashPresenter();
        splashPresenter.addSplashDelay(this);
    }

    @Override
    public void startActivity() {
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        finish();
    }
}
