package com.example.charl.hexagonwellness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Hours extends NavigationActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hours);
        super.onCreateDrawer();
    }
}