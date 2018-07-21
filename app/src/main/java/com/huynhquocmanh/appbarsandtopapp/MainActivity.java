package com.huynhquocmanh.appbarsandtopapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private SectionsPagerAdapter sectionsPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsPagerAdapter =new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager =  findViewById(R.id.container);
        setupViewpager(viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_to_action);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_content_cut_black_24dp);
    }

    private void setupViewpager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addfragment(new Tab1Fragment());
        adapter.addfragment(new Tab2Fragment());
        adapter.addfragment(new Tab3Fragment());
        viewPager.setAdapter(adapter);
    }
}
