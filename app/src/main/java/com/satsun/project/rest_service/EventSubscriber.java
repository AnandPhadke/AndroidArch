package com.satsun.project.rest_service;

public interface EventSubscriber {
    void onEvent(Event event);
}
