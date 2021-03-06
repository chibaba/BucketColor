package com.example.colorbucket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ColorListActivity extends AppCompatActivity {

CardView  red, purple, maroon, royalBlue, accent, yellow, green, white, black, blue, orange, violet, pink, cyan, azure, primaryColor, brown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorlist_main);

        renderView();
        changeOnClick();
    }

    public void renderView() {
        red = findViewById(R.id.Red);
        purple = findViewById(R.id.Purple);
        maroon = findViewById(R.id.Maroon);
        royalBlue = findViewById(R.id.RoyalBlue);
        accent = findViewById(R.id.Accent);
        yellow = findViewById(R.id.Yellow);
        green = findViewById(R.id.Green);
        white = findViewById(R.id.White);
        black = findViewById(R.id.Black);
        blue  = findViewById(R.id.Blue);
        orange =  findViewById(R.id.Orange);
        violet =  findViewById(R.id.Violet);
        pink =  findViewById(R.id.Pink);
        cyan =   findViewById(R.id.Cyan);
        azure =   findViewById(R.id.Azure);
        primaryColor =  findViewById(R.id.Primary);
        brown =  findViewById(R.id.Brown);
    }

    public void changeOnClick() {
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorListActivity.this, ColorDetails.class);
                intent.putExtra(ColorDetails.colorDetails, "Green is the color between blue and yellow on the visible spectrum ...");
                intent.putExtra(ColorDetails.myColor, getResources().getColor(R.color.green));
                intent.putExtra(ColorDetails.urlBrowser, "https://en.wikipedia.org/wiki/Green");
                startActivity(intent);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorListActivity.this, ColorDetails.class);
                intent.putExtra(ColorDetails.colorDetails, "Red is the color at the end of the visible spectrum of light, ne...");
                intent.putExtra(ColorDetails.myColor, getResources().getColor(R.color.red));
                intent.putExtra(ColorDetails.urlBrowser, "https://en.wikipedia.org/wiki/Red");
                startActivity(intent);

            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorListActivity.this, ColorDetails.class);
                intent.putExtra(ColorDetails.colorDetails, "Blue is one of the three primary colours of...");
                intent.putExtra(ColorDetails.myColor, getResources().getColor(R.color.blue));
                intent.putExtra(ColorDetails.urlBrowser, "https://en.wikipedia.org/wiki/blue");
                startActivity(intent);
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorListActivity.this, ColorDetails.class);
                intent.putExtra(ColorDetails.colorDetails, "Purple refers to any of a variety of colors with hue between red and blue...");
                intent.putExtra(ColorDetails.myColor, getResources().getColor(R.color.purple));
                intent.putExtra(ColorDetails.urlBrowser, "https://en.wikipedia.org/wiki/purple");
                startActivity(intent);

            }
        });
        accent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorListActivity.this, ColorDetails.class);
                intent.putExtra(ColorDetails.colorDetails, "Accent does not exist. You can ask for it to be created, but consider checking ..");
                intent.putExtra(ColorDetails.myColor, getResources().getColor(R.color.Accent));
                intent.putExtra(ColorDetails.urlBrowser, "https://en.wikipedia.org/wiki/accent");
                startActivity(intent);
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColorListActivity.this, ColorDetails.class);
                intent.putExtra(ColorDetails.colorDetails, "White is the lightest color and is achromatic (having no hue). It is the color of fresh snow.." );
                intent.putExtra(ColorDetails.myColor, getResources().getColor(R.color.white));
                intent.putExtra((ColorDetails.urlBrowser, "http://en.wikipedia.org/wiki/white"));
                startActivity(intent);
            }
        });
    }
}