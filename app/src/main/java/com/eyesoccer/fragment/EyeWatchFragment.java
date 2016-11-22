package com.eyesoccer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eyesoccer.R;
import com.eyesoccer.adapter.EyeWatchAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.eyesoccer.adapter.EyeWatchAdapter.EYE_WATCH;
import static com.eyesoccer.adapter.EyeWatchAdapter.EYE_WATCH_VIDEO_RECOMMENDED;

/**
 * Created by ERD on 11/22/2016.
 */

public class EyeWatchFragment extends Fragment {
    @BindView(R.id.recycler_eye_watch)RecyclerView mRecyclerView;
    private EyeWatchAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] mDataset = {"29 degrees", "Seahawks 24 - 27 Bengals", "Flash missing, vanishes in crisis", "Half Life 3 announced"};
    private int mDatasetTypes[] = {EYE_WATCH, EYE_WATCH_VIDEO_RECOMMENDED, EYE_WATCH_VIDEO_RECOMMENDED, EYE_WATCH_VIDEO_RECOMMENDED}; //view types

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eye_watch, container, false);
        ButterKnife.bind(this, view);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
//Adapter is created in the last step
        mAdapter = new EyeWatchAdapter(mDataset, mDatasetTypes);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
