package com.mobile.jera.robotsandpencilsstore;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 *Comments loader
 */

public class CommentsLoader {
    Database db = new Database();
    Set<Comment> commentsList = new Set<Comment>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Comment> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(Comment comment) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Comment> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    public Set<Comment> save(Comment comment) {
        commentsList.add(comment);
        db.saveComment(comment);
        return commentsList;
    }

    public Comment getSingleComment(String commentId) {
        return new Comment();
    }

    public Set<Comment> getCommentList() {
        return commentsList;
    }
}
