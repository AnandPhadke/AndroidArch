package com.satsun.project.shared.dependency_injection;

import com.satsun.project.rest_service.EventBus;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    EventBus getEventBus();
}
