package com.eyesoccer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.eyesoccer.adapter.ClubsAdapter;
import com.eyesoccer.model.AndroidVersion;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClubsActivity extends AppCompatActivity {
    public static final int SPAN_COUNT = 3;
    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.recycler_club)RecyclerView recyclerView;

    private final String android_version_names[] = {
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub",
            "Nama Klub"
    };

    private final String android_image_urls[] = {
            "http://api.learn2crack.com/android/images/donut.png",
            "http://api.learn2crack.com/android/images/eclair.png",
            "http://api.learn2crack.com/android/images/froyo.png",
            "http://api.learn2crack.com/android/images/ginger.png",
            "http://api.learn2crack.com/android/images/honey.png",
            "http://api.learn2crack.com/android/images/icecream.png",
            "http://api.learn2crack.com/android/images/jellybean.png",
            "http://api.learn2crack.com/android/images/kitkat.png",
            "http://api.learn2crack.com/android/images/ginger.png",
            "http://api.learn2crack.com/android/images/honey.png",
            "http://api.learn2crack.com/android/images/icecream.png",
            "http://api.learn2crack.com/android/images/jellybean.png",
            "http://api.learn2crack.com/android/images/kitkat.png",
            "http://api.learn2crack.com/android/images/lollipop.png",
            "http://api.learn2crack.com/android/images/marshmallow.png"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        ButterKnife.bind(this);

        setupToolbar();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(
                getApplicationContext(),
                SPAN_COUNT,
                LinearLayoutManager.VERTICAL,
                false);

        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList<AndroidVersion> androidVersions = prepareData();
        ClubsAdapter adapter = new ClubsAdapter(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapter);

    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar() == null) {
            throw new IllegalStateException("Activity must implement toolbar");
        }
    }
    
    private ArrayList<AndroidVersion> prepareData(){

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
}
