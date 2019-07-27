package com.example.charl.hexagonwellness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Recipes extends NavigationActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        super.onCreateDrawer();
    }
}
