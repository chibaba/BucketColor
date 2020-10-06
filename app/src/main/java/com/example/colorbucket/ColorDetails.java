package com.example.colorbucket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorDetails extends AppCompatActivity {

    public static final String colorDetails = "description";
    public static final String myColor = "color";
    public static final String urlBrowser = "link";

    Button  moreBtn;
    TextView tvDescription;

    ImageView imageLayout;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_details);

        imageLayout = findViewById(R.id.imageView);
        moreBtn = findViewById(R.id.button);
        tvDescription = findViewById(R.id.textTitle);

        intent = getIntent();
        String infoText = intent.getStringExtra(colorDetails);
        int color = intent.getIntExtra(myColor, 000);

        imageLayout.setBackgroundColor(color);
        moreBtn.setBackgroundColor(color);
        tvDescription.setText(infoText);
        startBrowser();
    }
    private void startBrowser() {
        moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(Intent.ACTION_VIEW);
                String url = intent.getStringExtra(urlBrowser);
                start.setData(Uri.parse(url));
                startActivity(start);
            }
        });
    }
}