package com.example.charl.hexagonwellness;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Calendar extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        final ImageButton calendarButton = findViewById(R.id.btn_calendar);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent calIntent = new Intent(getApplicationContext(), Calendar.class);
                startActivity(calIntent);
                finish();
            }
        });

        final ImageButton bookButton = findViewById(R.id.btn_book_massage);
        bookButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bookIntent = new Intent(getApplicationContext(), BookMassage.class);
                startActivity(bookIntent);
                finish();
            }
        });
        final ImageButton hourButton = findViewById(R.id.btn_hour);
        hourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent hourIntent = new Intent(getApplicationContext(), Hours.class);
                startActivity(hourIntent);
                finish();
            }
        });
        final ImageButton adviceButton = findViewById(R.id.btn_advice);
        adviceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent blogIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://trueblue.intergraph.com/wellness/"));
                startActivity(blogIntent);
            }
        });
        final ImageButton recipeButton = findViewById(R.id.btn_recipe);
        recipeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent recipesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://trueblue.intergraph.com/wellness/recipes.asp"));
                startActivity(recipesIntent);
            }
        });
    }
}
