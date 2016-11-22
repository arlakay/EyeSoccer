package com.eyesoccer.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eyesoccer.ClubsActivity;
import com.eyesoccer.R;
import com.eyesoccer.SupportersActivity;
import com.eyesoccer.WasitActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ERD on 11/22/2016.
 */

public class RadialFragment extends Fragment {
    @BindView(R.id.fab_clubs)FloatingActionButton club;
    @BindView(R.id.fab_wasit)FloatingActionButton wasit;
    @BindView(R.id.fab_supporters)FloatingActionButton suppoter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_radial, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.fab_clubs)
    public void club(View view) {
        Intent i = new Intent(getActivity(), ClubsActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.fab_wasit)
    public void wasit(View view) {
        Intent i = new Intent(getActivity(), WasitActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.fab_supporters)
    public void supporter(View view) {
        Intent i = new Intent(getActivity(), SupportersActivity.class);
        startActivity(i);
    }

}
