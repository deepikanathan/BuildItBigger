package com.nanodegree.projects.jokefactory;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView textview = findViewById(R.id.joke_text);
        String jokeResult = null;
        Intent intent = getIntent();
        jokeResult = intent.getStringExtra(getString(R.string.joke_envelope));

        if (jokeResult != null)
        {
            textview.setText(jokeResult);
        }
        else
        {
            textview.setText("No jokes found yet");
        }

    }
}
