package com.tds.hello;

public class Greeting {

    private long id;
    private String content;

    public Greeting( long newId, String newContent ) {
        this.id = newId;
        this.content = newContent;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

}
