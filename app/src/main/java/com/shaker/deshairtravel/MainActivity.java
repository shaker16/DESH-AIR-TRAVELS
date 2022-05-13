package com.shaker.deshairtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView myWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myWebview = findViewById(R.id.myWebview);

        myWebview.getSettings().setJavaScriptEnabled(true);

        myWebview.loadUrl("https://www.flightexpert.com/");
    }
}