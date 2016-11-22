package com.eyesoccer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationViewPager;
import com.eyesoccer.fragment.EyeNewsFragment;
import com.eyesoccer.fragment.EyeWalletFragment;
import com.eyesoccer.fragment.EyeWatchFragment;
import com.eyesoccer.fragment.HomeFragment;
import com.eyesoccer.fragment.RadialFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.view_pager)AHBottomNavigationViewPager viewPager;
    @BindView(R.id.bottom_navigation)AHBottomNavigation bottomNavigation;

    private MainPagerAdapter mPagerAdapter;
    private AHBottomNavigationAdapter navigationAdapter;
    private ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();
    private boolean useMenuResource = true;
    private int[] tabColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupToolbar();

        initUI();

        viewPager = (AHBottomNavigationViewPager) findViewById(R.id.view_pager);
        mPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mPagerAdapter);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);

        if (getSupportActionBar() == null) {
            throw new IllegalStateException("Activity must implement toolbar");
        }
    }

    private void initUI() {
        if (useMenuResource) {
            tabColors = getApplicationContext().getResources().getIntArray(R.array.tab_colors);
            navigationAdapter = new AHBottomNavigationAdapter(this, R.menu.bottom_navigation_menu_5);
            navigationAdapter.setupWithBottomNavigation(bottomNavigation, tabColors);

            bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));
            bottomNavigation.setAccentColor(Color.parseColor("#FF9800"));
            bottomNavigation.setInactiveColor(Color.parseColor("#999999"));
            bottomNavigation.setForceTint(true);
            bottomNavigation.setForceTitlesDisplay(true);
        }

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                if (position == 0){
                    HomeFragment homeFragment = new HomeFragment();
                    Bundle arguments = new Bundle();
                    //                    arguments.putString("Id", txtId);
                    homeFragment.setArguments(arguments);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.root_frame, homeFragment, "homeFragment")
                            .commit();
                }
                if (position == 1) {
                    EyeWatchFragment eyeWatchFragment = new EyeWatchFragment();
                    Bundle arguments = new Bundle();
                    //                    arguments.putString("Id", txtId);
                    eyeWatchFragment.setArguments(arguments);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.root_frame, eyeWatchFragment, "eyeWatchFragment")
                            .commit();
                }
                if (position == 2){
                    RadialFragment radialFragment = new RadialFragment();
                    Bundle arguments = new Bundle();
                    //                    arguments.putString("Id", txtId);
                    radialFragment.setArguments(arguments);
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.root_frame, radialFragment, "radialFragment")
                            .commit();
                }
                if (position == 3){
                    EyeNewsFragment eyeNewsFragment = new EyeNewsFragment();
                    Bundle arguments = new Bundle();
                    //                    arguments.putString("Id", txtId);
                    eyeNewsFragment.setArguments(arguments);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.root_frame, eyeNewsFragment, "eyeNewsFragment")
                            .commit();
                }
                if (position == 4){
                    EyeWalletFragment eyeWalletFragment = new EyeWalletFragment();
                    Bundle arguments = new Bundle();
                    //                    arguments.putString("Id", txtId);
                    eyeWalletFragment.setArguments(arguments);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.root_frame, eyeWalletFragment, "eyeWalletFragment")
                            .commit();
                } else {
                    // TODO Generated content
                }
                return true;
            }
        });
    }

}
