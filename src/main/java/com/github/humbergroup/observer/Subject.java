package com.github.humbergroup.observer;

/**
 * @author Xuelin Shi
 */
public interface Subject {

    /**
     * register observer into subject
     *
     * @param observer observer
     */
    void register(Observer observer);

    /**
     * notify Observer when trigger something
     *
     * @param message message
     */
    void noticeObserver(String message);
}
