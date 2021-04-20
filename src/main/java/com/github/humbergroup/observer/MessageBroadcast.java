package com.github.humbergroup.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Message Broadcast is a message generators which can send message to its registered observers
 *
 * @author faris
 */
public class MessageBroadcast implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void noticeObserver(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
