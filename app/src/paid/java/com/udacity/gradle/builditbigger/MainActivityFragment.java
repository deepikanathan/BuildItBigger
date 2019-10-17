package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.nanodegree.projects.jokefactory.DisplayJokeActivity;


public class MainActivityFragment extends Fragment {

    ProgressBar progressBar = null;
    public String jokeToShow = null;
    public boolean gotJoke = false;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button button = (Button) root.findViewById(R.id.joke_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                getJoke();
            }
        });

        progressBar = (ProgressBar) root.findViewById(R.id.joke_progressbar);
        progressBar.setVisibility(View.GONE);
        return root;
    }

    public void getJoke(){
        new EndPointAsyncTask().execute(this);
    }

    public void launchDisplayJokeActivity(){
        if (!gotJoke) {
            Context context = getActivity();
            Intent intent = new Intent(context, DisplayJokeActivity.class);
            intent.putExtra(context.getString(R.string.joke_envelope), jokeToShow);
            context.startActivity(intent);
            progressBar.setVisibility(View.GONE);
        }
    }
}
