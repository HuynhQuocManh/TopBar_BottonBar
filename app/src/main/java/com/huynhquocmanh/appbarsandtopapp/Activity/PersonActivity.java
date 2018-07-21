package com.huynhquocmanh.appbarsandtopapp.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.huynhquocmanh.appbarsandtopapp.R;
import com.huynhquocmanh.appbarsandtopapp.bottonNavigationViewHelper;

public class PersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottonnavigation);
        bottonNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Intent intenthome = new Intent(PersonActivity.this,MainActivity.class);
                        startActivity(intenthome);
                        break;
                    case R.id.search:
                        Intent intentsearch = new Intent(PersonActivity.this,searchActivity.class);
                        startActivity(intentsearch);
                        break;
                    case R.id.book:
                        Intent intentbook = new Intent(PersonActivity.this,BookActivity.class);
                        startActivity(intentbook);
                        break;
                    case R.id.add:
                        Intent intentadd = new Intent(PersonActivity.this,AddActivity.class);
                        startActivity(intentadd);
                        break;
                    case R.id.person:
                        Intent intentperson = new Intent(PersonActivity.this,PersonActivity.class);
                        startActivity(intentperson);
                        break;
                }
                return false;
            }
        });
    }
}
