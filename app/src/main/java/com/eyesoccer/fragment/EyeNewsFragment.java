package com.eyesoccer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.eyesoccer.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ERD on 11/22/2016.
 */

public class EyeNewsFragment extends Fragment{
    @BindView(R.id.listView_News)ListView listViewNews;
    ArrayAdapter<String> mForecastAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eye_news, container, false);
        ButterKnife.bind(this, view);

        String[] data = {
                "Mon 6/23 - Sunny",
                "Tue 6/24 - Foggy",
                "Wed 6/25 - Cloudy",
                "Thurs 6/26 - Rainy",
                "Fri 6/27 - Foggy",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION",
                "Sun 6/29 - Sunny"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

        mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(), // The current context (this activity)
                        R.layout.list_item_news, // The name of the layout ID.
                        R.id.txt_news_title, // The ID of the textview to populate.
                        weekForecast);

        listViewNews.setAdapter(mForecastAdapter);

        return view;
    }
}
