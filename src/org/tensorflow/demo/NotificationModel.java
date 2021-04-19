package org.tensorflow.demo;

import java.io.Serializable;

public class NotificationModel implements Serializable
{
    String type;
    int userId;
    int postId;
    String text;
    NotificationModel(String type, int userId, int postId, String text)
    {
        this.type = type;
        this.userId = userId;
        this.postId = postId;
        this.text = text;
    }
}
