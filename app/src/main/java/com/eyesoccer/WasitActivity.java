package com.eyesoccer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WasitActivity extends AppCompatActivity {
    @BindView(R.id.listView_wasit)ListView listView_wasit;
    ArrayAdapter<String> mForecastAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wasit);
        ButterKnife.bind(this);

        String[] data = {
                "Nama",
                "Nama",
                "Nama",
                "Nama",
                "Nama",
                "Nama",
                "Nama",
                "Nama",
                "Nama"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));


        // Now that we have some dummy forecast data, create an ArrayAdapter.
        // The ArrayAdapter will take data from a source (like our dummy forecast) and
        // use it to populate the ListView it's attached to.
        mForecastAdapter =
                new ArrayAdapter<String>(
                        WasitActivity.this, // The current context (this activity)
                        R.layout.list_item_wasit, // The name of the layout ID.
                        R.id.txt_nama_wasit, // The ID of the textview to populate.
                        weekForecast);

        listView_wasit.setAdapter(mForecastAdapter);

    }
}
