package com.satsun.project.feature.home;

import android.os.Bundle;

import com.satsun.project.R;
import com.satsun.project.shared.dependency_injection.PresenterComponent;
import com.satsun.project.shared.view.activity.PresentedActivity;

public class HomeActivity extends PresentedActivity<HomePresenter> {

    private HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    protected HomePresenter onCreatePresenter() {
        presenter = new HomePresenter();
        return presenter;
    }

    @Override
    protected void injectPresenter(PresenterComponent presenterComponent, HomePresenter presenter) {
        HomeComponent homeComponent = DaggerHomeComponent.builder().
                presenterComponent(presenterComponent).
                homeModule(new HomeModule(this)).build();
        homeComponent.inject(presenter);
    }
}
