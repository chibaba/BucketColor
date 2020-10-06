package com.example.colorbucket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class ColorListActivity extends AppCompatActivity {

CardView  red, purple, maroon, royalBlue, accent, yellow, green, white, black, blue, orange, violet, pink, cyan, azure, primaryColor, brown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorlist_main);

        renderView();
        changeOnClick()
    }

    public void renderView() {
        red = findViewById(R.id.Red);
        purple = findViewById(R.id.Purple);
        maroon = findViewById(R.id.Maroon);
        royalBlue = findViewById(R.id.RoyalBlue);
        accent = findViewById(R.id.Accent);
    }
}