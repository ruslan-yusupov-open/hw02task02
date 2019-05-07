package com.example.photogallerybasic;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
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
    private int randomId;

    public MainActivity() {
        super();
        randomId = ThreadLocalRandom.current().nextInt(1, 99);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forwardButton = findViewById(R.id.forwardButton);
        backButton = findViewById(R.id.backButton);
        resultText = findViewById(R.id.resultTextView);
        imageView = findViewById(R.id.imageView);

        resultText.setText("http://myfile.org/" + Integer.toString(randomId));

        Glide.with(this).load("https://loremflickr.com/320/240")
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imageView);

        forwardButton.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

        backButton.setOnClickListener((view) -> finish());

        String methodName = "onCreate";

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
    }


    @Override
    protected void onStart() {
        String methodName = "onStart";

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //  if (textView != null) textView.append("\n" + methodName);
        super.onStart();
    }

    @Override
    protected void onResume() {
        String methodName = "onResume";
        super.onResume();

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //   if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onPause() {
        String methodName = "onPause";
        super.onPause();

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //   if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onStop() {
        String methodName = "onStop";
        super.onStop();

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //  if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onDestroy() {
        String methodName = "onDestroy";
        super.onDestroy();

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //  if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onRestart() {
        String methodName = "onRestart";
        super.onRestart();

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //    if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        String methodName = "onPostCreate";
        super.onPostCreate(savedInstanceState);

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //  if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onPostResume() {
        String methodName = "onPostResume";
        super.onPostResume();

        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //   if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        String methodName = "onKeyDown";
        Log.d("Lifecycle " + Integer.toString(randomId), methodName + " " + keyCode);
        //   if (textView != null) textView.append("\n" + methodName + " " + keyCode);

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        String methodName = "onKeyLongPress";
        Log.d("Lifecycle " + Integer.toString(randomId), methodName + " " + keyCode);
        //    if (textView != null) textView.append("\n" + methodName + " " + keyCode);

        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        String methodName = "onBackPressed";
        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //    if (textView != null) textView.append("\n" + methodName);

        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        String methodName = "onSaveInstanceState";
        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //   if (textView != null) textView.append("\n" + methodName);


        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String methodName = "onRestoreInstanceState";
        Log.d("Lifecycle " + Integer.toString(randomId), methodName);
        //   if (textView != null) textView.append("\n" + methodName);


        super.onRestoreInstanceState(savedInstanceState);
    }
}
