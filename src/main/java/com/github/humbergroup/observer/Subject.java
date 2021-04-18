package com.github.humbergroup.observer;

public interface Subject {

    void register(Observer observer);

    void noticeObserver(String message);
}
