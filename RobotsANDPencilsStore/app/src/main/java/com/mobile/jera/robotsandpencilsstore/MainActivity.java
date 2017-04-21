package com.mobile.jera.robotsandpencilsstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText commentInput;
    private Button addButton;
    CommentsLoader loader = new CommentsLoader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        commentInput = (EditText) findViewById(R.id.comment_input);
        addButton = (Button) findViewById(R.id.button_add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addComment(commentInput.getText().toString());
            }
        });
    }

    public void addComment(String commentString) {
        if (commentString.equals("")) {
            commentInput.setError("Comment is invalid");
        }else{
            Comment comment = new Comment(commentString);
            loader.save(comment);
        }
    }

}
