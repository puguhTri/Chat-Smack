package com.kapun.kapunchat.model;

//ini object untuk instance contact
public class Contact {

    private String jid;

    public Contact(String jid) {
        this.jid = jid;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }
}
