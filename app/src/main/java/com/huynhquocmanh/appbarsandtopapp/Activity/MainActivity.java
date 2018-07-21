package com.huynhquocmanh.appbarsandtopapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.huynhquocmanh.appbarsandtopapp.Fragment.Tab1Fragment;
import com.huynhquocmanh.appbarsandtopapp.Fragment.Tab2Fragment;
import com.huynhquocmanh.appbarsandtopapp.Fragment.Tab3Fragment;
import com.huynhquocmanh.appbarsandtopapp.R;
import com.huynhquocmanh.appbarsandtopapp.SectionsPagerAdapter;
import com.huynhquocmanh.appbarsandtopapp.bottonNavigationViewHelper;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private SectionsPagerAdapter sectionsPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);
        setupViewpager(viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_to_action);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_content_cut_black_24dp);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottonnavigation);
        bottonNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intenthome = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intenthome);
                        break;
                    case R.id.search:
                        Intent intentsearch = new Intent(MainActivity.this, searchActivity.class);
                        startActivity(intentsearch);
                        break;
                    case R.id.book:
                        Intent intentbook = new Intent(MainActivity.this, BookActivity.class);
                        startActivity(intentbook);
                        break;
                    case R.id.add:
                        Intent intentadd = new Intent(MainActivity.this, AddActivity.class);
                        startActivity(intentadd);
                        break;
                    case R.id.person:
                        Intent intentperson = new Intent(MainActivity.this, PersonActivity.class);
                        startActivity(intentperson);
                        break;
                }
                return false;
            }
        });

    }

    private void setupViewpager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addfragment(new Tab1Fragment());
        adapter.addfragment(new Tab2Fragment());
        adapter.addfragment(new Tab3Fragment());
        viewPager.setAdapter(adapter);
    }
}
