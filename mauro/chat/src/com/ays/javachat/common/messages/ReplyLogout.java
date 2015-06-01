package com.ays.javachat.common.messages;

import java.io.Serializable;

/**
 * Is ising by server to notify client about request results ( see parent class ) *
 */
public class ReplyLogout extends Logout implements Serializable {
    /**
     * If Status == 0, operation completed successfully *
     */
    public int Status;

    public ReplyLogout(int aStatus) {
        super();
        Status = aStatus;
    }
}
