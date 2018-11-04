package com.example.rifqiardian.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        String title = getResources().getString(R.string.profile);
        setActionBarTitle(title);
    }
    
    private void setActionBarTitle(String title){

        getSupportActionBar().setTitle(title);
    }
}
