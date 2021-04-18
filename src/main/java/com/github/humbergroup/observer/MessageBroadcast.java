package com.github.humbergroup.observer;

import java.util.List;

public class MessageBroadcast implements Subject {

    private List<Observer> observers;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void noticeObserver(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}