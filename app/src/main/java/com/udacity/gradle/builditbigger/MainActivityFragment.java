//package com.udacity.gradle.builditbigger;
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import androidx.fragment.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.ProgressBar;
//
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.nanodegree.projects.jokefactory.DisplayJokeActivity;
//
//
///**
// * A placeholder fragment containing a simple view.
// */
//public class MainActivityFragment extends Fragment {
//
//    ProgressBar progressBar = null;
//    public String jokeToShow = null;
//    public boolean gotJoke = false;
//
//    public MainActivityFragment() {
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View root = inflater.inflate(R.layout.fragment_main, container, false);
//
//        // Set onClickListener for the button
//        Button button = (Button) root.findViewById(R.id.joke_btn);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                progressBar.setVisibility(View.VISIBLE);
//                getJoke();
//            }
//        });
//
//        progressBar = (ProgressBar) root.findViewById(R.id.joke_progressbar);
//        progressBar.setVisibility(View.GONE);
//        AdView mAdView = (AdView) root.findViewById(R.id.adView);
//        // Create an ad request. Check logcat output for the hashed device ID to
//        // get test ads on a physical device. e.g.
//        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
//        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build();
//        mAdView.loadAd(adRequest);
//        return root;
//    }
//
//    public void getJoke(){
//        new EndPointAsyncTask().execute(this);
//    }
//
//    public void launchDisplayJokeActivity(){
//        if (!gotJoke) {
//            Context context = getActivity();
//            Intent intent = new Intent(context, DisplayJokeActivity.class);
//            intent.putExtra(context.getString(R.string.joke_envelope), jokeToShow);
//            //Toast.makeText(context, jokeToShow, Toast.LENGTH_LONG).show();
//            context.startActivity(intent);
//            progressBar.setVisibility(View.GONE);
//        }
//    }
//}
