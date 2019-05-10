package com.satsun.project.feature.home;

import com.satsun.project.shared.dependency_injection.PresenterComponent;
import com.satsun.project.shared.dependency_injection.UserScope;

import dagger.Component;

@UserScope
@Component(dependencies = PresenterComponent.class, modules = HomeModule.class)
public interface HomeComponent {
    void inject (HomePresenter presenter);
}
