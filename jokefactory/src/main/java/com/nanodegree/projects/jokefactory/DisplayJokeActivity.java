package com.nanodegree.projects.jokefactory;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView textview = findViewById(R.id.joke_text);
        Intent intent = getIntent();
        String jokeResult = intent.getStringExtra(getString(R.string.joke_envelope));

        if (!TextUtils.isEmpty(jokeResult))
        {
            textview.setText(jokeResult);
        }
        else
        {
            textview.setText(R.string.joke_unavailable);
        }

    }
}
