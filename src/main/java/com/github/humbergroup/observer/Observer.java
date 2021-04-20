package com.github.humbergroup.observer;

/**
 * @author faris
 */
public interface Observer {

    /**
     * receive message from Subject
     *
     * @param message message
     * @see Subject
     */
    void update(String message);
}
