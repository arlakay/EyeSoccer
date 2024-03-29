package com.eyesoccer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ERD on 11/11/2016.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {
    static final int NUM_ITEMS = 1;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new RootFragment();
        else
            return new RootFragment();
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
