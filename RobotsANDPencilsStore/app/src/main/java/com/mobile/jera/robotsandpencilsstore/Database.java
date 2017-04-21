package com.mobile.jera.robotsandpencilsstore;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 *
 * Using Firebase for DB
 */

public class Database {

    private static final String TAG = "FirebaseTAG";

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference dbReference = firebaseDatabase.getReference("comments");

    public void saveComment(Comment comment) {
        dbReference.child("comment").setValue(comment.getText());
    }

    public void getComment() {
        dbReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "comment : " + value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Log.w(TAG, "Failed to read comment from DB.", error.toException());
            }
        });
    }

}
