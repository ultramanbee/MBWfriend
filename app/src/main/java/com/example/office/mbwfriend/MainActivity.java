package com.example.office.mbwfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.office.mbwfriend.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();


        }
    }  //Main Method


}  //Main Class
