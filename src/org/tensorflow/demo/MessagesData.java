package org.tensorflow.demo;

public class MessagesData {
    private String heading, body;
    public MessagesData(String heading, String body) {
        this.heading = heading;
        this.body = body;
    }

    public String getHeading(){
        return heading;
    }

    public String getBody() {
        return body;
    }
}
