package com.satsun.project.feature.login;

import com.satsun.project.shared.dependency_injection.PresenterComponent;
import com.satsun.project.shared.dependency_injection.UserScope;

import dagger.Component;

@UserScope
@Component(dependencies = PresenterComponent.class, modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginPresenter presenter);
}
