/*
 * @(#)JmpxListener.java	1.2 02/08/21
 *
 * Copyright (c) 1996-2002 Sun Microsystems, Inc.  All rights reserved.
 */

package com.sun.media.codec.video.jmpx;

/**
 * An listener interface to monitor events generated from mpx. 
 */
public interface JmpxListener {

    /**
     * This method is called when an event is generated by a 
     * Jmpx that this listener has registered with.
     *
     * @param event The event generated.
     */
    void jmpxUpdate(JmpxEvent event);
}
