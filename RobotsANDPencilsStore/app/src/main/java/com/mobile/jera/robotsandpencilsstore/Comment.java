package com.mobile.jera.robotsandpencilsstore;

/**
 * Comment Model
 */

public class Comment {

    String commentId;
    String content;

    public Comment() {
    }
    public Comment(String commentText) {
        content = commentText;
    }

    public String getId() {
        return commentId;
    }

    public void setId(String id) {
        commentId = id;
    }

    public String getText() {
        return content;
    }

    public void setText(String text) {
        content = text;
    }
}
