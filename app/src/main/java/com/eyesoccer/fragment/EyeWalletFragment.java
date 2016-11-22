package com.eyesoccer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eyesoccer.R;

import butterknife.ButterKnife;

/**
 * Created by ERD on 11/22/2016.
 */

public class EyeWalletFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eye_wallet, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
