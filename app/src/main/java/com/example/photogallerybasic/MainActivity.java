package com.example.photogallerybasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    private Button forwardButton;
    private Button backButton;
    private TextView resultText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forwardButton = findViewById(R.id.forwardButton);
        backButton = findViewById(R.id.backButton);
        resultText = findViewById(R.id.resultTextView);
        imageView = findViewById(R.id.imageView);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 99);
        resultText.setText("http://myfile.org/" + Integer.toString(randomNum));

        Glide.with(this).load("https://loremflickr.com/320/240")
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imageView);

        forwardButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

        backButton.setOnClickListener((view) -> finish());
    }
}
